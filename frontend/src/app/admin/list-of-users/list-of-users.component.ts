import { Component } from '@angular/core';
import { UsersService } from '../../services/users.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-of-users',
  standalone: false,
  
  templateUrl: './list-of-users.component.html',
  styleUrl: './list-of-users.component.css'
})
export class ListOfUsersComponent {
  users:any[]=[];
  p: number = 1; 
    count: number = 1 ;
    searchText = '';

  constructor(private usersService:UsersService,private router:Router){}

  ngOnInit(){
    this.usersService.getAllUsers().subscribe(
      response=>{
        this.users=response;
      }
    )
  }
  get filteredUsers() {
    return this.users.filter((user) =>
      Object.values(user)
        .join(' ')
        .toLowerCase()
        .includes(this.searchText.toLowerCase())
    );
  }
  updateUsersById(usersid:number){
    this.router.navigate(['/admin/updateusers',usersid]);
  }
  deleteUsersById(usersid:number){
    this.usersService.deleteUsersById(usersid).subscribe(
      response=>{
        this.users=response;
      }
    )
  }
  viewUsersById(usersid:number){
    this.router.navigate(['/admin/viewUsers',usersid])
  }

  addNewUsers(){
    this.router.navigate(['admin/add-new-users'])
  }
}
