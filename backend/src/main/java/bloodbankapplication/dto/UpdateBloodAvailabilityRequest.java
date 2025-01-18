package bloodbankapplication.dto;

public class UpdateBloodAvailabilityRequest {
	private String bloodgroup;
	private String count;
	public UpdateBloodAvailabilityRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UpdateBloodAvailabilityRequest(String bloodgroup, String count) {
		super();
		this.bloodgroup = bloodgroup;
		this.count = count;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "UpdateBloodAvailabilityRequest [bloodgroup=" + bloodgroup + ", count=" + count + "]";
	}
	
	

}
