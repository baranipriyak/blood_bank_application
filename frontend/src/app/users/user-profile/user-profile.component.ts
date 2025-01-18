import { Component } from '@angular/core';
import { UsersRequest } from '../../dto/users-request';
import { UsersService } from '../../services/users.service';
import { Users } from '../../dao/users';
import { User } from '../../dao/user';
import { Address } from '../../dao/address';
import { Document } from '../../dao/document';

@Component({
  selector: 'app-user-profile',
  standalone: false,
  
  templateUrl: './user-profile.component.html',
  styleUrl: './user-profile.component.css'
})
export class UserProfileComponent {

  usersRequest:any;
  userid:number=0;

  constructor(private usersService:UsersService){
    // this.usersRequest=new UsersRequest(
    //   new Users(0,"","","","",0,0,"","","user"),
    //   new User(0,"","","user"),
    //   new Address(0,"","","","")
    // )
    const useridString=sessionStorage.getItem("userid");
    this.userid=Number(useridString);
    // alert(this.userid)
  }

  ngOnInit(){
    if(this.userid){
      this.usersService.getUsersByUserId(this.userid).subscribe(
      response=>{
        this.usersRequest=response;
        console.log(this.usersRequest)
        // sessionStorage.setItem('name',this.usersRequest.usersname);
      },
      error => {
        console.error('Error fetching user data:', error);
      }
    )
  }else {
    console.warn('User ID is not set.');
  }
}

}
