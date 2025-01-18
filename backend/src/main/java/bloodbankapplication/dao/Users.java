package bloodbankapplication.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usersid;
	
	@NotEmpty(message = "Enter the Username")
	@Column(nullable = false , length = 50)
	private String usersname;
	
	@Pattern(regexp = "[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-z]{2,3}", message = "Invalid email address")
	@Column(unique = true,length = 50)
	@NotEmpty(message = "Enter email id")
	private String usersemail;
	
	@Pattern(regexp = "^[6-9]\\d{0,9}$")
	@Column(length = 10,unique = true)
	@NotEmpty(message = "Enter Phone number")
	private String usersphonenumber;
	
	@NotEmpty(message = "Enter gender")
	@Column(length = 10)
	private String gender;
	
	@Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must not exceed 100")
	private int age;
	
//	@NotEmpty(message = "Enter the weight")
	private int weight;
	
	@NotEmpty(message = "Blood group is required")
	@Column(length = 30,nullable = false)
	private String usersbloodgroup;
	
	@Column(length = 30)
	private String usersdisease;
	
	@Column(length = 30,nullable = false)
	private final String role = "user";
	
	@OneToOne
	@JoinColumn(name ="userid",referencedColumnName = "userid")
	@JsonIgnoreProperties({"username", "password", "role", "address","document"}) // Ignore other User fields
	private User user;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int usersid, String usersname, String usersemail, String usersphonenumber,String gender, int age, int weight,
			String usersbloodgroup, String usersdisease) {
		super();
		this.usersid = usersid;
		this.usersname = usersname;
		this.usersemail = usersemail;
		this.usersphonenumber = usersphonenumber;
		this.gender=gender;
		this.age = age;
		this.weight = weight;
		this.usersbloodgroup = usersbloodgroup;
		this.usersdisease = usersdisease;
	}
	public int getUsersid() {
		return usersid;
	}
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	public String getUsersname() {
		return usersname;
	}
	public void setUsersname(String usersname) {
		this.usersname = usersname;
	}
	public String getUsersemail() {
		return usersemail;
	}
	public void setUsersemail(String usersemail) {
		this.usersemail = usersemail;
	}
	public String getUsersphonenumber() {
		return usersphonenumber;
	}
	public void setUsersphonenumber(String usersphonenumber) {
		this.usersphonenumber = usersphonenumber;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getUsersbloodgroup() {
		return usersbloodgroup;
	}
	public void setUsersbloodgroup(String usersbloodgroup) {
		this.usersbloodgroup = usersbloodgroup;
	}
	public String getUsersdisease() {
		return usersdisease;
	}
	public void setUsersdisease(String usersdisease) {
		this.usersdisease = usersdisease;
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
	@Override
	public String toString() {
		return "Users [usersid=" + usersid + ", usersname=" + usersname + ", usersemail=" + usersemail
				+ ", usersphonenumber=" + usersphonenumber + ", gender=" + gender + ", age=" + age + ", weight=" + weight
				+ ", usersbloodgroup=" + usersbloodgroup + ", usersdisease=" + usersdisease + ", role=" + role + "]";
	}
	
	
	

}
