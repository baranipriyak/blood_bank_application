import { Component } from '@angular/core';
import { UsersService } from '../../services/users.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-view-users',
  standalone: false,
  
  templateUrl: './view-users.component.html',
  styleUrl: './view-users.component.css'
})
export class ViewUsersComponent {
  users:any;
  usersid:number=0;

  constructor(private usersService:UsersService,private activatedRoute:ActivatedRoute,private router:Router){}

  ngOnInit(){
    this.usersid= this.activatedRoute.snapshot.params["usersid"];

    this.usersService.getUsersById(this.usersid).subscribe(
      response=>{
        this.users=response;
      }
    )
  }

}
