package bloodbankapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bloodbankapplication.dao.BloodAvailability;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.service.BloodAvailabilityService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BloodAvailabilityController {
	
	@Autowired
	private BloodAvailabilityService bloodAvailabilityService;
	
	@PostMapping("addNewBloodAvailability")
	public String addNewBloodAvailability(@RequestBody BloodAvailability bloodAvailability) {
		this.bloodAvailabilityService.addNewBloodAvailability(bloodAvailability);
		return "{\"added \":1}";
	}
	
	@GetMapping("getBloodAvailabilityById/{userid}")
	public BloodAvailability getBloodAvailabilityById(@PathVariable("userid") Integer userid) {
		return bloodAvailabilityService.getBloodAvailabilityById(userid);
	}
	
	@GetMapping("getAllBloodAvailability")
	public List<BloodAvailability> getAllBloodAvailability() {
		return bloodAvailabilityService.getAllBloodAvailability();
	}
	
	@PutMapping("updateBloodAvailabilityById/{bloodavailabilityid}")
	public BloodAvailability updateBloodAvailabilityById(@PathVariable("bloodavailabilityid") Integer bloodavailabilityid,@RequestBody BloodAvailability bloodAvailability) throws GlobalException {
		return bloodAvailabilityService.updateBloodAvailabilityById(bloodavailabilityid,bloodAvailability);
		
	}
}
