import { Injectable } from '@angular/core';
import { BloodbankRequest } from '../dto/bloodbank-request';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BloodbankService {
  private baseUrl="http://localhost:9090";

  constructor(private httpClient:HttpClient) { }

  rejectBloodbank(userid: number, message: string, status: string) {
    const rejectionRequest={
      message:message,
      status:status
    }
    return this.httpClient.put<any>(`${this.baseUrl}/rejectedBloodbank/${userid}`,rejectionRequest)
  }
  acceptedBloodbank(userid: number, status: string) {
    return this.httpClient.put<any>(`${this.baseUrl}/acceptedBloodbank/${userid}`,status)
  }
  getBloodbankByUserId(userid: number) {
    return this.httpClient.get<any>(`${this.baseUrl}/getBloodbankByUserId/${userid}`)
  }
  deleteBloodbankById(bloodbankid: number) {
    return this.httpClient.delete<any[]>(`${this.baseUrl}/deleteBloodBankById/${bloodbankid}`)
  }
  updateBloodBankById(bloodbankid:number,bloodBankCenterRequest:any) {
    return this.httpClient.put<any>(`${this.baseUrl}/updateBloodBankCenterById/${bloodbankid}`,bloodBankCenterRequest)
  }
  getBloodbankById(bloodbankid: number) {
    return this.httpClient.get<any>(`${this.baseUrl}/getBloodBankCenterById/${bloodbankid}`)
  }
  getAllBloodBankCenters() {
    return this.httpClient.get<any[]>(`${this.baseUrl}/getAllBloodBankCenters`)
  }

 

  saveBloodbank(bloodBankCenterRequest: BloodbankRequest) {
    return this.httpClient.post<any>(`${this.baseUrl}/saveBloodBankCenter`,bloodBankCenterRequest)
  }

  
}
