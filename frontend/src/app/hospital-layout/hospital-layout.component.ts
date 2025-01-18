import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hospital-layout',
  standalone: false,
  
  templateUrl: './hospital-layout.component.html',
  styleUrl: './hospital-layout.component.css'
})
export class HospitalLayoutComponent {
   role:string="";
    constructor(private router:Router){
      this.role=String(sessionStorage.getItem('role'));
    }
    ngOnInit(){
      if(this.role !='hospital'){
        this.router.navigate([''])
      }
    }

}
