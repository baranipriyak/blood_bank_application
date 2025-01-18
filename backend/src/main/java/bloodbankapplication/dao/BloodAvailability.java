package bloodbankapplication.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BloodAvailability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bloodavailabilityid;
	private int a_plus;
	private int a_minus;
	private int b_plus;
	private int b_minus;
	private int ab_plus;
	private int ab_minus;
	private int o_plus;
	private int o_minus;
	private int a1_plus;
	private int a1_minus;
	private int a2_plus;
	private int a2_minus;
	private int a1b_plus;
	private int a1b_minus;
	private int a2b_plus;
	private int a2b_minus;
	private int oh_minus;
	private int rh_minus;
	private int userid;
	public BloodAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodAvailability(int bloodavailabilityid, int a_plus, int a_minus, int b_plus, int b_minus, int ab_plus,
			int ab_minus, int o_plus, int o_minus, int a1_plus, int a1_minus, int a2_plus, int a2_minus, int a1b_plus,
			int a1b_minus, int a2b_plus, int a2b_minus, int oh_minus, int rh_minus, int userid) {
		super();
		this.bloodavailabilityid = bloodavailabilityid;
		this.a_plus = a_plus;
		this.a_minus = a_minus;
		this.b_plus = b_plus;
		this.b_minus = b_minus;
		this.ab_plus = ab_plus;
		this.ab_minus = ab_minus;
		this.o_plus = o_plus;
		this.o_minus = o_minus;
		this.a1_plus = a1_plus;
		this.a1_minus = a1_minus;
		this.a2_plus = a2_plus;
		this.a2_minus = a2_minus;
		this.a1b_plus = a1b_plus;
		this.a1b_minus = a1b_minus;
		this.a2b_plus = a2b_plus;
		this.a2b_minus = a2b_minus;
		this.oh_minus = oh_minus;
		this.rh_minus = rh_minus;
		this.userid = userid;
	}
	public int getBloodavailabilityid() {
		return bloodavailabilityid;
	}
	public void setBloodavailabilityid(int bloodavailabilityid) {
		this.bloodavailabilityid = bloodavailabilityid;
	}
	public int getA_plus() {
		return a_plus;
	}
	public void setA_plus(int a_plus) {
		this.a_plus = a_plus;
	}
	public int getA_minus() {
		return a_minus;
	}
	public void setA_minus(int a_minus) {
		this.a_minus = a_minus;
	}
	public int getB_plus() {
		return b_plus;
	}
	public void setB_plus(int b_plus) {
		this.b_plus = b_plus;
	}
	public int getB_minus() {
		return b_minus;
	}
	public void setB_minus(int b_minus) {
		this.b_minus = b_minus;
	}
	public int getAb_plus() {
		return ab_plus;
	}
	public void setAb_plus(int ab_plus) {
		this.ab_plus = ab_plus;
	}
	public int getAb_minus() {
		return ab_minus;
	}
	public void setAb_minus(int ab_minus) {
		this.ab_minus = ab_minus;
	}
	public int getO_plus() {
		return o_plus;
	}
	public void setO_plus(int o_plus) {
		this.o_plus = o_plus;
	}
	public int getO_minus() {
		return o_minus;
	}
	public void setO_minus(int o_minus) {
		this.o_minus = o_minus;
	}
	public int getA1_plus() {
		return a1_plus;
	}
	public void setA1_plus(int a1_plus) {
		this.a1_plus = a1_plus;
	}
	public int getA1_minus() {
		return a1_minus;
	}
	public void setA1_minus(int a1_minus) {
		this.a1_minus = a1_minus;
	}
	public int getA2_plus() {
		return a2_plus;
	}
	public void setA2_plus(int a2_plus) {
		this.a2_plus = a2_plus;
	}
	public int getA2_minus() {
		return a2_minus;
	}
	public void setA2_minus(int a2_minus) {
		this.a2_minus = a2_minus;
	}
	public int getA1b_plus() {
		return a1b_plus;
	}
	public void setA1b_plus(int a1b_plus) {
		this.a1b_plus = a1b_plus;
	}
	public int getA1b_minus() {
		return a1b_minus;
	}
	public void setA1b_minus(int a1b_minus) {
		this.a1b_minus = a1b_minus;
	}
	public int getA2b_plus() {
		return a2b_plus;
	}
	public void setA2b_plus(int a2b_plus) {
		this.a2b_plus = a2b_plus;
	}
	public int getA2b_minus() {
		return a2b_minus;
	}
	public void setA2b_minus(int a2b_minus) {
		this.a2b_minus = a2b_minus;
	}
	public int getOh_minus() {
		return oh_minus;
	}
	public void setOh_minus(int oh_minus) {
		this.oh_minus = oh_minus;
	}
	public int getRh_minus() {
		return rh_minus;
	}
	public void setRh_minus(int rh_minus) {
		this.rh_minus = rh_minus;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "BloodAvailability [bloodavailabilityid=" + bloodavailabilityid + ", a_plus=" + a_plus + ", a_minus="
				+ a_minus + ", b_plus=" + b_plus + ", b_minus=" + b_minus + ", ab_plus=" + ab_plus + ", ab_minus="
				+ ab_minus + ", o_plus=" + o_plus + ", o_minus=" + o_minus + ", a1_plus=" + a1_plus + ", a1_minus="
				+ a1_minus + ", a2_plus=" + a2_plus + ", a2_minus=" + a2_minus + ", a1b_plus=" + a1b_plus
				+ ", a1b_minus=" + a1b_minus + ", a2b_plus=" + a2b_plus + ", a2b_minus=" + a2b_minus + ", oh_minus="
				+ oh_minus + ", rh_minus=" + rh_minus + ", userid=" + userid + "]";
	}
		
	
	
	
	

}
