package bloodbankapplication.dto;

import bloodbankapplication.dao.Address;
import bloodbankapplication.dao.Document;
import bloodbankapplication.dao.Hospital;
import bloodbankapplication.dao.User;

public class HospitalRequest {
	
	private Hospital hospital;
	private Address address;
	private Document document;
	private User user;
	public HospitalRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HospitalRequest(Hospital hospital, Address address, Document document, User user) {
		super();
		this.hospital = hospital;
		this.address = address;
		this.document = document;
		this.user = user;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "HospitalRequest [hospital=" + hospital + ", address=" + address + ", document=" + document + ", user="
				+ user + "]";
	}
	
	

}
