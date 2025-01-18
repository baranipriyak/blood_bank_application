export class Address {
    addressid:number;
    area:string;
    city:string;
    country:string;
    pincode:string;

    constructor(addressid:number,area:string,city:string,country:string,pincode:string){
        this.addressid=addressid;
        this.area=area;
        this.city=city;
        this.country=country;
        this.pincode=pincode;
    }
}
