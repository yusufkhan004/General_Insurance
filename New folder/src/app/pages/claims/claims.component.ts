import { Component, OnInit } from '@angular/core';
import { Claims } from 'src/app/services/claims';
import { ClaimsService } from 'src/app/services/claims.service';

@Component({
  selector: 'app-claims',
  templateUrl: './claims.component.html',
  styleUrls: ['./claims.component.css']
})
export class ClaimsComponent implements OnInit {


  
  message:any;
  claims = {policyNumber:'',mobileNumber:'',reason:''}
  constructor(private claimsService:ClaimsService) { }

  ngOnInit(): void {
  }

  public claimsNow(){
   let resp=this.claimsService.doClaim(this.claims);
   resp.subscribe((data: any)=>this.message=data);
  }

}
