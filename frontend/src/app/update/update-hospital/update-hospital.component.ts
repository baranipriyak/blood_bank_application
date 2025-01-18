import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HospitalService } from '../../services/hospital.service';

@Component({
  selector: 'app-update-hospital',
  standalone: false,
  
  templateUrl: './update-hospital.component.html',
  styleUrl: './update-hospital.component.css'
})
export class UpdateHospitalComponent {
  hospital:any;
  hospitalid:number=0;

  constructor(private hospitalService:HospitalService,private router:Router,private activatedRoute:ActivatedRoute){ }

  ngOnInit(){
    this.hospitalid=this.activatedRoute.snapshot.params['hospitalid']

    this.hospitalService.getHospitalById(this.hospitalid).subscribe(
      response=>{
        this.hospital=response;
      }
    )
  }
  save(){
    this.hospitalService.updateHospitalById(this.hospitalid,this.hospital).subscribe(
      response=>{
        this.hospital=response;
        this.router.navigate(['admin/listofhospitals'])
        alert("updated successfully")
      }
    )
  }
}
