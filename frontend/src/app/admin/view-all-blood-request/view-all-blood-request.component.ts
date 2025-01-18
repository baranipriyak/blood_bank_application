import { Component } from '@angular/core';
import { Usersbloodrequest } from '../../dao/usersbloodrequest';
import { UsersbloodrequestService } from '../../services/usersbloodrequest.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-all-blood-request',
  standalone: false,
  
  templateUrl: './view-all-blood-request.component.html',
  styleUrl: './view-all-blood-request.component.css'
})
export class ViewAllBloodRequestComponent {
  usersBloodRequest:Usersbloodrequest[]=[];
  
  constructor(private usersBloodRequestService:UsersbloodrequestService,private router:Router){
  
  }
  ngOnInit(){
    this.usersBloodRequestService.getAllBloodRequests().subscribe(
      response=>{
        this.usersBloodRequest=response;
      }
    )
  }

}
