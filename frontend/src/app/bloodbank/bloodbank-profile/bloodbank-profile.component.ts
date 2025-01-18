import { Component } from '@angular/core';
import { BloodbankRequest } from '../../dto/bloodbank-request';
import { BloodbankService } from '../../services/bloodbank.service';

@Component({
  selector: 'app-bloodbank-profile',
  standalone: false,
  
  templateUrl: './bloodbank-profile.component.html',
  styleUrl: './bloodbank-profile.component.css'
})
export class BloodbankProfileComponent {

  bloodBankRequest:any;
  userid:number=0;

  constructor(private bloodBankService:BloodbankService){
    const usreridString = sessionStorage.getItem('userid');
    this.userid = Number(usreridString);

  }

  ngOnInit(){
    if(this.userid){
      this.bloodBankService.getBloodbankByUserId(this.userid).subscribe(
        response=>{
          this.bloodBankRequest=response
        }
      )
    }
  }


}
