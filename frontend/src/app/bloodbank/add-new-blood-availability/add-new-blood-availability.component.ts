import { Component } from '@angular/core';
import { Bloodavailability } from '../../dao/bloodavailability';
import { BloodavailabilityService } from '../../services/bloodavailability.service';

@Component({
  selector: 'app-add-new-blood-availability',
  standalone: false,
  
  templateUrl: './add-new-blood-availability.component.html',
  styleUrl: './add-new-blood-availability.component.css'
})
export class AddNewBloodAvailabilityComponent {
  bloodAvailability:Bloodavailability;
  userid:number=0;

  constructor (private bloodAvailabilityService : BloodavailabilityService){
    this.userid=Number(sessionStorage.getItem('userid'))
    console.log(this.userid)
    this.bloodAvailability=new Bloodavailability(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,this.userid)
  }
  createBloodAvailability(){
    console.log(this.bloodAvailability)
    this.bloodAvailabilityService.addNewBloodAvailability(this.bloodAvailability).subscribe(
      response=>{
        this.bloodAvailability=response
        // console.log(response)
        alert("Added Successfully")
            },
      error => {
        console.error('Error saving:', error);
      }
    )
  }
}
