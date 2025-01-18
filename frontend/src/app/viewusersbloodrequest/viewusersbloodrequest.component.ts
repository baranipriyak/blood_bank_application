import { Component } from '@angular/core';
import { Usersbloodrequest } from '../dao/usersbloodrequest';
import { UsersbloodrequestService } from '../services/usersbloodrequest.service';
import { DatePipe } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { UsersService } from '../services/users.service';
import { BloodavailabilityService } from '../services/bloodavailability.service';

@Component({
  selector: 'app-viewusersbloodrequest',
  standalone: false,
  
  templateUrl: './viewusersbloodrequest.component.html',
  styleUrl: './viewusersbloodrequest.component.css'
})
export class ViewusersbloodrequestComponent {
  usersBloodRequest:Usersbloodrequest[]=[];
  acceptoruserid:number=0;
  acceptorrole:String="";
  accept:string=""
  acceptordetails:any;
  bloodavailability:any;
  bloodCounts:any[]=[];
  count:number=0;
  blood:any;
  bloodavailabilityid:number=0;

  constructor(private usersBloodrequestService:UsersbloodrequestService,private activatedRoute:ActivatedRoute,private usersService:UsersService,private bloodAvailabilityService:BloodavailabilityService){
    this.acceptoruserid=Number(sessionStorage.getItem('userid'))
    this.acceptorrole=String(sessionStorage.getItem('role'))
    if(this.acceptorrole== "user"){
      this.usersService.getUsersByUserId(this.acceptoruserid).subscribe(
        response=>{
          this.acceptordetails=response;
          
          
        }
      )
    }
    if(this.acceptorrole == "blood bank"){
      this.bloodAvailabilityService.getBloodAvailabilityById(this.acceptoruserid).subscribe(
        response=>{
          this.bloodavailability=response;
          this.bloodavailabilityid=this.bloodavailability.bloodavailabilityid;
            this.bloodCounts = [
              { group: 'A+', count: this.bloodavailability.a_plus },
                    { group: 'A-', count: this.bloodavailability.a_minus },
                    { group: 'B+', count: this.bloodavailability.b_plus },
                    { group: 'B-', count: this.bloodavailability.b_minus },
                    { group: 'AB+', count: this.bloodavailability.ab_plus },
                    { group: 'AB-', count: this.bloodavailability.ab_minus },
                    { group: 'O+', count: this.bloodavailability.o_plus },
                    { group: 'O-', count: this.bloodavailability.o_minus },
                    { group: 'A1+', count: this.bloodavailability.a1_plus },
                    { group: 'A1-', count: this.bloodavailability.a1_minus },
                    { group: 'A2+', count: this.bloodavailability.a2_plus },
                    { group: 'A2-', count: this.bloodavailability.a2_minus },
                    { group: 'A1B+', count: this.bloodavailability.a1b_plus },
                    { group: 'A1B-', count: this.bloodavailability.a1b_minus },
                    { group: 'A2B+', count: this.bloodavailability.a2b_plus },
                    { group: 'A2B-', count: this.bloodavailability.a2b_minus },
                    { group: 'Oh', count: this.bloodavailability.oh_minus },
                    { group: 'Rh -', count: this.bloodavailability.rh_minus },
                  ];

                }
                )
              

          }
        }
    
  

  ngOnInit(){
    this.usersBloodrequestService.getAllBloodRequests().subscribe(
      response=>{
        this.usersBloodRequest=response;
      }
    )
  }
  acceptRequest(requestid:number,bloodgroup:string,requriedunit:number){
    if(this.acceptorrole=="user"){
      if(bloodgroup == this.acceptordetails.bloodgroup){
        if(this.acceptordetails.usersdisease == null){
          this.usersBloodrequestService.acceptRequest(requestid,this.acceptoruserid,this.acceptorrole).subscribe(
            response=>{
              this.accept=response;
              alert("Accepted Successfully")
            }
          )
        }else{
          alert("you have a "+this.acceptordetails.usersdisease+". so doesn't accept the blood request")
        }
        
      }
      else if(bloodgroup != this.acceptordetails.bloodgroup){
        alert("Your blood group mismatch")
      }
      
    }
    if(this.acceptorrole == "blood bank"){
      this.bloodCounts.forEach(element => {
        if(element.group == bloodgroup){
          if(element.count >= requriedunit ){
            this.usersBloodrequestService.acceptRequest(requestid,this.acceptoruserid,this.acceptorrole).subscribe(
              response=>{
                this.accept=response;
                alert("Accepted Blood request")
                
              }
              )
            
          }
          else{
            console.log(bloodgroup)
            alert("The blood count is insufficient.")
          }
        }
        
      });
    }
    
    
  }

}
