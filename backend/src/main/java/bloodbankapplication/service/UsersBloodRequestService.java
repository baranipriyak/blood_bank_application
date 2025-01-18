package bloodbankapplication.service;

import java.time.LocalDate;
import java.util.List;

import bloodbankapplication.dao.UsersBloodRequest;

public interface UsersBloodRequestService {

	public void saveUsersBloodRequest(UsersBloodRequest usersBloodRequest);

	public List<UsersBloodRequest> getAllUsersBloodRequest();

	public void addAcceptRequest(Integer requestid, int acceptoruserid, String acceptorrole,String fullfillmentstatus);

	public List<UsersBloodRequest> getBloodRequestByUserId(Integer userid);

	public void receivedBlood(Integer requestid, String status, LocalDate fullfilleddate,
			String fullfillmentstatus);

	public void notReceivedBlood(Integer requestid, String status, int acceptoruserid,
			String acceptorrole, String fullfillmentstatus);

}
