import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Bloodavailability } from '../dao/bloodavailability';

@Injectable({
  providedIn: 'root'
})
export class BloodavailabilityService {
  
  
  private baseUrl="http://localhost:9090"

  constructor(private httpClient:HttpClient) { }

  getBloodAvailabilityById(userid: number) {
   return this.httpClient.get<Bloodavailability>(`${this.baseUrl}/getBloodAvailabilityById/${userid}`)
  }
  addNewBloodAvailability(bloodAvailability: Bloodavailability) {
    console.log(bloodAvailability)
    return this.httpClient.post<any>(`${this.baseUrl}/addNewBloodAvailability`,bloodAvailability)
  }

  getAllBloodAvailability() {
    return this.httpClient.get<Bloodavailability[]>(`${this.baseUrl}/getAllBloodAvailability`)
  }

  updateBloodAvailability(bloodavailabilityid: number, bloodAvailability: Bloodavailability) {
    return this.httpClient.put<Bloodavailability>(`${this.baseUrl}/updateBloodAvailabilityById/${bloodavailabilityid}`,bloodAvailability)
  }
  updateBloodAvailabilityByUserId(userid: number, blood_group: string, count: number) {
    const updateBloodAvailRequest={
      blood_group:blood_group,
      count:count
    }
    return this.httpClient.put<any>(`${this.baseUrl}/`,updateBloodAvailRequest)
  }
 
}
