import { Component } from '@angular/core';
import { UsersService } from '../../services/users.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-users',
  standalone: false,
  
  templateUrl: './update-users.component.html',
  styleUrl: './update-users.component.css'
})
export class UpdateUsersComponent {
  users:any;
  usersid:number=0;

  constructor(private usersService:UsersService,private activatedRoute:ActivatedRoute,private router:Router){}

  ngOnInit(){
    this.usersid = this.activatedRoute.snapshot.params['usersid'];

    this.usersService.getUsersById(this.usersid).subscribe(
      response=>{
        this.users=response;
      }
    )
  }
  save(){
    this.usersService.updateUsersById(this.usersid,this.users).subscribe(
      response=>{
        this.users=response;
        alert("updated successfully")
      }
    )
  }

}
