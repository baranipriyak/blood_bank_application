import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-layout',
  standalone: false,
  
  templateUrl: './admin-layout.component.html',
  styleUrl: './admin-layout.component.css'
})
export class AdminLayoutComponent {

  role:string="";
    constructor(private router:Router){
      this.role=String(sessionStorage.getItem('role'));
    }
    ngOnInit(){
      if(this.role !='admin'){
        this.router.navigate([''])
      }
    }

}
