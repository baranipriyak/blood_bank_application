package bloodbankapplication.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class BloodBankCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bloodbankid;
	
	@NotEmpty(message="Enter the name")
	@Column(nullable=false,length = 50)
	private String bloodbankcentername;
	
	@Pattern(regexp = "[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-z]{2,3}", message = "Invalid email address")
	@Column(unique = true,length = 50)
	@Email//automatically checks with @ and . symbol
	@NotEmpty(message = "Enter email id")
	private String bloodbankemail;
	
	@Pattern(regexp = "^[6-9]\\d{0,9}$")
	@Column(length = 10,unique = true)
	@NotEmpty(message = "Enter Phone number")
	private String bloodbankphonenumber;
	
	@NotEmpty(message="Enter the role")
	@Column(length = 20,nullable = false)
	private final String role="blood bank";
	
	@OneToOne
	@JoinColumn(name ="userid",referencedColumnName = "userid")
	@JsonIgnoreProperties({"username", "password", "role", "address","document"}) // Ignore other User fields
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Document document;

	public BloodBankCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BloodBankCenter(int bloodbankid, String bloodbankcentername, String bloodbankemail,
			String bloodbankphonenumber) {
		super();
		this.bloodbankid = bloodbankid;
		this.bloodbankcentername = bloodbankcentername;
		this.bloodbankemail = bloodbankemail;
		this.bloodbankphonenumber = bloodbankphonenumber;
	}

	public int getBloodbankid() {
		return bloodbankid;
	}

	public void setBloodbankid(int bloodbankid) {
		this.bloodbankid = bloodbankid;
	}

	public String getBloodbankcentername() {
		return bloodbankcentername;
	}

	public void setBloodbankcentername(String bloodbankcentername) {
		this.bloodbankcentername = bloodbankcentername;
	}

	public String getBloodbankemail() {
		return bloodbankemail;
	}

	public void setBloodbankemail(String bloodbankemail) {
		this.bloodbankemail = bloodbankemail;
	}

	public String getBloodbankphonenumber() {
		return bloodbankphonenumber;
	}

	public void setBloodbankphonenumber(String bloodbankphonenumber) {
		this.bloodbankphonenumber = bloodbankphonenumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "BloodBankCenter [bloodbankid=" + bloodbankid + ", bloodbankcentername=" + bloodbankcentername
				+ ", bloodbankemail=" + bloodbankemail + ", bloodbankphonenumber=" + bloodbankphonenumber + ", role="
				+ role + ", user=" + user + ", address=" + address + ", document=" + document + "]";
	}
	
	
	
	
}
