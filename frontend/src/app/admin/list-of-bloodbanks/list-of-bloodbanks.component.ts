import { Component } from '@angular/core';
import { BloodbankService } from '../../services/bloodbank.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-of-bloodbanks',
  standalone: false,
  
  templateUrl: './list-of-bloodbanks.component.html',
  styleUrl: './list-of-bloodbanks.component.css'
})
export class ListOfBloodbanksComponent {
    bloodBankCenters:any[]=[];
    p: number = 1; 
    count: number = 3 ;
    searchText = '';

    
  
  constructor(private bloodbankService:BloodbankService,private router:Router){}
  
  ngOnInit(){
    this.bloodbankService.getAllBloodBankCenters().subscribe(
      response=>{
        this.bloodBankCenters=response;
      }
    )
  }
  get filteredUsers() {
    return this.bloodBankCenters.filter((bloodbankcenter) =>
      Object.values(bloodbankcenter)
        .join(' ')
        .toLowerCase()
        .includes(this.searchText.toLowerCase())
    );
  }

  updateBloodbankById(bloodbankid:number){
    this.router.navigate(['/admin/updatebloodbank',bloodbankid]);
  }
  deleteBloodbankById(bloodbankid:number){
    this.bloodbankService.deleteBloodbankById(bloodbankid).subscribe(
      response=>{
        this.bloodBankCenters=response;
      }
    )
  }

  viewBloodbankById(bloodbankid:number){
    this.router.navigate(['admin/viewbloodbank',bloodbankid]);
  }

  addNewBloodBank(){
    this.router.navigate(['admin/add-new-bloodbank'])
  }

}
