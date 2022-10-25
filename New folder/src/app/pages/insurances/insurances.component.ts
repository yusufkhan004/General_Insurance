import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { InsuranceService } from 'src/app/services/insurance.service';


@Component({
  selector: 'app-insurances',
  templateUrl: './insurances.component.html',
  styleUrls: ['./insurances.component.css']
})
export class InsurancesComponent implements OnInit {


  constructor(
    private insuranceService:InsuranceService, private snack:MatSnackBar
  ) { }

  public insurance={
    
    manufacturer:'',
    policyVehicalType:'',
    model:'',
    drivinglicense:'',
    purchaseDate:'',
    engineNumber:'',
    chasisNumber:''
  };

  ngOnInit(): void { }


  formSubmit()

  {
    console.log(this.insurance);
    if(this.insurance.manufacturer ==''|| this.insurance.manufacturer == null){
     // alert('Manufacturer is required !!');
     this.snack.open
      return;
    }

    if(this.insurance.policyVehicalType ==''|| this.insurance.policyVehicalType == null){
      alert('policyVehicalType is required !!');
      return;
    }

    if(this.insurance.model ==''|| this.insurance.model == null){
      alert('Model is required !!');
      return;
    }

    if(this.insurance.drivinglicense ==''|| this.insurance.drivinglicense == null){
      alert('drivinglicense is required !!');
      return;
    }

    
    if(this.insurance.purchaseDate ==''|| this.insurance.purchaseDate == null){
      alert('purchaseDate is required !!');
      return;
    }

    if(this.insurance.engineNumber ==''|| this.insurance.engineNumber == null){
      alert('engineNumber is required !!');
      return;
    }

    if(this.insurance.chasisNumber ==''|| this.insurance.chasisNumber == null){
      alert('ChasisNumber is required !!');
      return;
    }


   //add insurance: insuranceservice

   this.insuranceService.addInsurance(this.insurance).subscribe({next:(data)=>console.log(data),
  
    
    error:(err)=>console.log(err),
    
    complete: ()=>console.log('completed')

  });
  
    
  }


}
