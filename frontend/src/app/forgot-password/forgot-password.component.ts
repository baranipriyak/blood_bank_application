import { Component } from '@angular/core';
import { Forgotpassword } from '../dto/forgotpassword';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-forgot-password',
  standalone: false,
  
  templateUrl: './forgot-password.component.html',
  styleUrl: './forgot-password.component.css'
})
export class ForgotPasswordComponent {
  forgotPassword: Forgotpassword;
  rePassword: string = '';
  showPassword: boolean = false;

  constructor(private router: Router, private userService: UserService) {
    this.forgotPassword = new Forgotpassword('', '');
  }

  onSubmit() {
    if (this.forgotPassword.password === this.rePassword) {
      this.userService.forgotpassword(this.forgotPassword.username,this.forgotPassword.password).subscribe(
        response=>{
          alert("password changed successfully")
          this.router.navigate(["/login"])
        },error => {
          alert('Username not available.');
        },
      )
    } else {
      alert('Passwords do not match!');
    }
  }
 
}
