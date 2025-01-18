import { Component } from '@angular/core';
import { HospitalService } from '../../services/hospital.service';
import { ActivatedRoute, Router } from '@angular/router';
import { BloodbankService } from '../../services/bloodbank.service';
import { User } from '../../dao/user';
import emailjs from '@emailjs/browser';

@Component({
  selector: 'app-view-bloodbank',
  standalone: false,
  
  templateUrl: './view-bloodbank.component.html',
  styleUrl: './view-bloodbank.component.css'
})
export class ViewBloodbankComponent {
  bloodBankCenter:any;
  bloodbankid:number=0;
  user:any;
  status:string="";
  userid:number=0;
  // user1:User;
  message:string="";
  name:string="";
  email:string="";

  constructor(private bloodbankService:BloodbankService,private activatedRoute:ActivatedRoute,private router:Router){
    // this.user1 = new User(0,"","","","","")
  }

  ngOnInit(){
    this.bloodbankid=this.activatedRoute.snapshot.params['bloodbankid'];

    this.bloodbankService.getBloodbankById(this.bloodbankid).subscribe(
      response=>{
        this.bloodBankCenter=response;
        this.name=this.bloodBankCenter.bloodBankcentername;
        this.email=this.bloodBankCenter.bloodbankemail;
        this.userid=this.bloodBankCenter.user.userid
      }
    )
  }

  accptedBloodbank(){
    this.status="Accepted"
    this.bloodbankService.acceptedBloodbank(this.userid,this.status).subscribe(
      response=>{
        this.sendMessage(this.status);
        this.router.navigate(['admin/listofbloodbanks'])
      }
    )
  }
  rejectBloodbank(){
    
    const message = prompt('Please enter the reason for rejection:');
    this.status="Rejected"
    this.message=String(message);
      this.bloodbankService.deleteBloodbankById(this.bloodBankCenter.bloodbankid).subscribe(
        response=>{
          this.sendMessage(this.status)
          this.router.navigate(['admin/listofbloodbanks'])
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
