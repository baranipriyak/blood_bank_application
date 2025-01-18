package bloodbankapplication.dto;

import bloodbankapplication.dao.Address;
import bloodbankapplication.dao.BloodBankCenter;
import bloodbankapplication.dao.Document;
import bloodbankapplication.dao.User;

public class BloodBankCenterRequest {

	private BloodBankCenter bloodBankCenter;
	private Address address;
	private Document document;
	private User user;
	
	public BloodBankCenterRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodBankCenterRequest(BloodBankCenter bloodBankCenter, Address address, Document document, User user) {
		super();
		this.bloodBankCenter = bloodBankCenter;
		this.address = address;
		this.document = document;
		this.user = user;
		
	}
	public BloodBankCenter getBloodBankCenter() {
		return bloodBankCenter;
	}
	public void setBloodBankCenter(BloodBankCenter bloodBankCenter) {
		this.bloodBankCenter = bloodBankCenter;
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
		return "BloodBankCenterRequest [bloodBankCenter=" + bloodBankCenter + ", address=" + address + ", document="
				+ document + ", user=" + user +  "]";
	}
	
	
	
}
