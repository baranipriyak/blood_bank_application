import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BloodbankService } from '../../services/bloodbank.service';

@Component({
  selector: 'app-update-bloodbank',
  standalone: false,
  
  templateUrl: './update-bloodbank.component.html',
  styleUrl: './update-bloodbank.component.css'
})
export class UpdateBloodbankComponent {
  bloodBankCenter:any;
  bloodbankid:number=0;

  constructor(private router:Router,private activatedRoute:ActivatedRoute,private bloodbankService:BloodbankService){}

  ngOnInit(){
    this.bloodbankid= this.activatedRoute.snapshot.params['bloodbankid'];
    
    alert(this.bloodbankid)
    this.bloodbankService.getBloodbankById(this.bloodbankid).subscribe(

      response=>{
        alert(this.bloodbankid)
        this.bloodBankCenter=response;
        console.log(this.bloodBankCenter.bloodBankCenter)
      }
      
    )
    
    
  }
  save(){
    this.bloodbankService.updateBloodBankById(this.bloodbankid,this.bloodBankCenter).subscribe(
      response=>{
        this.bloodBankCenter=response;
        alert("updated successfully")
      }
    )

  }

}
