import { Address } from "../dao/address";
import { User } from "../dao/user";
import { Users } from "../dao/users";

export class UsersRequest {
    users:Users;
    user:User;
    address:Address;

    constructor(users:Users,user:User,address:Address){
        this.users=users;
        this.user=user;
        this.address=address;
    }
}
