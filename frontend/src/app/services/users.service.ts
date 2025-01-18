import { Injectable } from '@angular/core';
import { UsersRequest } from '../dto/users-request';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  private baseUrl = "http://localhost:9090";

  constructor(private httpClient:HttpClient) { }

  getUsersByUserId(userid: number) {
    return this.httpClient.get<any>(`${this.baseUrl}/getUsersByUserId/${userid}`)
  }
  updateUsersById(usersid: number,users:any) {
    return this.httpClient.put<any>(`${this.baseUrl}/updateUsersById/${usersid}`,users)
  }
  getUsersById(usersid: number) {
    return this.httpClient.get<any>(`${this.baseUrl}/getUsersById/${usersid}`)
  }
  deleteUsersById(usersid: number) {
    return this.httpClient.delete<any[]>(`${this.baseUrl}/deleteUsersById/${usersid}`)
  }
  getAllUsers() {
    return this.httpClient.get<any[]>(`${this.baseUrl}/getAllUsers`)
  }

  

  saveUsers(usersRequest: UsersRequest) {
    return this.httpClient.post<any>(`${this.baseUrl}/saveUsers`,usersRequest)
  }

  
}
