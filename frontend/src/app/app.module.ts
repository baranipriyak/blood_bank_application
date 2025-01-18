import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/utils/navbar/navbar.component';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { LoginComponent } from './pages/login/login.component';
import { UsersLayoutComponent } from './users-layout/users-layout.component';
import { SidebarComponent } from './components/utils/sidebar/sidebar.component';
import { SignupComponent } from './pages/signup/signup.component';
import { FooterComponent } from './components/utils/footer/footer.component';
import { UserSignupComponent } from './users/user-signup/user-signup.component';
import { UserRequestHistoryComponent } from './users/user-request-history/user-request-history.component';
import { UserProfileComponent } from './users/user-profile/user-profile.component';
import { HospitalProfileComponent } from './hospital/hospital-profile/hospital-profile.component';
import { HospitalSignupComponent } from './hospital/hospital-signup/hospital-signup.component';
import { BloodbankSignupComponent } from './bloodbank/bloodbank-signup/bloodbank-signup.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ListOfHospitalsComponent } from './admin/list-of-hospitals/list-of-hospitals.component';
import { ListOfBloodbanksComponent } from './admin/list-of-bloodbanks/list-of-bloodbanks.component';
import { ListOfUsersComponent } from './admin/list-of-users/list-of-users.component';
import { UpdateHospitalComponent } from './update/update-hospital/update-hospital.component';
import { UpdateBloodbankComponent } from './update/update-bloodbank/update-bloodbank.component';
import { UpdateUsersComponent } from './update/update-users/update-users.component';
import { ViewHospitalComponent } from './admin/view-hospital/view-hospital.component';
import { ViewBloodbankComponent } from './admin/view-bloodbank/view-bloodbank.component';
import { ViewUsersComponent } from './admin/view-users/view-users.component';
import { LogoutComponent } from './pages/logout/logout.component';
import { AdminLayoutComponent } from './admin-layout/admin-layout.component';
import { HospitalLayoutComponent } from './hospital-layout/hospital-layout.component';
import { BloodBankLayoutComponent } from './blood-bank-layout/blood-bank-layout.component';
import { AdminSidebarComponent } from './admin/admin-sidebar/admin-sidebar.component';
import { BloodbankSidebarComponent } from './bloodbank/bloodbank-sidebar/bloodbank-sidebar.component';
import { HospitalSidebarComponent } from './hospital/hospital-sidebar/hospital-sidebar.component';
import { UsersSidebarComponent } from './users/users-sidebar/users-sidebar.component';
import { UserBloodRequestComponent } from './user-blood-request/user-blood-request.component';
import { ViewusersbloodrequestComponent } from './viewusersbloodrequest/viewusersbloodrequest.component';
import { ListofbloodavailabilityComponent } from './listofbloodavailability/listofbloodavailability.component';
import { AddbloodavailabilityComponent } from './bloodbank/addbloodavailability/addbloodavailability.component';
import { BloodbankDashboardComponent } from './bloodbank/bloodbank-dashboard/bloodbank-dashboard.component';
import { AllBloodStatusUpdateComponent } from './bloodbank/all-blood-status-update/all-blood-status-update.component';
import { BloodbankProfileComponent } from './bloodbank/bloodbank-profile/bloodbank-profile.component';
import { AddNewHospitalComponent } from './admin/add-new-hospital/add-new-hospital.component';
import { AddNewBloodbankComponent } from './admin/add-new-bloodbank/add-new-bloodbank.component';
import { AddNewUsersComponent } from './admin/add-new-users/add-new-users.component';
import { AddNewBloodAvailabilityComponent } from './bloodbank/add-new-blood-availability/add-new-blood-availability.component';
import { TermsAndConditionComponent } from './terms-and-condition/terms-and-condition.component';
import { NgxPaginationModule } from 'ngx-pagination';
// import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { ViewAllBloodBanksInUsersComponent } from './users/view-all-blood-banks-in-users/view-all-blood-banks-in-users.component';
import { ViewBloodAvailabilityInUserComponent } from './users/view-blood-availability-in-user/view-blood-availability-in-user.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { ViewAllBloodRequestComponent } from './admin/view-all-blood-request/view-all-blood-request.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    AboutComponent,
    LoginComponent,
    UsersLayoutComponent,
    SidebarComponent,
    SignupComponent,
    FooterComponent,
    UserSignupComponent,
    UserRequestHistoryComponent,
    UserProfileComponent,
    HospitalProfileComponent,
    HospitalSignupComponent,
    BloodbankSignupComponent,
    ListOfHospitalsComponent,
    ListOfBloodbanksComponent,
    ListOfUsersComponent,
    UpdateHospitalComponent,
    UpdateBloodbankComponent,
    UpdateUsersComponent,
    ViewHospitalComponent,
    ViewBloodbankComponent,
    ViewUsersComponent,
    LogoutComponent,
    AdminLayoutComponent,
    HospitalLayoutComponent,
    BloodBankLayoutComponent,
    AdminSidebarComponent,
    BloodbankSidebarComponent,
    HospitalSidebarComponent,
    UsersSidebarComponent,
    ViewusersbloodrequestComponent,
    ListofbloodavailabilityComponent,
    AddbloodavailabilityComponent,
    BloodbankDashboardComponent,
    AllBloodStatusUpdateComponent,
    BloodbankProfileComponent,
    AddNewHospitalComponent,
    AddNewBloodbankComponent,
    AddNewUsersComponent,
    AddNewBloodAvailabilityComponent,
    TermsAndConditionComponent,
    ViewAllBloodBanksInUsersComponent,
    ViewBloodAvailabilityInUserComponent,
    ForgotPasswordComponent,
    UserBloodRequestComponent,
    ViewAllBloodRequestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgxPaginationModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
