import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { LoginService } from 'src/login.service';
import { RegistrationService } from 'src/app/services/registration.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginData ={
    email: '',
    password: '',
  }

  constructor(private snack:MatSnackBar, private login:LoginService) { }

  ngOnInit(): void {
  }

  loginSubmit() {
    console.log('login btn clicked');

    
    if(this.loginData.email.trim()==''|| this.loginData.email==null)
    {
        this.snack.open('user name is required !! ', '',{
          duration:3000,
        });
        return;
    }

    if(this.loginData.password.trim()==''|| this.loginData.password==null)
    {
        this.snack.open('password name is required !! ', '',{
          duration:3000,
        });
        return;
    }

    //request to server

    this.login.loginUserFromRemote(this.loginData).subscribe({
      next: (data) => {
        console.log(data);
        Swal.fire('Success', 'User is login', 'success');
      },
      error: (err) => console.log(err),
      complete: () => console.log('completed'),
    });

    
  }

}
