package bloodbankapplication.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalid;
	
	@NotEmpty(message="Enter the name")
	@Column(nullable=false,length = 50)
	private String hospitalname;
	
	@Pattern(regexp = "^[6-9]\\d{0,9}$")
	@Column(length = 10,unique = true)
	@NotEmpty(message = "Enter Phone number")
	private String hospitalphonenumber;
	
	@Pattern(regexp = "[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-z]{2,3}", message = "Invalid email address")
	@Column(unique = true,length = 50)
	@NotEmpty(message = "Enter email id")
	private String hospitalemail;
	
	@NotEmpty(message="Enter the role")
	@Column(length = 20,nullable = false)
	private final String role="hospital";
	
	@OneToOne
	@JoinColumn(name ="userid",referencedColumnName = "userid")
	@JsonIgnoreProperties({"username", "password", "role","usersBloodRequest", "address","document"}) // Ignore other User fields
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Document document;
	
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital( String hospitalname, String hospitalphonenumber, String hospitalemail) {
		super();
		
		this.hospitalname = hospitalname;
		this.hospitalphonenumber = hospitalphonenumber;
		this.hospitalemail = hospitalemail;
	}
	public int getHospitalid() {
		return hospitalid;
	}
	public void setHospitalid(int hospitalid) {
		this.hospitalid = hospitalid;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public String getHospitalphonenumber() {
		return hospitalphonenumber;
	}
	public void setHospitalphonenumber(String hospitalphonenumber) {
		this.hospitalphonenumber = hospitalphonenumber;
	}
	public String getHospitalemail() {
		return hospitalemail;
	}
	public void setHospitalemail(String hospitalemail) {
		this.hospitalemail = hospitalemail;
	}
	public String getRole() {
		return role;
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
	@Override
	public String toString() {
		return "Hospital [hospitalid=" + hospitalid + ", hospitalname=" + hospitalname + ", hospitalphonenumber="
				+ hospitalphonenumber + ", hospitalemail=" + hospitalemail + ", role=" + role + "]";
	}
	
	

}
