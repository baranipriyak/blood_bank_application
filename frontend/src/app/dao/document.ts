export class Document {
    documentid:number;
    proffofaddress:string;
    gstnumber:string;
    taxdocument:string;
    imcdocument:string;
    bloodbanklicence:string;
    accredidationcertificate:string;
    identificationdocument:string;
    authorizedpersonphoto:string;

    constructor(documentid:number,proffofaddress:string,gstnumber:string,taxdocument:string, imcdocument:string, bloodbanklicence:string, accredidationcertificate:string, identificationdocument:string,authorizedpersonphoto:string){
        this.documentid=documentid;
        this.proffofaddress=proffofaddress;
        this.gstnumber=gstnumber;
        this.taxdocument=taxdocument;
        this.imcdocument=imcdocument;
        this.bloodbanklicence=bloodbanklicence;
        this.accredidationcertificate=accredidationcertificate;
        this.identificationdocument=identificationdocument;
        this.authorizedpersonphoto=authorizedpersonphoto;
    }
}
