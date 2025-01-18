import { Component } from '@angular/core';
import { HardcodedauthendicationService } from '../../services/hardcodedauthendication.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logout',
  standalone: false,
  
  templateUrl: './logout.component.html',
  styleUrl: './logout.component.css'
})
export class LogoutComponent {
  constructor(private hardcodedAuthenticationService:HardcodedauthendicationService , private router:Router){}
  ngOnInit(){
    this.hardcodedAuthenticationService.logout();
    this.router.navigate(['login']);
  }
}
