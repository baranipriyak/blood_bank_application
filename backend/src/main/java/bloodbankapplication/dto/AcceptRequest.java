package bloodbankapplication.dto;

public class AcceptRequest {
	
	private int acceptoruserid;
	private String acceptorrole;
	public AcceptRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcceptRequest(int acceptoruserid, String acceptorrole) {
		super();
		this.acceptoruserid = acceptoruserid;
		this.acceptorrole = acceptorrole;
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
	@Override
	public String toString() {
		return "AcceptRequest [acceptorid=" + acceptoruserid + ", acceptorrole=" + acceptorrole + "]";
	}
	
	

}
