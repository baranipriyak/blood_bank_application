export class Users {
    usersid:number;
    usersname:string;
    usersemail:string;
    usersphonenumber:string;
    gender:string;
    age:number;
    weight:number;
    usersbloodgroup:string;
    usersdisease:string;
    role:string;


    constructor(usersid:number,usersname:string,usersemail:string,usersphonenumber:string,gender:string,age:number,weight:number,usersbloodgroup:string,usersdisease:string,role:string){
        this.usersid=usersid;
        this.usersname=usersname;
        this.usersemail=usersemail;
        this.usersphonenumber=usersphonenumber;
        this.gender=gender;
        this.age=age;
        this.weight=weight;
        this.usersbloodgroup=usersbloodgroup;
        this.usersdisease=usersdisease;
        this.role=role;
    }
}
