package bloodbankapplication.dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	@Pattern(regexp = "[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-z]{2,3}", message = "Invalid email address")
	@Column(unique = true,length = 50)
	@NotEmpty(message = "Enter email id")
	private String username;
	
	//added emailid for login purpose
	
	
	@Pattern(
		    regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
		    message = "Password must have at least one uppercase letter, one lowercase letter, one number, one special character, and be at least 8 characters long"
		)
	@NotEmpty(message = "Enter the Password")
	@Column(nullable = false , length = 50)
	private String password;
	
	@NotEmpty(message = "Enter the role")
	@Column(nullable = false , length = 25)
	private String role;
	
	@Column(nullable = false, columnDefinition = "VARCHAR(25) DEFAULT 'Pending'")
	private String status= "Pending";
	
	@Column(length = 100)
	private String message;
	
	@OneToOne(mappedBy = "user")
	 @JsonManagedReference
	private Address address;
	
	@OneToOne(mappedBy = "user")
	 @JsonManagedReference
	private Document document;
	
	@OneToOne(mappedBy = "user")
	 @JsonBackReference
	private Hospital hospital;
	
//	@OneToOne(mappedBy = "user")
//	 @JsonBackReference
//	private BloodBankCenter bloodBankCenter;
//	
//	@OneToOne(mappedBy = "user")
//	 @JsonBackReference
//	private Users users;
	
//	@OneToMany(mappedBy = "userid")
//	@JsonManagedReference
//	private List<UsersBloodRequest> usersBloodRequest;

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User( String username, String password, String role) {
		super();
		
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	
	
//	public BloodBankCenter getBloodBankCenter() {
//		return bloodBankCenter;
//	}
//	public void setBloodBankCenter(BloodBankCenter bloodBankCenter) {
//		this.bloodBankCenter = bloodBankCenter;
//	}
//	public Users getUsers() {
//		return users;
//	}
//	public void setUsers(Users users) {
//		this.users = users;
//	}
//	public List<UsersBloodRequest> getUsersBloodRequest() {
//		return usersBloodRequest;
//	}
//	public void setUsersBloodRequest(List<UsersBloodRequest> usersBloodRequest) {
//		this.usersBloodRequest = usersBloodRequest;
//	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
}
