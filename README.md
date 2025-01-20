# Blood Bank Management System

This project is a **Blood Bank Management System** designed to facilitate the exchange of blood between different roles in the system. It provides a platform for users such as **Users**, **Hospitals**, **Blood Banks**, and **Admins** to interact with the system based on their respective permissions. The application uses **Angular** for the frontend and **Spring Boot** (with Spring Tool Suite 4) for the backend, with **MySQL** as the database.

---

## Features
1. **Role-Based Access**:  
   - **User**: Can register, update personal details, and donate blood. Can search for available blood, place a request, and track it.  
   - **Hospital**: Can request blood for patients and view availability.  
   - **Blood Bank**: Manages inventory, processes donations, and fulfills requests.  
   - **Admin**: Manages users, monitors transactions, and handles system configurations.  

2. **Blood Exchange Workflow**:  
   - Users and Hospitals can request blood based on type and availability.
   - Users and Blood Banks can donate blood to fulfill requests.
   - Hospitals do not donate blood through this application. If a hospital has its own blood bank, it must create a separate Blood  Bank account within this application to manage donations and inventory.

3. **Interactive Dashboard**: Tailored dashboards for each role to facilitate their respective workflows.  

4. **Authentication and Authorization**: Secure login and role-based access control ensure only authorized users can access specific features.

---

## Tech Stack
- **Frontend**: Angular  
- **Backend**: Spring Boot (Spring Tool Suite 4)  
- **Database**: MySQL

---

