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
public class Document {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int documentid;

	 @NotEmpty(message = "Hospital-issued address certificate is required")
	    @Pattern(
	        regexp = "^[A-Za-z]{3}-[0-9]{5}-[0-9]{4}$", // Update regex based on your specific format
	        message = "Hospital-issued address certificate number must follow the format: HSP-12345-2023"
	    )
	 @Column(length = 20)
    private String proffofaddress;
	
	@NotEmpty(message = "GST number is mandatory")
	@Pattern(
	        regexp = "\\d{2}[A-Z]{5}\\d{4}[A-Z]{1}[A-Z\\d]{1}[Z]{1}[A-Z\\d]{1}",
	        message = "GST number must be a valid 15-character alphanumeric GSTIN"
	    )
	@Column(length = 30)
    private String gstnumber;
	
	@NotEmpty(message = "Tax document is required")
    @Pattern(
        regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", // Change this regex if using TIN or another document format
        message = "Tax document must be a valid PAN (format: ABCDE1234F)"
    )
	@Column(length = 30)
    private String taxdocument;
	
//	@Pattern(
//			regexp="^IMC\\d{6}$",
//			message="Invalid document number format (format: IMC678878)"
//			)
	@Column(length = 30)
    private String imcdocument;
    
//	@Pattern(
//			regexp="^BB\\d{6}$",
//			message="Licence number must start with 'BB' followed by 6 digits (e.g., BB123456)"
//			)
	@Column(length = 30)
    private String bloodbanklicence;
    
    @NotEmpty(message = "Medical accreditation certificate number is required")
    @Pattern(
        regexp = "^[A-Za-z0-9/-]{8,20}$", // Update regex based on exact requirements
        message = "Medical accreditation certificate number must be 8 to 20 characters long and can include letters, numbers, '-' or '/'"
    )
    @Column(length = 30)
    private String accredidationcertificate;
    
    @NotEmpty(message = "Proof of address cannot be blank")
    @Pattern(
        regexp = "^[2-9]{1}[0-9]{11}$",
        message = "Proof of address must be a valid Aadhaar card number (12 digits, no spaces)"
    )
    @Column(length = 30)
    private String identificationdocument;
    //remove this feild
    private String authorizedpersonphoto;
    
    @OneToOne
	@JoinColumn(name ="userid",referencedColumnName = "userid")
	@JsonIgnoreProperties({"username", "password", "role", "address","document"}) // Ignore other User fields
    @JsonBackReference
	private User user;
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document( String proffofaddress, String gstnumber, String taxdocument, String imcdocument,
			String bloodbanklicence, String accredidationcertificate, String identificationdocument,
			String authorizedpersonphoto) {
		super();
		
		this.proffofaddress = proffofaddress;
		this.gstnumber = gstnumber;
		this.taxdocument = taxdocument;
		this.imcdocument = imcdocument;
		this.bloodbanklicence = bloodbanklicence;
		this.accredidationcertificate = accredidationcertificate;
		this.identificationdocument = identificationdocument;
		this.authorizedpersonphoto = authorizedpersonphoto;
	}
	public int getDocumentid() {
		return documentid;
	}
	public void setDocumentid(int documentid) {
		this.documentid = documentid;
	}
	public String getProffofaddress() {
		return proffofaddress;
	}
	public void setProffofaddress(String proffofaddress) {
		this.proffofaddress = proffofaddress;
	}
	public String getGstnumber() {
		return gstnumber;
	}
	public void setGstnumber(String gstnumber) {
		this.gstnumber = gstnumber;
	}
	public String getTaxdocument() {
		return taxdocument;
	}
	public void setTaxdocument(String taxdocument) {
		this.taxdocument = taxdocument;
	}
	public String getImcdocument() {
		return imcdocument;
	}
	public void setImcdocument(String imcdocument) {
		this.imcdocument = imcdocument;
	}
	public String getBloodbanklicence() {
		return bloodbanklicence;
	}
	public void setBloodbanklicence(String bloodbanklicence) {
		this.bloodbanklicence = bloodbanklicence;
	}
	public String getAccredidationcertificate() {
		return accredidationcertificate;
	}
	public void setAccredidationcertificate(String accredidationcertificate) {
		this.accredidationcertificate = accredidationcertificate;
	}
	public String getIdentificationdocument() {
		return identificationdocument;
	}
	public void setIdentificationdocument(String identificationdocument) {
		this.identificationdocument = identificationdocument;
	}
	public String getAuthorizedpersonphoto() {
		return authorizedpersonphoto;
	}
	public void setAuthorizedpersonphoto(String authorizedpersonphoto) {
		this.authorizedpersonphoto = authorizedpersonphoto;
	}
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Document [documentid=" + documentid + ", proffofaddress=" + proffofaddress + ", gstnumber=" + gstnumber
				+ ", taxdocument=" + taxdocument + ", imcdocument=" + imcdocument + ", bloodbanklicence="
				+ bloodbanklicence + ", accredidationcertificate=" + accredidationcertificate
				+ ", identificationdocument=" + identificationdocument + ", authorizedpersonphoto="
				+ authorizedpersonphoto + "]";
	}
    
    
}
