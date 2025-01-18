import { Component } from '@angular/core';
import { BloodbankService } from '../../services/bloodbank.service';
import { BloodbankRequest } from '../../dto/bloodbank-request';
import { Router } from '@angular/router';
import { Bloodbankcenter } from '../../dao/bloodbankcenter';
import { User } from '../../dao/user';
import { Address } from '../../dao/address';
import { Document } from '../../dao/document';
import { Bloodavailability } from '../../dao/bloodavailability';

@Component({
  selector: 'app-add-new-bloodbank',
  standalone: false,
  
  templateUrl: './add-new-bloodbank.component.html',
  styleUrl: './add-new-bloodbank.component.css'
})
export class AddNewBloodbankComponent {
  bloodbankcenterRequest:BloodbankRequest;
  showPassword: boolean = false;
 bloodbankReq = {
    user: {
      password: ''
    }
  };

  constructor(private bloodbankService:BloodbankService,private router:Router){
    this.bloodbankcenterRequest=new BloodbankRequest  (new Bloodbankcenter(0,"","","","blood bank"),
     new User(0,"","","blood bank","","Pending"),
     new Address(0,"","","",""),
     new Document(0,"","","","","","","",""))
  }
  saveBloodbank(){
    this.bloodbankService.saveBloodbank(this.bloodbankcenterRequest=new BloodbankRequest(this.bloodbankcenterRequest.bloodBankCenter,this.bloodbankcenterRequest.user,this.bloodbankcenterRequest.address,this.bloodbankcenterRequest.document)).subscribe(
      
      response=>{
        console.log(this.bloodbankcenterRequest);
        console.log(response);
        
        alert("Bloodbank saved Successfully");
        this.router.navigate(['admin/listofbloodbanks'])
      },
    error => {
      console.error('Error saving blood bank:', error);
      
      alert('An error occurred while saving bloodbank details. Please try again.');
    },
  )
  }
 

}
