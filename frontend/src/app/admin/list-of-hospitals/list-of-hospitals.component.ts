import { Component } from '@angular/core';
import { HospitalService } from '../../services/hospital.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-of-hospitals',
  standalone: false,
  
  templateUrl: './list-of-hospitals.component.html',
  styleUrl: './list-of-hospitals.component.css'
})
export class ListOfHospitalsComponent {
  hospitals:any[]=[];
  p: number = 1; 
    count: number = 3;
    searchText = '';

constructor(private hospitalService:HospitalService,private router:Router){}

ngOnInit(){
  this.hospitalService.getAllHospitals().subscribe(
    response=>{
      this.hospitals=response;
    }
  )
}
get filteredUsers() {
  return this.hospitals.filter((hospital) =>
    Object.values(hospital)
      .join(' ')
      .toLowerCase()
      .includes(this.searchText.toLowerCase())
  );
}
updateHospital(hospitalid:number){
  this.router.navigate(['/admin/updatehospital',hospitalid])
}
deleteHospitalById(hospitalid:number){
  this.hospitalService.deleteHospitalById(hospitalid).subscribe(
    response=>{
      this.hospitals=response;
    }
  )
}
viewHospitalById(hospitalid:number){
  this.router.navigate(['admin/viewhospital',hospitalid])

}

addNewHospital(){
  this.router.navigate(['admin/add-new-hospital'])
}

}
