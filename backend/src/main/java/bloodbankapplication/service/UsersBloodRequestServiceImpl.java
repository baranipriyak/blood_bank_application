package bloodbankapplication.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bloodbankapplication.dao.UsersBloodRequest;
import bloodbankapplication.repository.UsersBloodRequestRepository;

@Service
public class UsersBloodRequestServiceImpl implements UsersBloodRequestService{
	
	@Autowired
	private UsersBloodRequestRepository usersBloodRequestRepository;
	

		
	

	@Override
	public List<UsersBloodRequest> getAllUsersBloodRequest() {
		// TODO Auto-generated method stub
		return usersBloodRequestRepository.findAll();
	}




	@Override
	public void saveUsersBloodRequest(UsersBloodRequest usersBloodRequest) {
		// TODO Auto-generated method stub
		usersBloodRequestRepository.save(usersBloodRequest);
		
	}




	@Override
	public void addAcceptRequest(Integer requestid, int acceptoruserid, String acceptorrole,String fullfillmentstatus) {
		// TODO Auto-generated method stub
	usersBloodRequestRepository.addAcceptRequest(requestid,acceptoruserid,acceptorrole,fullfillmentstatus);
		
	}




	@Override
	public List<UsersBloodRequest> getBloodRequestByUserId(Integer userid) {
		// TODO Auto-generated method stub
		return usersBloodRequestRepository.getBloodRequestByUserId(userid);
	}




	@Override
	public void receivedBlood(Integer requestid, String status, LocalDate fullfilleddate,
			String fullfillmentstatus) {
		// TODO Auto-generated method stub
		 usersBloodRequestRepository.receivedBlood(requestid,status,fullfilleddate,fullfillmentstatus);
	}




	@Override
	public void notReceivedBlood(Integer requestid, String status, int acceptoruserid,
			String acceptorrole,String fullfillmentstatus) {
		// TODO Auto-generated method stub
		 usersBloodRequestRepository.notReceivedBlood(requestid,status,acceptoruserid,acceptorrole,fullfillmentstatus);
	}

}
