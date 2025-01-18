import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-blood-bank-layout',
  standalone: false,
  
  templateUrl: './blood-bank-layout.component.html',
  styleUrl: './blood-bank-layout.component.css'
})
export class BloodBankLayoutComponent {

   role:string="";
    constructor(private router:Router){
      this.role=String(sessionStorage.getItem('role'));
    }
    ngOnInit(){
      if(this.role !='blood bank'){
        this.router.navigate([''])
      }
    }
}
