import { Injectable } from '@angular/core';
import { HospitalRequest } from '../dto/hospital-request';
import { HttpClient } from '@angular/common/http';
import { User } from '../dao/user';

@Injectable({
  providedIn: 'root'
})
export class HospitalService {
    private baseUrl="http://localhost:9090"

    constructor(private httpClient:HttpClient) { }

  rejectHospital(userid: number, message: string, status: string) {
    const rejectionRequest={
      message:message,
      status:status
    }
    return this.httpClient.put<any>(`${this.baseUrl}/rejectedHospital/${userid}`,rejectionRequest)
  }
  
  getHospitalByUserId(userid: number) {
    return this.httpClient.get<any>(`${this.baseUrl}/getHospitalByUserId/${userid}`)
  }
  acceptedHospital(userid:number,status: string) {
    return this.httpClient.put<any>(`${this.baseUrl}/acceptedHospital/${userid}`,status)
  }
  deleteHospitalById(hospitalid: number) {
    return this.httpClient.delete<any>(`${this.baseUrl}/deleteHospitalById/${hospitalid}`)
  }
  updateHospitalById(hospitalid: number, hospital: any) {
    return this.httpClient.put<any>(`${this.baseUrl}/updateHospitalById/${hospitalid}`,hospital)
  }
  getHospitalById(hospitalid: number) {
    return this.httpClient.get<any>(`${this.baseUrl}/getHospitalById/${hospitalid}`)
  }
  getAllHospitals() {
    return this.httpClient.get<any[]>(`${this.baseUrl}/getAllHospitals`)
  }



  saveHospital(hospitalRequest: HospitalRequest) {
    return this.httpClient.post<any>(`${this.baseUrl}/saveHospital`,hospitalRequest)
    
  }

  
}
