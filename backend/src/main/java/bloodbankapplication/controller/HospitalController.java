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

import bloodbankapplication.dao.Hospital;
import bloodbankapplication.dto.HospitalRequest;
import bloodbankapplication.dto.RejectionRequest;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.service.HospitalService;

@CrossOrigin(origins = "http://localhost:4200")//connect with ang
@RestController
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@PostMapping("/saveHospital")
	public String saveHospital(@Valid @RequestBody HospitalRequest hospitalrequest) {
		hospitalService.saveHospital(hospitalrequest);
//		return "Saved Successfully" ;
		return "{\"success\":1}";
		
	}
//	@PostMapping("/saveHospital")
//	public ResponseEntity<String> saveHospital(@RequestBody HospitalRequest hospitalrequest) {
//		hospitalService.saveHospital(hospitalrequest);
//		return new ResponseEntity<>("Saved Successfully",HttpStatus.ACCEPTED) ;
//		
//	}
//	
	
	@GetMapping("/getAllHospitals")
	public List<Hospital> getAllHospitals(){
		return hospitalService.getAllHospitals();
		
	}
	
	@GetMapping("/getHospitalById/{hosid}")
	public Hospital getHospitalById(@PathVariable("hosid") Integer hospitalid) throws GlobalException {
		return hospitalService.getHospitalById(hospitalid);
	}
	
	@PutMapping("updateHospitalById/{hosid}")
	public Hospital updateHospitalById(@PathVariable("hosid") Integer hospitalid,@RequestBody HospitalRequest hospitalRequest) throws GlobalException {
		return hospitalService.updateHospitalById(hospitalid,hospitalRequest);
		
		
	}
	
	@DeleteMapping("deleteHospitalById/{hosid}")
	public List<Hospital> deleteHospitalById(@PathVariable("hosid") Integer hospitalid){
		return hospitalService.deleteHospitalById(hospitalid);
		
	}
	
	@GetMapping("getHospitalByUserId/{userid}")
	public Hospital getHospitalByUserId(@PathVariable("userid") Integer userid) {
		return hospitalService.getHospitalByUserId(userid);
		
	}
	
	@PutMapping("acceptedHospital/{userid}")
	public String acceptedHospital(@PathVariable("userid") Integer userid,@RequestBody String status) {
		this.hospitalService.acceptedHospital(userid,status);
		return "{\"Accepted\":1}";
		
	}
	
	@PutMapping("rejectedHospital/{userid}")
	public String rejectedHospital(@PathVariable("userid") Integer userid,@RequestBody RejectionRequest rejectionRequest) {
		this.hospitalService.rejectedHospital(userid,rejectionRequest.getMessage(),rejectionRequest.getStatus());
		System.out.println(rejectionRequest.getMessage());
		return "{\"Rejected\":1}";
		
	}
	
	
}
