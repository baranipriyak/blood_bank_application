import { Component } from '@angular/core';
import { Bloodavailability } from '../../dao/bloodavailability';
import { BloodavailabilityService } from '../../services/bloodavailability.service';
import { Router } from '@angular/router';
import { count } from 'rxjs';

@Component({
  selector: 'app-bloodbank-dashboard',
  standalone: false,
  
  templateUrl: './bloodbank-dashboard.component.html',
  styleUrl: './bloodbank-dashboard.component.css'
})
export class BloodbankDashboardComponent {

  bloodAvailability:Bloodavailability;
       userid:number=0;
       bloodCounts:any[]=[];
     
       constructor (private bloodAvailabilityService : BloodavailabilityService,private router:Router){
         this.userid=Number(sessionStorage.getItem('userid'))
         console.log(this.userid)
         this.bloodAvailability=new Bloodavailability(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,this.userid)
        if(this.userid){
          this.checkBloodAvailability()
          // alert("inside if ")
        }
       }
       checkBloodAvailability(){
        // alert("inside check")
        this.bloodAvailabilityService.getBloodAvailabilityById(this.userid).subscribe(
          response=>{
            this.bloodAvailability=response
            // alert("Blood Availability"+this.bloodAvailability)
            console.log(this.bloodAvailability)
            if(response === null){
              // alert("go to inside the response")
              this.router.navigate(['/blood-bank/add-new-blood-availability'])
            }
            if(response !== null){
              // alert("goto the response not null")
              // alert(response.a_minus)
              this.bloodCounts = [

                { group: 'A+', count: this.bloodAvailability.a_plus },
                { group: 'A-', count: this.bloodAvailability.a_minus },
                { group: 'B+', count: this.bloodAvailability.b_plus },
                { group: 'B-', count: this.bloodAvailability.b_minus },
                { group: 'AB+', count: this.bloodAvailability.ab_plus },
                { group: 'AB-', count: this.bloodAvailability.ab_minus },
                { group: 'O+', count: this.bloodAvailability.o_plus },
                { group: 'O-', count: this.bloodAvailability.o_minus },
                { group: 'A1+', count: this.bloodAvailability.a1_plus },
                { group: 'A1-', count: this.bloodAvailability.a1_minus },
                { group: 'A2+', count: this.bloodAvailability.a2_plus },
                { group: 'A2-', count: this.bloodAvailability.a2_minus },
                { group: 'A1B+', count: this.bloodAvailability.a1b_plus },
                { group: 'A1B-', count: this.bloodAvailability.a1b_minus },
                { group: 'A2B+', count: this.bloodAvailability.a2b_plus },
                { group: 'A2B-', count: this.bloodAvailability.a2b_minus },
                { group: 'Oh', count: this.bloodAvailability.oh_minus },
                { group: 'Rh -', count: this.bloodAvailability.rh_minus },
              ];
             console.log(this.bloodCounts.length)
             
             
            }
          }
        )
       }
 
  getProgress(count: number): string {
    const maxCount = 100; // Set a maximum count for full progress
    const progress = (count / maxCount) * 100; // Calculate percentage
    const circumference = 2 * Math.PI * 16; // Circumference of the circle (r = 16)
    const dashArray = (progress / 100) * circumference;
    return `${dashArray} ${circumference}`;
  }

}
