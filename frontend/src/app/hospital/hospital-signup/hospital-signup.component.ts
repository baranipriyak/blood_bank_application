import { Component } from '@angular/core';
import { HospitalRequest } from '../../dto/hospital-request';
import { User } from '../../dao/user';
import { Address } from '../../dao/address';
import { Hospital } from '../../dao/hospital';
import { ActivatedRoute, Router } from '@angular/router';
import { HospitalService } from '../../services/hospital.service';
import { Document } from '../../dao/document';

@Component({
  selector: 'app-hospital-signup',
  standalone: false,
  
  templateUrl: './hospital-signup.component.html',
  styleUrl: './hospital-signup.component.css'
})
export class HospitalSignupComponent {
  hospitalRequest:HospitalRequest;
  showPassword: boolean = false;
  usersReque = {
     user: {
       password: ''
     }
   };

  constructor(private activatedRoute:ActivatedRoute,private hospitalService:HospitalService,private router:Router ){
    this.hospitalRequest= new HospitalRequest(new Hospital(0,'', '', '','hospital'), 
    new User(0,'','','hospital','','Pending'), 
    new Address(0,'', '', '', ''),
    new Document(0,'','','','','','','',''));
  }
  ngOnInit(){
  }
  saveHospital(){
    console.log(this.hospitalRequest)
    this.hospitalService.saveHospital(this.hospitalRequest=new HospitalRequest(this.hospitalRequest.hospital,this.hospitalRequest.user,this.hospitalRequest.address,this.hospitalRequest.document)).subscribe(
      response=>{
        //this.hospitalRequest=response;
        console.log(response);
        alert("Hospital saved successfully!");
        this.router.navigate(['login'])

      },
      error => {
        console.error('Error saving hospital:', error);
        
        alert('Allready Register go to login.');
      },
    )

}
}