## Folder Structure
```
.
└── backend/
    ├── .classpath
    ├── .gitattributes
    ├── .gitignore
    ├── .project
    ├── HELP.md
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src/
        └── main/
            └── java/
                └── bloodbankapplication/
                    ├── BloodBankApplication1Application.java
                    └── controller/
                        ├── AddressController.java
                        ├── BloodAvailabilityController.java
                        ├── BloodBankCenterController.java
                        ├── HospitalController.java
                        ├── LoginController.java
                        ├── UserController.java
                        ├── UsersBloodRequestController.java
                        ├── UsersController.java
                        └── ValidateHandler.java
                    └── dao/
                        ├── Address.java
                        ├── BloodAvailability.java
                        ├── BloodBankCenter.java
                        ├── Document.java
                        ├── ErrorMessage.java
                        ├── Hospital.java
                        ├── User.java
                        ├── Users.java
                        └── UsersBloodRequest.java
                    └── dto/
                        ├── AcceptRequest.java
                        ├── BloodBankCenterRequest.java
                        ├── HospitalRequest.java
                        ├── LoginRequest.java
                        ├── RejectionRequest.java
                        ├── UpdateBloodAvailabilityRequest.java
                        └── UsersRequest.java
                    └── error/
                        ├── GlobalException.java
                        └── RestResponseEntityExceptionHandler.java
                    └── repository/
                        ├── AddressRepository.java
                        ├── BloodAvailabilityRepository.java
                        ├── BloodBankCenterRepository.java
                        ├── DocumentRepository.java
                        ├── HospitalRepository.java
                        ├── UserRepository.java
                        ├── UsersBloodRequestRepository.java
                        └── UsersRepository.java
                    └── service/
                        ├── AddressService.java
                        ├── AddressServiceImpl.java
                        ├── BloodAvailabilityService.java
                        ├── BloodAvailablityServiceImpl.java
                        ├── BloodBankCenterService.java
                        ├── BloodBankCenterServiceImpl.java
                        ├── HospitalService.java
                        ├── HospitalServiceImpl.java
                        ├── LoginService.java
                        ├── LoginServiceImpl.java
                        ├── UsersBloodRequestService.java
                        ├── UsersBloodRequestServiceImpl.java
                        ├── UserService.java
                        ├── UserServiceImpl.java
                        ├── UsersService.java
                        └── UsersServiceImpl.java
            └── resources/
                ├── application.properties
                └── static/
                └── templates/
        └── test/
            └── java/
                └── bloodbankapplication/
                    └── BloodBankApplication1ApplicationTests.java
├── frontend/
    ├── .editorconfig
    ├── .gitignore
    ├── angular.json
    ├── package-lock.json
    ├── package.json
    └── public/
        ├── favicon-old.ico
        ├── favicon.ico
        └── images/
            └── Blood donation-rafiki.png
    ├── README.md
    └── src/
        └── app/
            └── admin/
                └── add-new-bloodbank/
                    ├── add-new-bloodbank.component.css
                    ├── add-new-bloodbank.component.html
                    ├── add-new-bloodbank.component.spec.ts
                    └── add-new-bloodbank.component.ts
                └── add-new-hospital/
                    ├── add-new-hospital.component.css
                    ├── add-new-hospital.component.html
                    ├── add-new-hospital.component.spec.ts
                    └── add-new-hospital.component.ts
                └── add-new-users/
                    ├── add-new-users.component.css
                    ├── add-new-users.component.html
                    ├── add-new-users.component.spec.ts
                    └── add-new-users.component.ts
                └── admin-sidebar/
                    ├── admin-sidebar.component.css
                    ├── admin-sidebar.component.html
                    ├── admin-sidebar.component.spec.ts
                    └── admin-sidebar.component.ts
                └── list-of-bloodbanks/
                    ├── list-of-bloodbanks.component.css
                    ├── list-of-bloodbanks.component.html
                    ├── list-of-bloodbanks.component.spec.ts
                    └── list-of-bloodbanks.component.ts
                └── list-of-hospitals/
                    ├── list-of-hospitals.component.css
                    ├── list-of-hospitals.component.html
                    ├── list-of-hospitals.component.spec.ts
                    └── list-of-hospitals.component.ts
                └── list-of-users/
                    ├── list-of-users.component.css
                    ├── list-of-users.component.html
                    ├── list-of-users.component.spec.ts
                    └── list-of-users.component.ts
                └── view-all-blood-request/
                    ├── view-all-blood-request.component.css
                    ├── view-all-blood-request.component.html
                    ├── view-all-blood-request.component.spec.ts
                    └── view-all-blood-request.component.ts
                └── view-bloodbank/
                    ├── view-bloodbank.component.css
                    ├── view-bloodbank.component.html
                    ├── view-bloodbank.component.spec.ts
                    └── view-bloodbank.component.ts
                └── view-hospital/
                    ├── view-hospital.component.css
                    ├── view-hospital.component.html
                    ├── view-hospital.component.spec.ts
                    └── view-hospital.component.ts
                └── view-users/
                    ├── view-users.component.css
                    ├── view-users.component.html
                    ├── view-users.component.spec.ts
                    └── view-users.component.ts
            └── admin-layout/
                ├── admin-layout.component.css
                ├── admin-layout.component.html
                ├── admin-layout.component.spec.ts
                └── admin-layout.component.ts
            ├── app-routing.module.ts
            ├── app.component.css
            ├── app.component.html
            ├── app.component.spec.ts
            ├── app.component.ts
            ├── app.module.ts
            └── blood-bank-layout/
                ├── blood-bank-layout.component.css
                ├── blood-bank-layout.component.html
                ├── blood-bank-layout.component.spec.ts
                └── blood-bank-layout.component.ts
            └── bloodbank/
                └── add-new-blood-availability/
                    ├── add-new-blood-availability.component.css
                    ├── add-new-blood-availability.component.html
                    ├── add-new-blood-availability.component.spec.ts
                    └── add-new-blood-availability.component.ts
                └── addbloodavailability/
                    ├── addbloodavailability.component.css
                    ├── addbloodavailability.component.html
                    ├── addbloodavailability.component.spec.ts
                    └── addbloodavailability.component.ts
                └── all-blood-status-update/
                    ├── all-blood-status-update.component.css
                    ├── all-blood-status-update.component.html
                    ├── all-blood-status-update.component.spec.ts
                    └── all-blood-status-update.component.ts
                └── bloodbank-dashboard/
                    ├── bloodbank-dashboard.component.css
                    ├── bloodbank-dashboard.component.html
                    ├── bloodbank-dashboard.component.spec.ts
                    └── bloodbank-dashboard.component.ts
                └── bloodbank-profile/
                    ├── bloodbank-profile.component.css
                    ├── bloodbank-profile.component.html
                    ├── bloodbank-profile.component.spec.ts
                    └── bloodbank-profile.component.ts
                └── bloodbank-sidebar/
                    ├── bloodbank-sidebar.component.css
                    ├── bloodbank-sidebar.component.html
                    ├── bloodbank-sidebar.component.spec.ts
                    └── bloodbank-sidebar.component.ts
                └── bloodbank-signup/
                    ├── bloodbank-signup.component.css
                    ├── bloodbank-signup.component.html
                    ├── bloodbank-signup.component.spec.ts
                    └── bloodbank-signup.component.ts
            └── components/
                └── utils/
                    └── footer/
                        ├── footer.component.css
                        ├── footer.component.html
                        ├── footer.component.spec.ts
                        └── footer.component.ts
                    └── navbar/
                        ├── navbar.component.css
                        ├── navbar.component.html
                        ├── navbar.component.spec.ts
                        └── navbar.component.ts
                    └── sidebar/
                        ├── sidebar.component.css
                        ├── sidebar.component.html
                        ├── sidebar.component.spec.ts
                        └── sidebar.component.ts
            └── dao/
                ├── address.spec.ts
                ├── address.ts
                ├── bloodavailability.spec.ts
                ├── bloodavailability.ts
                ├── bloodbankcenter.spec.ts
                ├── bloodbankcenter.ts
                ├── document.spec.ts
                ├── document.ts
                ├── hospital.spec.ts
                ├── hospital.ts
                ├── user.spec.ts
                ├── user.ts
                ├── users.spec.ts
                ├── users.ts
                ├── usersbloodrequest.spec.ts
                └── usersbloodrequest.ts
            └── dto/
                ├── bloodbank-request.spec.ts
                ├── bloodbank-request.ts
                ├── forgotpassword.spec.ts
                ├── forgotpassword.ts
                ├── hospital-request.spec.ts
                ├── hospital-request.ts
                ├── login-request.spec.ts
                ├── login-request.ts
                ├── login.spec.ts
                ├── loginrequest.spec.ts
                ├── loginrequest.ts
                ├── users-request.spec.ts
                └── users-request.ts
            └── forgot-password/
                ├── forgot-password.component.css
                ├── forgot-password.component.html
                ├── forgot-password.component.spec.ts
                └── forgot-password.component.ts
            └── hospital/
                └── hospital-profile/
                    ├── hospital-profile.component.css
                    ├── hospital-profile.component.html
                    ├── hospital-profile.component.spec.ts
                    └── hospital-profile.component.ts
                └── hospital-sidebar/
                    ├── hospital-sidebar.component.css
                    ├── hospital-sidebar.component.html
                    ├── hospital-sidebar.component.spec.ts
                    └── hospital-sidebar.component.ts
                └── hospital-signup/
                    ├── hospital-signup.component.css
                    ├── hospital-signup.component.html
                    ├── hospital-signup.component.spec.ts
                    └── hospital-signup.component.ts
            └── hospital-layout/
                ├── hospital-layout.component.css
                ├── hospital-layout.component.html
                ├── hospital-layout.component.spec.ts
                └── hospital-layout.component.ts
            └── listofbloodavailability/
                ├── listofbloodavailability.component.css
                ├── listofbloodavailability.component.html
                ├── listofbloodavailability.component.spec.ts
                └── listofbloodavailability.component.ts
            └── pages/
                └── about/
                    ├── about.component.css
                    ├── about.component.html
                    ├── about.component.spec.ts
                    └── about.component.ts
                └── home/
                    ├── home.component.css
                    ├── home.component.html
                    ├── home.component.spec.ts
                    └── home.component.ts
                └── login/
                    ├── login.component.css
                    ├── login.component.html
                    ├── login.component.spec.ts
                    └── login.component.ts
                └── logout/
                    ├── logout.component.css
                    ├── logout.component.html
                    ├── logout.component.spec.ts
                    └── logout.component.ts
                └── signup/
                    ├── signup.component.css
                    ├── signup.component.html
                    ├── signup.component.spec.ts
                    └── signup.component.ts
            └── services/
                ├── bloodavailability.service.spec.ts
                ├── bloodavailability.service.ts
                ├── bloodbank.service.spec.ts
                ├── bloodbank.service.ts
                ├── hardcodedauthendication.service.spec.ts
                ├── hardcodedauthendication.service.ts
                ├── hospital.service.spec.ts
                ├── hospital.service.ts
                ├── user.service.spec.ts
                ├── user.service.ts
                ├── users.service.spec.ts
                ├── users.service.ts
                ├── usersbloodrequest.service.spec.ts
                └── usersbloodrequest.service.ts
            └── terms-and-condition/
                ├── terms-and-condition.component.css
                ├── terms-and-condition.component.html
                ├── terms-and-condition.component.spec.ts
                └── terms-and-condition.component.ts
            └── update/
                └── update-bloodbank/
                    ├── update-bloodbank.component.css
                    ├── update-bloodbank.component.html
                    ├── update-bloodbank.component.spec.ts
                    └── update-bloodbank.component.ts
                └── update-hospital/
                    ├── update-hospital.component.css
                    ├── update-hospital.component.html
                    ├── update-hospital.component.spec.ts
                    └── update-hospital.component.ts
                └── update-users/
                    ├── update-users.component.css
                    ├── update-users.component.html
                    ├── update-users.component.spec.ts
                    └── update-users.component.ts
            └── user-blood-request/
                ├── user-blood-request.component.css
                ├── user-blood-request.component.html
                ├── user-blood-request.component.spec.ts
                └── user-blood-request.component.ts
            └── users/
                └── user-profile/
                    ├── user-profile.component.css
                    ├── user-profile.component.html
                    ├── user-profile.component.spec.ts
                    └── user-profile.component.ts
                └── user-request-history/
                    ├── user-request-history.component.css
                    ├── user-request-history.component.html
                    ├── user-request-history.component.spec.ts
                    └── user-request-history.component.ts
                └── user-signup/
                    ├── user-signup.component.css
                    ├── user-signup.component.html
                    ├── user-signup.component.spec.ts
                    └── user-signup.component.ts
                └── users-sidebar/
                    ├── users-sidebar.component.css
                    ├── users-sidebar.component.html
                    ├── users-sidebar.component.spec.ts
                    └── users-sidebar.component.ts
                └── view-all-blood-banks-in-users/
                    ├── view-all-blood-banks-in-users.component.css
                    ├── view-all-blood-banks-in-users.component.html
                    ├── view-all-blood-banks-in-users.component.spec.ts
                    └── view-all-blood-banks-in-users.component.ts
                └── view-blood-availability-in-user/
                    ├── view-blood-availability-in-user.component.css
                    ├── view-blood-availability-in-user.component.html
                    ├── view-blood-availability-in-user.component.spec.ts
                    └── view-blood-availability-in-user.component.ts
            └── users-layout/
                ├── users-layout.component.css
                ├── users-layout.component.html
                ├── users-layout.component.spec.ts
                └── users-layout.component.ts
            └── viewusersbloodrequest/
                ├── viewusersbloodrequest.component.css
                ├── viewusersbloodrequest.component.html
                ├── viewusersbloodrequest.component.spec.ts
                └── viewusersbloodrequest.component.ts
        ├── index.html
        ├── input.css
        ├── main.ts
        ├── style.css
        └── styles.css
    ├── tailwind.config.js
    ├── tsconfig.app.json
    ├── tsconfig.json
    └── tsconfig.spec.json
└── README.md
```

