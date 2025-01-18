import { Component } from '@angular/core';
import { BloodavailabilityService } from '../../services/bloodavailability.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Bloodavailability } from '../../dao/bloodavailability';

@Component({
  selector: 'app-view-blood-availability-in-user',
  standalone: false,
  
  templateUrl: './view-blood-availability-in-user.component.html',
  styleUrl: './view-blood-availability-in-user.component.css'
})
export class ViewBloodAvailabilityInUserComponent {
  bloodAvailability:Bloodavailability;
         userid:number=0;
         bloodCounts:any[]=[];
       
         constructor (private bloodAvailabilityService : BloodavailabilityService,private router:Router,private activatedRoute:ActivatedRoute){
           this.userid=Number(this.activatedRoute.snapshot.params['userid']);
           console.log(this.userid)
           this.bloodAvailability=new Bloodavailability(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,this.userid)
          if(this.userid){
            this.checkBloodAvailability()
           
          }
         }
         checkBloodAvailability(){
          
          this.bloodAvailabilityService.getBloodAvailabilityById(this.userid).subscribe(
            response=>{
              this.bloodAvailability=response;
              console.log(this.bloodAvailability)
              if(response === null){
               
                this.router.navigate(['/blood-bank/add-new-blood-availability'])
              }
              if(response !== null){
                
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
