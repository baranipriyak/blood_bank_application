export class Bloodavailability {
    bloodavailabilityid:number;
    a_plus:number;
    a_minus:number;
    b_plus:number;
    b_minus:number;
    ab_plus:number;
    ab_minus:number;
    o_plus:number;
    o_minus:number;
    a1_plus:number;
    a1_minus:number;
    a2_plus:number;
    a2_minus:number;
    a1b_plus:number;
    a1b_minus:number;
    a2b_plus:number;
    a2b_minus:number;
    oh_minus:number;
    rh_minus:number;
    userid:number;

    constructor(bloodavailabilityid:number,a_plus:number,a_minus:number,b_plus:number,b_minus:number,ab_plus:number,ab_minus:number,o_plus:number,o_minus:number,a1_plus:number,a1_minus:number,a2_plus:number,a2_minus:number,a1b_plus:number,a1b_minus:number,a2b_plus:number,a2b_minus:number,oh_minus:number,rh_minus:number,userid:number){
        this.bloodavailabilityid=bloodavailabilityid;
        this.a_plus=a_plus;
        this.a_minus=a_minus;
        this.b_plus=b_plus;
        this.b_minus=b_minus;
        this.ab_plus=ab_plus;
        this.ab_minus=ab_minus;
        this.o_plus=o_plus;
        this.o_minus=o_minus;
        this.a1_plus=a1_plus;
        this.a1_minus=a1_minus;
        this.a2_plus=a2_plus;
        this.a2_minus=a2_minus;
        this.a1b_plus=a1b_plus;
        this.a1b_minus=a1b_minus;
        this.a2b_plus=a2b_plus;
        this.a2b_minus=a2b_minus;
        this.oh_minus=oh_minus;
        this.rh_minus=rh_minus;
        this.userid=userid;
    }
}
