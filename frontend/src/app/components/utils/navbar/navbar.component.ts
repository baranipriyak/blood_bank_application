import { Component } from '@angular/core';
import { HardcodedauthendicationService } from '../../../services/hardcodedauthendication.service';

@Component({
  selector: 'app-navbar',
  standalone: false,
  
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {
  username:string="";

constructor(public hardcodedAuthendication:HardcodedauthendicationService){}

ngOnInit(){
  this.username=sessionStorage.getItem("username") || "username";
}

}