---

## Installation and Setup

### Prerequisites
1. **Frontend**:  
   - Node.js and npm (for the Angular application)

2. **Backend**:  
   - Java 11 or higher  
   - Spring Tool Suite 4 (STS 4)  
   - MySQL Database  

---

### Steps to Run the Application

#### Backend Setup
1. **Database Configuration**:  
   - Ensure MySQL is installed and running.  
   - Create a new database for the application (e.g., `blood_bank`).  
   - Update the `application.properties` file with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/blood_bank
     spring.datasource.username=your_mysql_username
     spring.datasource.password=your_mysql_password
     spring.jpa.hibernate.ddl-auto=update
     ```

2. **Running the Backend**:  
   - Open the `backend/` folder in Spring Tool Suite 4.  
   - Run the `Application.java` file as a Spring Boot Application.  
   - Verify the backend is running at `http://localhost:9090`.

#### Frontend Setup
1. **Frontend Installation**:  
   - Navigate to the `frontend/` folder:  
     ```bash
     cd frontend
     ```
   - Install the required dependencies:  
     ```bash
     npm install
     ```

2. **Running the Frontend**:  
   - Start the Angular development server:  
     ```bash
     ng serve -o
     ```
   - Access the frontend application at `http://localhost:4200`.

---

## Workflow
### User:
1. Register and log in as a donor.
2. View your donation history and upcoming donation opportunities.
3. Donate blood by visiting a blood bank.
4. Search for available blood by type and location.
5. Place a request and monitor the request status.
6. Receive notifications about approval or denial.

### Hospital:
1. Log in as a hospital.
2. View blood availability and place bulk requests for patients.
3. Track requests and manage blood deliveries.

### Blood Bank:
1. Manage inventory and log donations.
2. Process requests from hospitals and receivers.
3. Update blood availability and donation history.

### Admin:
1. View and manage all users and roles.
2. Monitor transactions and blood inventory.
3. Configure system settings and generate reports.

---

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact
For any questions or support, please contact:
- **Email**: vbaranipriya@gmail.com
- **GitHub**: [Baranipriya V](https://github.com/baranipriyak)
