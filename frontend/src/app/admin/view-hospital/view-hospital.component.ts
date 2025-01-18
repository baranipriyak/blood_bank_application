import { Component } from '@angular/core';
import { HospitalService } from '../../services/hospital.service';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { User } from '../../dao/user';
import emailjs from '@emailjs/browser';

@Component({
  selector: 'app-view-hospital',
  standalone: false,
  
  templateUrl: './view-hospital.component.html',
  styleUrl: './view-hospital.component.css'
})
export class ViewHospitalComponent {
  hospital:any;
  user:any;
  hospitalid:number=0;
  status:string="";
  userid:number=0;
  // user1:User;
  message:string="";
  name:string="";
  email:string="";

  constructor(private hospitalService:HospitalService,private activatedRoute:ActivatedRoute,private router:Router,private userService:UserService){
    // this.user1=new User(0,"","","","","");
  }

  ngOnInit(){
    this.hospitalid = this.activatedRoute.snapshot.params['hospitalid'];
    // const useridString=sessionStorage.getItem('userid');
    // this.userid=Number(useridString)

    this.hospitalService.getHospitalById(this.hospitalid).subscribe(
      response=>{
        this.hospital=response;
        this.name=this.hospital.hospitalname;
        this.email=this.hospital.hospitalemail;
        // this.status=response.status;
        this.userid=this.hospital.user.userid
        console.log(this.userid)
        // this.getUser()
      }
    )
    // console.log(this.userid)
    
    
  }

  // getUser(){
  //   this.userService.getUserById(this.userid).subscribe(
  //     response=>{
  //       this.user1=response;
  //     }
  //   )
  // }

  accptedHospital(){
    this.status="Accepted"
    this.hospitalService.acceptedHospital(this.userid,this.status).subscribe(
      response=>{
        this.sendMessage(this.status);
        this.router.navigate(['admin/listofhospitals'])
      }
    )
  }
  rejectHospital(){
    
    const message = prompt('Please enter the reason for rejection:');
    this.status="Rejected"
    this.message=String(message);
      this.hospitalService.deleteHospitalById(this.hospital.hospitalid).subscribe(
        response=>{
          this.sendMessage(this.status);
          this.router.navigate(['admin/listofhospitals'])
        }
      )
  }
  sendMessage(status:string){
    if(status==="Accepted"){
      emailjs.init("qrhdmq1fw7fc8nz0m")
  emailjs.send("service_p1poim2","template_dur51xh",{
    to_name: this.name,
    reply_to: this.email,
    }).then(
      (response) => {
        console.log('SUCCESS!', response.status, response.text);
      },
      (err) => {
        console.log('FAILED...', err);
      },
    )
}

    if(status==="Rejected"){
      emailjs.init("qrhdmq1fw7fc8nz0m")
      emailjs.send("service_p1poim2","template_acz5hm6",{
        to_name: this.name,
        message: this.message,
        reply_to: this.email,
        })
        .then(
          (response) => {
            console.log('SUCCESS!', response.status, response.text);
          },
          (err) => {
            console.log('FAILED...', err);
          },
        )

    }

  }


}
