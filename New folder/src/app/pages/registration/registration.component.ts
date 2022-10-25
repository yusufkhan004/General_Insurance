import { Component, OnInit } from '@angular/core';
import { RegistrationService } from 'src/app/services/registration.service';
import {MatSnackBar, MatSnackBarModule} from '@angular/material/snack-bar';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css'],
})
export class RegistrationComponent implements OnInit {
  constructor(
    private registrationService: RegistrationService,
    private snack: MatSnackBar
  ) {}

  users = [
    { value: 'admin', text: 'Admin' },
    { value: 'user', text: 'User' },
    
  ];

  public user = {
    name: '',
    email: '',
    dob: '',
    contactNumber: '',
    address: '',
    password: '',
    role:'',
  };

  ngOnInit(): void {}

  formRegistration() {
    console.log(this.user);
    if (this.user.name == '' || this.user.name == null) {
      this.snack.open('Username is required !!', '', {
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'start',
      });

      return;
    }

    if (this.user.email == '' || this.user.email == null) {
      this.snack.open('Email Id is required !!', '', {
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'start',
      });

      return;
    }

    if (this.user.dob == '' || this.user.dob == null) {
      this.snack.open('Date of birth is required !!', '', {
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'start',
      });

      return;
    }

    if (this.user.contactNumber == '' || this.user.contactNumber == null) {
      this.snack.open('Contact number is required !!', '', {
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'start',
      });

      return;
    }

    if (this.user.address == '' || this.user.address == null) {
      this.snack.open('Address is required !!', '', {
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'start',
      });

      return;
    }

    if (this.user.password == '' || this.user.password == null) {
      this.snack.open('Password is required !!', '', {
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'start',
      });

      return;
    }

    this.registrationService.addUser(this.user).subscribe({
      next: (data) => {
        console.log(data);
        Swal.fire('Success', 'User is registered', 'success');
      },
      error: (err) => console.log(err),
      complete: () => console.log('completed'),
    });
  }
}
