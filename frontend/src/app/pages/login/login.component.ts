import { Component } from '@angular/core';
import { LoginRequest } from '../../dto/login-request';
import { UserService } from '../../services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: false,
  
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
loginRequest = new LoginRequest("","","");
errorMessage="";
showPassword: boolean = false;
  usersReque = {
     user: {
       password: ''
     }
   };

constructor(private userService:UserService,private router:Router){

}
validateUser(){
  // alert("inside method")
  // alert(this.loginRequest.role)
  this.userService.checkUserBackEnd(this.loginRequest).subscribe(
    response=>{
      // alert("inside response") 
      if(response.validated){
        if(response.status === "Accepted"){
          sessionStorage.setItem('username',this.loginRequest.username);
        sessionStorage.setItem('role',response.role);
        sessionStorage.setItem('userid',response.userId);
        alert("Login Successfull");
        if(response.role=='admin'){
          this.router.navigate(['admin/listofhospitals']);
        }else if(response.role == 'user'){
          this.router.navigate(['users/profile'])
        }else if(response.role == 'hospital'){
          this.router.navigate(['hospital/profile'])
        }else if(response.role == 'blood bank'){
          this.router.navigate(['blood-bank/dashboard'])
        }

        }
        if(response.status === "Pending"){
          alert("Your application still pending . Once you recived the mail and then try to login here.")
        }

        
        
      }
      else{
        alert( 'Invalid credentials.')
      }
    },
    (error)=>this.errorHandling(error)
  );
}
  errorHandling(backendError: any): void {
    if(backendError.status){
      alert("user not exists, please Register")
      this.errorMessage = "user not exists, please Register"
    }
  }
}
