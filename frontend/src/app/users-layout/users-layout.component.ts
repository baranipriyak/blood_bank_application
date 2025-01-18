import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users-layout',
  standalone: false,
  
  templateUrl: './users-layout.component.html',
  styleUrl: './users-layout.component.css'
})
export class UsersLayoutComponent {

  role:string="";
  constructor(private router:Router){
    this.role=String(sessionStorage.getItem('role'));
  }
  ngOnInit(){
    if(this.role !='user'){
      this.router.navigate([''])
    }
  }

}
