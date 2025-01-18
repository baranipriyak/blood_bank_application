import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedauthendicationService {

  constructor() { }
 
  isUserLoggedIn(){

    let user=sessionStorage.getItem('username');
        //alert("user="+user);
    return !(user===null)
  }

  getLoggedInUserRole() {
    const role = sessionStorage.getItem('role');
    return role;
    
  }

  logout(){
    alert('logout called')
    sessionStorage.removeItem('role');
    sessionStorage.removeItem('userid');
    sessionStorage.removeItem('username');
  }
}
