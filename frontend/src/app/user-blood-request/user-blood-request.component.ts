import { Component } from '@angular/core';
import { Usersbloodrequest } from '../dao/usersbloodrequest';
import { UsersbloodrequestService } from '../services/usersbloodrequest.service';

@Component({
  selector: 'app-user-blood-request',
  standalone: false,
  
  templateUrl: './user-blood-request.component.html',
  styleUrl: './user-blood-request.component.css'
})
export class UserBloodRequestComponent {

  usersBloodRequest:Usersbloodrequest;
  userid:number=0;
  role:string="";

  constructor(private usersBloodRequestService:UsersbloodrequestService){
    const useridString=sessionStorage.getItem('userid');
    const roleString=sessionStorage.getItem('role');

    this.userid=Number(useridString);
    this.role = String(roleString); 
    
  //  alert(this.role)
  //  alert(this.userid)
      this.usersBloodRequest=new Usersbloodrequest(0,"",0,"",new Date,new Date,"Pending","","","",this.role,this.userid,0,"","")
   
  }

  saveBloodRequest(){
    this.usersBloodRequestService.saveBloodRequest(this.usersBloodRequest).subscribe(
      response=>{
        this.usersBloodRequest=response;
      }
    )
  }
}
