import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactComponent } from './contact/contact.component';
import { ClaimsComponent } from './pages/claims/claims.component';
import { InsurancesComponent } from './pages/insurances/insurances.component';
import { LoginComponent } from './pages/login/login.component';
import { RegistrationComponent } from './pages/registration/registration.component';
import {RenewComponent} from './pages/renew/renew.component';



const routes: Routes = [

{
  path: 'insurances',
  component: InsurancesComponent, 
  pathMatch: 'full',
},

{
  path: 'Registration',
  component: RegistrationComponent,
  pathMatch:'full',
},



{
  path:'login',
  component:LoginComponent,
  pathMatch:'full',
},

{
  path: 'aboutus',
  component: AboutusComponent,
  pathMatch:'full',
},

{
  path: 'contact',
  component: ContactComponent,
  pathMatch: 'full',
},

{
  path: 'claims',
  component: ClaimsComponent,
  pathMatch: 'full',
},

{
  path: 'renew',
  component: RenewComponent,
  pathMatch: 'full',
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
