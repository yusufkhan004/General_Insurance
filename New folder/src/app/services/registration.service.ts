import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root',
})
export class RegistrationService {
  constructor(private http: HttpClient) {}

  public addUser(user: any): Observable<any> {
    return this.http.post(`${baseUrl}/user/adduser`, user);
  }

  
}
