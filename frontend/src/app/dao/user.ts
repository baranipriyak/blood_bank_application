export class User {
    userid:number;
    username:string;
    password:string;
    role:string;
    message:string;
    status:string;

    constructor(userid:number,username:string,password:string,role:string,message:string,status:string){
        this.userid=userid;
        this.username=username;
        this.password=password;
        this.role=role;
        this.message=message;
        this.status=status;
    }
}
