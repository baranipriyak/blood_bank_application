import { Component } from '@angular/core';
import { UsersRequest } from '../../dto/users-request';
import { UsersService } from '../../services/users.service';
import { Router } from '@angular/router';
import { Users } from '../../dao/users';
import { User } from '../../dao/user';
import { Address } from '../../dao/address';
import emailjs from '@emailjs/browser';

@Component({
  selector: 'app-add-new-users',
  standalone: false,
  
  templateUrl: './add-new-users.component.html',
  styleUrl: './add-new-users.component.css'
})
export class AddNewUsersComponent {
   usersRequest:UsersRequest;
   showPassword: boolean = false;
   usersReque = {
      user: {
        password: ''
      }
    };
    name:string="";
    email:string="";
  
    constructor(private usersService:UsersService,private router:Router){
      this.usersRequest=new UsersRequest(
        new Users(0,'','','','',0,0,'','','user'),
        new User(0,'','','user',"","Accepted"),
        new Address(0,'','','','')
      )
    }
    saveUsers(){
      this.usersService.saveUsers(this.usersRequest=new UsersRequest(this.usersRequest.users,this.usersRequest.user,this.usersRequest.address)).subscribe(
        response=>{
          this.name=this.usersRequest.users.usersname;
          this.email=this.usersRequest.users.usersemail;
          this.sendMessage(this.name,this.email)
          alert("User saved successfully!")
          this.router.navigate(['admin/listofusers']);
        },
        error => {
          console.error('Error saving users:', error);
          
          alert('An error occurred while saving users details. Please try again.');
        },
      )
    }
    sendMessage(name:string,email:string){
      emailjs.init("qrhdmq1fw7fc8nz0m")
    emailjs.send("service_p1poim2","template_dur51xh",{
      to_name: name,
      reply_to: email,
      }).then(
        (response) => {
          console.log('SUCCESS!', response.status, response.text);
        },
        (err) => {
          console.log('FAILED...', err);
        },
      )
      
    }

}
