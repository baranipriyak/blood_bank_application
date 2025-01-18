package bloodbankapplication.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bloodbankapplication.dao.UsersBloodRequest;
import bloodbankapplication.dto.AcceptRequest;
import bloodbankapplication.service.UsersBloodRequestService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UsersBloodRequestController {
	
	@Autowired
	private UsersBloodRequestService usersBloodRequestService;
	
	@PostMapping("/saveUsersBloodRequest")
	public String saveUsersBloodRequest(@RequestBody UsersBloodRequest usersBloodRequest) {
		usersBloodRequestService.saveUsersBloodRequest(usersBloodRequest);
		return "{\"Added successfully\":1}";
		
	}
	
	@GetMapping("/getAllUsersBloodRequest")
	public List<UsersBloodRequest> getAllUsersBloodRequest(){
		return usersBloodRequestService.getAllUsersBloodRequest();
	}
	
	@PutMapping("/addAcceptRequest/{requestid}")
	public String addAcceptRequest(@PathVariable("requestid") Integer requestid,@RequestBody AcceptRequest acceptRequest) {
		String fullfillmentstatus="Accepted";
		usersBloodRequestService.addAcceptRequest(requestid,acceptRequest.getAcceptoruserid(),acceptRequest.getAcceptorrole(),fullfillmentstatus);
		return "{\"AcceptRequest\":1}";
		
	}
	
	@GetMapping("/getBloodRequestById/{userid}")
	public List<UsersBloodRequest> getBloodRequestById(@PathVariable("userid") Integer userid){
		return usersBloodRequestService.getBloodRequestByUserId(userid);
		
	}
	
	@PutMapping("/receivedBlood/{requestid}")
	public String receivedBlood(@PathVariable("requestid") Integer requestid,@RequestBody String status) {
		LocalDate fullfilleddate=LocalDate.now();
		String fullfillmentstatus="Accepted";
		 usersBloodRequestService.receivedBlood(requestid,status,fullfilleddate,fullfillmentstatus);
		return "{\"Received successfully\":1}";
	}
	
	@PutMapping("/notReceivedBlood/{requestid}")
	public String notReceivedBlood(@PathVariable("requestid") Integer requestid,@RequestBody String status) {
		int acceptoruserid=0;
		String acceptorrole=null;
		String fullfillmentstatus="Pending";
		
	 usersBloodRequestService.notReceivedBlood(requestid,status,acceptoruserid,acceptorrole,fullfillmentstatus);
	 return "{\"Not Received\":1}";
		
	}
}
