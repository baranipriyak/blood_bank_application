import { Injectable } from '@angular/core';
import { Usersbloodrequest } from '../dao/usersbloodrequest';
import { HttpClient } from '@angular/common/http';
import { BloodbankRequest } from '../dto/bloodbank-request';

@Injectable({
  providedIn: 'root'
})
export class UsersbloodrequestService {
 
private baseUrl ="http://localhost:9090"

constructor(private httpClient:HttpClient) { }

  getBloodRequestById(userid: number) {
    return this.httpClient.get<Usersbloodrequest[]>(`${this.baseUrl}/getBloodRequestById/${userid}`)
  }
  acceptRequest(requestid: number, acceptoruserid: number, acceptorrole: String) {
   const acceptRequest={
      acceptoruserid:acceptoruserid,
      acceptorrole:acceptorrole
    }
    return this.httpClient.put<any>(`${this.baseUrl}/addAcceptRequest/${requestid}`,acceptRequest)
  }
  getAllBloodRequests() {
    return this.httpClient.get<Usersbloodrequest[]>(`${this.baseUrl}/getAllUsersBloodRequest`)
  }

  

  saveBloodRequest(usersBloodRequest: Usersbloodrequest) {
    return this.httpClient.post<any>(`${this.baseUrl}/saveUsersBloodRequest`,usersBloodRequest)
  }

  ReceivedBlood(requestid: number, status:string) {
    return this.httpClient.put<any>(`${this.baseUrl}/receivedBlood/${requestid}`,status)
    
  }
  notReceivedBlood(requestid: number, status: string) {
    return this.httpClient.put<any>(`${this.baseUrl}/notReceivedBlood/${requestid}`,status)
  }
}
