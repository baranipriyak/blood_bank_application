package bloodbankapplication.dto;

public class RejectionRequest {
	private String message;
	private String status;
	public RejectionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RejectionRequest(String message, String status) {
		super();
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RejectionRequest [message=" + message + ", status=" + status + "]";
	}
	
	

}
