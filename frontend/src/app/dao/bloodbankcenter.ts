export class Bloodbankcenter {
    bloodbankid:number;
    bloodbankcentername:string;
    bloodbankphonenumber:string;
    bloodbankemail:string;
    role:string;

    constructor(bloodbankid:number,bloodbankcentername:string,bloodbankphonenumber:string,bloodbankemail:string,role:string){
        this.bloodbankid=bloodbankid;
        this.bloodbankcentername=bloodbankcentername;
        this.bloodbankphonenumber=bloodbankphonenumber;
        this.bloodbankemail=bloodbankemail;
        this.role=role;

    }
}
