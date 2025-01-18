import { Component } from '@angular/core';
import { HospitalService } from '../../services/hospital.service';

@Component({
  selector: 'app-hospital-profile',
  standalone: false,
  
  templateUrl: './hospital-profile.component.html',
  styleUrl: './hospital-profile.component.css'
})
export class HospitalProfileComponent {

  hospitalRequest:any;
  userid:number=0;

  constructor(private hospitalService:HospitalService){
    const useridString=sessionStorage.getItem('userid')
    this.userid = Number(useridString);

  }
  ngOnInit(){
    if(this.userid){
      this.hospitalService.getHospitalByUserId(this.userid).subscribe(
        response=>{
          this.hospitalRequest=response
        },
        error => {
          console.error('Error fetching user data:', error);
        }
      )
    }
    else {
      console.warn('User ID is not set.');
    }
  }

}
