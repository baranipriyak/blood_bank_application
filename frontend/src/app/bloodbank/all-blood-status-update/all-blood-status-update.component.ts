import { Component } from '@angular/core';
import { Bloodavailability } from '../../dao/bloodavailability';
import { BloodavailabilityService } from '../../services/bloodavailability.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all-blood-status-update',
  standalone: false,
  
  templateUrl: './all-blood-status-update.component.html',
  styleUrl: './all-blood-status-update.component.css'
})
export class AllBloodStatusUpdateComponent {
   // Type the bloodUnits object using a Record
   bloodAvailability:Bloodavailability;
     userid:number=0;
   
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

          if(response === null){
            // alert("go to inside the response")
            this.router.navigate(['/blood-bank/add-new-blood-availability'])
          }
        }
      )
     }
     updateBloodAvailability(bloodavailabilityid:number){
      this.bloodAvailabilityService.updateBloodAvailability(bloodavailabilityid,this.bloodAvailability).subscribe(
        response=>{
          this.bloodAvailability=response;
          alert("Blood Unit Updated Successfully")
        }
      )

     }

}
