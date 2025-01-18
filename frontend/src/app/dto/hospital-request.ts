import { Address } from "../dao/address";
import { Document } from "../dao/document";
import { Hospital } from "../dao/hospital";
import { User } from "../dao/user";

export class HospitalRequest {
    hospital:Hospital;
    user:User;
    address:Address;
    document:Document;

    constructor(hospital:Hospital,user:User,address:Address,document:Document){
        this.hospital=hospital;
        this.user=user;
        this.address=address;
        this.document=document;
    }
}
