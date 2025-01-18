export class Usersbloodrequest {
    requestid:number;
    bloodgroup:string;
    requiredunit:number;
    reason:string;
    requeststartdate:Date;
    requestenddate:Date;
    fullfillmentstatus:string;
    fullfilleddate:string;
    contactdetails:string;
    priority:string;
    userid:number;
    role:string;
    acceptoruserid:number;
    acceptorrole:string;
    status:string;

    constructor(requestid:number,bloodgroup:string,requiredunit:number,reason:string,requeststartdate:Date,requestenddate:Date,fullfillmentstatus:string,fullfilleddate:string,contactdetails:string,priority:string,role:string,userid:number,acceptoruserid:number,acceptorrole:string,status:string){
        this.requestid=requestid;
        this.bloodgroup=bloodgroup;
        this.requiredunit=requiredunit;
        this.reason=reason;
        this.requeststartdate=requeststartdate;
        this.requestenddate=requestenddate;
        this.fullfillmentstatus=fullfillmentstatus;
        this.fullfilleddate=fullfilleddate;
        this.contactdetails = contactdetails;
        this.priority=priority;
        this.role=role;
        this.userid=userid;
        this.acceptoruserid=acceptoruserid;
        this.acceptorrole=acceptorrole;
        this.status=status;
    }

}

