import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './app/services/helper';
import { RegistrationService } from './app/services/registration.service';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(
    private http:HttpClient
  ) { }


  public loginUserFromRemote(login : any){

    return this.http.post(`${baseUrl}/user/login`, login)

  }


  // // login user: set 
  // public loginUser(token: any)
  // {
  //      localStorage.setItem("token", token);
  //      return true;
  // }

  // //islogin : user is logged in or not

  // public isLoggedIn()
  // {
  //    let tokenStr=localStorage.getItem("token")
  //    if(tokenStr==undefined || tokenStr =='' || tokenStr==null)
  //    {
  //     return false;
  //    }else{
  //     return true;
  //    }
  // }

  // // Logout : remove  token from local stronge

  // public logout(){
  //   localStorage.removeItem('token');
  //   localStorage.removeItem('user')
  //   return true;
  // }

  // // get token
  // public getToken(){
  //   return localStorage.getItem('token');
  // }

  // // set userDetail

  // public setUser(user:any){
  //   localStorage.setItem('user', JSON.stringify(user));
  // }

  // //getUser
  // public getUser(){
  //   let userStr=localStorage.getItem("user");
  //   if(userStr!=null){
  //     return JSON.parse(userStr);
  //   }else{
  //     this.logout();
  //     return null;
  //   }
  }

