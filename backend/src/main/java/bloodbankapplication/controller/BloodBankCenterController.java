package bloodbankapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bloodbankapplication.dao.BloodBankCenter;
import bloodbankapplication.dto.BloodBankCenterRequest;
import bloodbankapplication.dto.RejectionRequest;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.service.BloodBankCenterService;

@CrossOrigin(origins = "http://localhost:4200")//connect with ang
@RestController
public class BloodBankCenterController {

	@Autowired
	private BloodBankCenterService bloodBankCenterService;
	
	@PostMapping("/saveBloodBankCenter")
	public String saveBloodBankCenter(@Valid @RequestBody BloodBankCenterRequest bloodBankCenterRequest) {
		bloodBankCenterService.saveBloodBankCenter(bloodBankCenterRequest);
//		return "Saved successfully";
		return "{\"success\":1}";
		
	}
	
	@GetMapping("/getAllBloodBankCenters")
	public List<BloodBankCenter> getAllBloodBankCenters(){
		return bloodBankCenterService.getAllBloodBankCenters();
		
	}
	
	@GetMapping("/getBloodBankCenterById/{bloodbankid}")
	public BloodBankCenter getBloodBankCenterById(@PathVariable("bloodbankid") Integer bloodbankid) {
		return bloodBankCenterService.getBloodBankCenterById(bloodbankid);
	}
	
	@PutMapping("/updateBloodBankCenterById/{bloodbankid}")
	public BloodBankCenter updateBloodBankCenterById(@PathVariable("bloodbankid") Integer bloodbankid,@RequestBody BloodBankCenterRequest bloodBankCenterRequest) throws GlobalException {
		return bloodBankCenterService.updateBloodBankCenterById(bloodbankid,bloodBankCenterRequest);
		
	}
	
	@DeleteMapping("/deleteBloodBankById/{bloodbankid}")
	public List<BloodBankCenter> deleteBloodBankById(@PathVariable("bloodbankid") Integer bloodbankid){
		return bloodBankCenterService.deleteBloodBankById(bloodbankid);
		
	}
	
	@GetMapping("/getBloodbankByUserId/{userid}")
	public BloodBankCenter getBloodbankByUserId(@PathVariable("userid") Integer userid) {
		return bloodBankCenterService.getBloodbankByUserId(userid);
		
	}
	
	@PutMapping("acceptedBloodbank/{userid}")
	public String acceptedBloodbank(@PathVariable("userid") Integer userid,@RequestBody String status) {
		this.bloodBankCenterService.acceptedBloodbank(userid,status);
		return "{\"Accepted\":1}";
		
	}
	
	@PutMapping("rejectedBloodbank/{userid}")
	public String rejectedBloodbank(@PathVariable("userid") Integer userid,@RequestBody RejectionRequest rejectionRequest) {
		this.bloodBankCenterService.rejectedBloodbank(userid,rejectionRequest.getMessage(),rejectionRequest.getStatus());
		System.out.println(rejectionRequest.getMessage());
		return "{\"Rejected\":1}";
		
	}
	
	
}
