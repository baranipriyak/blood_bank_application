import { Component } from '@angular/core';
import { BloodbankService } from '../../services/bloodbank.service';
import { Router } from '@angular/router';
import { Bloodavailability } from '../../dao/bloodavailability';

@Component({
  selector: 'app-view-all-blood-banks-in-users',
  standalone: false,
  
  templateUrl: './view-all-blood-banks-in-users.component.html',
  styleUrl: './view-all-blood-banks-in-users.component.css'
})
export class ViewAllBloodBanksInUsersComponent {
  bloodBankCenters:any[]=[];
      p: number = 1; 
      count: number = 3 ;
      searchText = '';
      userid:number=0;
  
      
    
    constructor(private bloodbankService:BloodbankService,private router:Router){}
    
    ngOnInit(){
      this.bloodbankService.getAllBloodBankCenters().subscribe(
        response=>{
          this.bloodBankCenters=response;
          console.log(this.bloodBankCenters)
        }
      )
    }
    get filteredUsers() {
      return this.bloodBankCenters.filter((bloodbankcenter) =>{
        const combineData = [
          bloodbankcenter.bloodbankcentername,
          bloodbankcenter.bloodbankphonenumber,
          bloodbankcenter.bloodbankemail,
          bloodbankcenter.address.area,
          bloodbankcenter.address.city,
          bloodbankcenter.address.country,
          bloodbankcenter.address.pincode,
          bloodbankcenter.document,
          bloodbankcenter.user
        ]
        .filter((field)=> !!field)
        .join(' ')
        .toLowerCase();
        return combineData.includes(this.searchText.toLowerCase());
      });
      //   Object.values(bloodbankcenter)
      //     .join(' ')
      //     .toLowerCase()
      //     .includes(this.searchText.toLowerCase())
      // );
    }
  
    viewAllBloodAvailability(userid:number){
      console.log()
      this.router.navigate(["/users/viewbloodAvailability",userid])

    }

}
