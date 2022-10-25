import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Claims } from './claims';
@Injectable({
  providedIn: 'root'
})
export class ClaimsService {

  constructor(private http:HttpClient) { }


  public doClaim(claims: Claims){
    return this.http.post("http://localhost:8080/claim/addClaim",claims,{responseType: 'text' as 'json'});
  }
}
