package bloodbankapplication.dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Entity
public class UsersBloodRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int requestid;
	
	@NotEmpty(message = "Blood group is required")
	@Column(length = 20,nullable = false)
	private String bloodgroup;
	
	
	private int requiredunit;
	
	@Column(length = 50)
	private String reason;
	
	
	private Date requeststartdate;
	
	@Future(message = "Request end date must be in the past")
	private Date requestenddate;
	
	@Column(nullable = false,length = 20, columnDefinition = "VARCHAR(25) DEFAULT 'Pending'")
	private String fullfillmentstatus="Pending";
	
	private Date fullfilleddate;
	
	@Pattern(regexp = "^[6-9]\\d{0,9}$")
	@Column(length = 10 )
	@NotEmpty(message = "Enter Phone number")
	private String contactdetails;
	
	@NotEmpty(message = "Must be select the priority")
	@Column(nullable = false,length = 20)
	private String priority;
	
	private int userid;
	
	@Column(length = 20,nullable = false)
	private String role;
	
	private int acceptoruserid;
	
	@Column(length = 20)
	private String acceptorrole;
	
	@Column(length = 20)
	private String status; 
	
	

	public UsersBloodRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersBloodRequest(int requestid, String bloodgroup,
			int requiredunit, String reason, Date requeststartdate,
			 Date requestenddate, String fullfillmentstatus,
			Date fullfilleddate,String contactdetails,String priority, int userid, String role,
			int acceptoruserid, String acceptorrole, String status) {
		super();
		this.requestid = requestid;
		this.bloodgroup = bloodgroup;
		this.requiredunit = requiredunit;
		this.reason = reason;
		this.requeststartdate = requeststartdate;
		this.requestenddate = requestenddate;
		this.fullfillmentstatus = fullfillmentstatus;
		this.fullfilleddate = fullfilleddate;
		this.contactdetails = contactdetails;
		this.priority = priority;
		this.userid = userid;
		this.role = role;
		this.acceptoruserid = acceptoruserid;
		this.acceptorrole = acceptorrole;
		this.status = status;
	}



	public int getRequestid() {
		return requestid;
	}

	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public int getRequiredunit() {
		return requiredunit;
	}

	public void setRequiredunit(int requiredunit) {
		this.requiredunit = requiredunit;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getRequeststartdate() {
		return requeststartdate;
	}

	public void setRequeststartdate(Date requeststartdate) {
		this.requeststartdate = requeststartdate;
	}

	public Date getRequestenddate() {
		return requestenddate;
	}

	public void setRequestenddate(Date requestenddate) {
		this.requestenddate = requestenddate;
	}

	public String getFullfillmentstatus() {
		return fullfillmentstatus;
	}

	public void setFullfillmentstatus(String fullfillmentstatus) {
		this.fullfillmentstatus = fullfillmentstatus;
	}

	public Date getFullfilleddate() {
		return fullfilleddate;
	}

	public void setFullfilleddate(Date fullfilleddate) {
		this.fullfilleddate = fullfilleddate;
	}

	public String getContactdetails() {
		return contactdetails;
	}

	public void setContactdetails(String contactdetails) {
		this.contactdetails = contactdetails;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAcceptoruserid() {
		return acceptoruserid;
	}

	public void setAcceptoruserid(int acceptoruserid) {
		this.acceptoruserid = acceptoruserid;
	}

	public String getAcceptorrole() {
		return acceptorrole;
	}

	public void setAcceptorrole(String acceptorrole) {
		this.acceptorrole = acceptorrole;
	}

	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UsersBloodRequest [requestid=" + requestid + ", bloodgroup=" + bloodgroup + ", requiredunit="
				+ requiredunit + ", reason=" + reason + ", requeststartdate=" + requeststartdate + ", requestenddate="
				+ requestenddate + ", fullfillmentstatus=" + fullfillmentstatus + ", fullfilleddate=" + fullfilleddate
				+ ", contactdetails=" + contactdetails + ", priority=" + priority + ", userid=" + userid + ", role="
				+ role + ", acceptoruserid=" + acceptoruserid + ", acceptorrole=" + acceptorrole + ", status=" + status
				+ "]";
	}


	
	
	
	
	

}
