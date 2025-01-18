import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { LoginComponent } from './pages/login/login.component';
import { UsersLayoutComponent } from './users-layout/users-layout.component';
import { SignupComponent } from './pages/signup/signup.component';
import { UserSignupComponent } from './users/user-signup/user-signup.component';
import { UserProfileComponent } from './users/user-profile/user-profile.component';
import { UserRequestHistoryComponent } from './users/user-request-history/user-request-history.component';
import { HospitalSignupComponent } from './hospital/hospital-signup/hospital-signup.component';
import { BloodbankSignupComponent } from './bloodbank/bloodbank-signup/bloodbank-signup.component';
import { ListOfHospitalsComponent } from './admin/list-of-hospitals/list-of-hospitals.component';
import { ListOfBloodbanksComponent } from './admin/list-of-bloodbanks/list-of-bloodbanks.component';
import { ListOfUsersComponent } from './admin/list-of-users/list-of-users.component';
import { UpdateHospitalComponent } from './update/update-hospital/update-hospital.component';
import { ViewHospitalComponent } from './admin/view-hospital/view-hospital.component';
import { ViewUsersComponent } from './admin/view-users/view-users.component';
import { AdminLayoutComponent } from './admin-layout/admin-layout.component';
import { UpdateBloodbankComponent } from './update/update-bloodbank/update-bloodbank.component';
import { ViewBloodbankComponent } from './admin/view-bloodbank/view-bloodbank.component';
import { UpdateUsersComponent } from './update/update-users/update-users.component';
import { LogoutComponent } from './pages/logout/logout.component';
import { Hospital } from './dao/hospital';
import { HospitalLayoutComponent } from './hospital-layout/hospital-layout.component';
import { UserBloodRequestComponent } from './user-blood-request/user-blood-request.component';
import { ViewusersbloodrequestComponent } from './viewusersbloodrequest/viewusersbloodrequest.component';
import { HospitalProfileComponent } from './hospital/hospital-profile/hospital-profile.component';
import { BloodBankLayoutComponent } from './blood-bank-layout/blood-bank-layout.component';
import { BloodbankDashboardComponent } from './bloodbank/bloodbank-dashboard/bloodbank-dashboard.component';
import { AllBloodStatusUpdateComponent } from './bloodbank/all-blood-status-update/all-blood-status-update.component';
import { BloodbankProfileComponent } from './bloodbank/bloodbank-profile/bloodbank-profile.component';
import { AddNewHospitalComponent } from './admin/add-new-hospital/add-new-hospital.component';
import { AddNewBloodbankComponent } from './admin/add-new-bloodbank/add-new-bloodbank.component';
import { AddNewUsersComponent } from './admin/add-new-users/add-new-users.component';
import { AddNewBloodAvailabilityComponent } from './bloodbank/add-new-blood-availability/add-new-blood-availability.component';
import { TermsAndConditionComponent } from './terms-and-condition/terms-and-condition.component';
import { ViewAllBloodBanksInUsersComponent } from './users/view-all-blood-banks-in-users/view-all-blood-banks-in-users.component';
import { ViewBloodAvailabilityInUserComponent } from './users/view-blood-availability-in-user/view-blood-availability-in-user.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { ViewAllBloodRequestComponent } from './admin/view-all-blood-request/view-all-blood-request.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'home',component:HomeComponent},
  {path:'about',component:AboutComponent},
  {path:'login',component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'users/signup',component:UserSignupComponent},
  {path:'hospital/signup',component:HospitalSignupComponent},
  {path:'bloodbank/signup',component:BloodbankSignupComponent},
  {path:'logout',component:LogoutComponent},
  {path:"terms-and-conditions",component:TermsAndConditionComponent},
  {path:"forgot-password",component:ForgotPasswordComponent},
  {path:'users',component:UsersLayoutComponent,
    children:[
      {path:'profile',component:UserProfileComponent},
      {path:'request-history',component:UserRequestHistoryComponent},
      {path:'add-request',component:UserBloodRequestComponent},
      {path:'view-request',component:ViewusersbloodrequestComponent},
      {path:"viewbloodbanks",component:ViewAllBloodBanksInUsersComponent},
      {path:"viewbloodAvailability/:userid",component:ViewBloodAvailabilityInUserComponent},
      
    ]
  },
  {path:'admin',component:AdminLayoutComponent,
    children:[
      {path:'listofhospitals',component:ListOfHospitalsComponent},
      {path:'listofbloodbanks',component:ListOfBloodbanksComponent},
      {path:'listofusers',component:ListOfUsersComponent},
      {path:'viewhospital/:hospitalid',component:ViewHospitalComponent},
      {path:'viewbloodbank/:bloodbankid',component:ViewBloodbankComponent},
      {path:'viewUsers/:usersid',component:ViewUsersComponent},
      {path:'updatehospital/:hospitalid',component:UpdateHospitalComponent},
      {path:'updatebloodbank/:bloodbankid',component:UpdateBloodbankComponent},
      {path:'updateusers/:usersid',component:UpdateUsersComponent},
      {path:'viewbloodrequest',component:ViewusersbloodrequestComponent},
      {path:'add-new-hospital',component:AddNewHospitalComponent},
      {path:'add-new-bloodbank',component:AddNewBloodbankComponent},
      {path:'add-new-users',component:AddNewUsersComponent},
      {path:"view-all-blood-request",component:ViewAllBloodRequestComponent},
    ]
  },
  {path:'hospital',component:HospitalLayoutComponent,
    children:[
      {path:'profile',component:HospitalProfileComponent},
      {path:'add-request',component:UserBloodRequestComponent},
      {path:'request-history',component:UserRequestHistoryComponent}
    ]
  },
  {path:'blood-bank',component:BloodBankLayoutComponent,
    children:[
      {path:'profile',component:BloodbankProfileComponent},
      {path:'dashboard',component:BloodbankDashboardComponent},
      {path:'view-request',component:ViewusersbloodrequestComponent},
      {path:'update-blood-availability',component:AllBloodStatusUpdateComponent},
      {path:'add-new-blood-availability',component:AddNewBloodAvailabilityComponent},

    ]
  }
  
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
