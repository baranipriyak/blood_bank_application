import { Component } from '@angular/core';
import { Bloodavailability } from '../dao/bloodavailability';
import { BloodavailabilityService } from '../services/bloodavailability.service';

@Component({
  selector: 'app-listofbloodavailability',
  standalone: false,
  
  templateUrl: './listofbloodavailability.component.html',
  styleUrl: './listofbloodavailability.component.css'
})
export class ListofbloodavailabilityComponent {

  bloodAvailability:Bloodavailability[]=[];

  constructor(private bloodAvailabilityService:BloodavailabilityService){}

  ngOnInit(){
    this.bloodAvailabilityService.getAllBloodAvailability().subscribe(
      response=>{
        this.bloodAvailability=response;
      }
    )
  }

}
