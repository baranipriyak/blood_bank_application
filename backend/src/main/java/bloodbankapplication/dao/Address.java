package bloodbankapplication.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressid;
	
	@NotEmpty(message = "Enter the area")
	@Column(nullable = false,length = 50)
	private String area;
	
	@NotEmpty(message = "Enter the city")
	@Column(nullable = false,length = 50)
	private String city;
	
	@NotEmpty(message = "Enter the country")
	@Column(nullable = false,length = 50)
	private String country;
	
	@NotEmpty(message = "Enter the pincode")
	@Pattern(
		    regexp = "^[1-9][0-9]{5}$",
		    message = "Invalid pincode. It must be a 6-digit number starting with a non-zero digit."
		)
	@Column(nullable = false,length = 6)
	private String pincode;
	
	@OneToOne
	@JoinColumn(name ="userid",referencedColumnName = "userid")
	@JsonIgnoreProperties({"username", "password", "role", "document","address"}) // Ignore other User fields
	@JsonBackReference
	private User user;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String area, String city, String country, String pincode) {
		super();
		
		this.area = area;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", area=" + area + ", city=" + city + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	
	

}
