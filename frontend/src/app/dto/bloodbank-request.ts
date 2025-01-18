import { Address } from "../dao/address";
import { Bloodavailability } from "../dao/bloodavailability";
import { Bloodbankcenter } from "../dao/bloodbankcenter";
import { Document } from "../dao/document";
import { User } from "../dao/user";

export class BloodbankRequest {
    bloodBankCenter:Bloodbankcenter;
    user:User;
    address:Address;
    document:Document;

    constructor(bloodBankCenter:Bloodbankcenter,user:User,address:Address,document:Document){
        this.bloodBankCenter=bloodBankCenter;
        this.user=user;
        this.address=address;
        this.document=document;
   
    }
}
