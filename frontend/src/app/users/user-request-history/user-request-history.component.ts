import { Component } from '@angular/core';
import { UserBloodRequestComponent } from '../../user-blood-request/user-blood-request.component';
import { UsersbloodrequestService } from '../../services/usersbloodrequest.service';
import { Router } from '@angular/router';
import { Usersbloodrequest } from '../../dao/usersbloodrequest';
import { BloodavailabilityService } from '../../services/bloodavailability.service';

@Component({
  selector: 'app-user-request-history',
  standalone: false,
  
  templateUrl: './user-request-history.component.html',
  styleUrl: './user-request-history.component.css'
})
export class UserRequestHistoryComponent {

  userBloodRequest:Usersbloodrequest[]=[];
  userid:number=0;
  blood:any;
  bloodavailability:any;
  bloodavailabilityid:number=0;
  bloodCounts:any[]=[];

  constructor(private usersBloodRequestService:UsersbloodrequestService,private router:Router,private bloodAvailabilityService:BloodavailabilityService){
    this.userid = Number(sessionStorage.getItem('userid'))

  }
  ngOnInit(){
    this.usersBloodRequestService.getBloodRequestById(this.userid).subscribe(
      response=>{
        this.userBloodRequest=response;
      }
    )
  }
  ReceivedBlood(requestid:number,acceptorrole:string,bloodgroup:string,acceptoruserid:number,requiredunit:number){
    if(acceptorrole == "blood bank"){
      this.bloodAvailabilityService.getBloodAvailabilityById(acceptoruserid).subscribe(
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
    this.usersBloodRequestService.ReceivedBlood(requestid,"Received").subscribe(
      response=>{
        this.userBloodRequest=response;
        alert("Received")
        if(acceptorrole == "blood bank"){
          this.bloodCounts.forEach(element => {
            if(element.group == bloodgroup){
              if(element.count >this.userBloodRequest){}
                  const change_colunm : Record<string,string>= {
                    "A+":"a_plus",
                    "A-":"a_minus",
                    "B+":"b_plus",
                    "B-":"b_minus",
                    "AB+":"ab_plus",
                    "AB-":"ab_minus",
                    "O+":"o_plus",
                    "O-":"o_minus",
                    "A1+":"a1_plus",
                    "A1-":"a1_minus",
                    "A2+":"a2_plus",
                    "A2-":"a2_minus",
                    "A1B+":"a1b_plus",
                    "A1B-":"a1b_minus",
                    "A2B+":"a2b_plus",
                    "A2B-":"a2b_minus",
                    "Oh+":"oh_minus",
                    "Rh-":"rh_minus",
                  }
  
                  const blood_group = change_colunm[bloodgroup];
                  this.blood=element.count-requiredunit;
                  this.bloodavailability={[blood_group] :this.blood}
                  console.log("blood",this.bloodavailability)
                  this.bloodAvailabilityService.updateBloodAvailability(this.bloodavailabilityid,this.bloodavailability).subscribe(
                    response=>{
                      this.bloodavailability=response;
                    }
                  )
                  
                }
                
            }

        )
          
          }
        
        }
      )
    }

  notReceivedBlood(requestid:number){
    this.usersBloodRequestService.notReceivedBlood(requestid,"NotReceived").subscribe(
      response=>{
        this.userBloodRequest=response;
        alert("Not Received")
      }
    )
  }

}
