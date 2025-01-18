import { Injectable } from '@angular/core';
import { LoginRequest } from '../dto/login-request';
import { HttpClient } from '@angular/common/http';
import { Forgotpassword } from '../dto/forgotpassword';

@Injectable({
  providedIn: 'root'
})
export class UserService {
 

  private baseUrl="http://localhost:9090"

  constructor(private httpClient:HttpClient) { }
  
  getUserById(userid: number) {
    return this.httpClient.get<any>(`${this.baseUrl}/getUserById/${userid}`)
  }

  

  checkUserBackEnd(loginRequest: LoginRequest) {
    return this.httpClient.post<any>(`${this.baseUrl}/login`,loginRequest)
  }

  forgotpassword(username:string,password:string) {
    return this.httpClient.put<any>(`${this.baseUrl}/forgotPassword/${username}`,password)
  }

  
}
