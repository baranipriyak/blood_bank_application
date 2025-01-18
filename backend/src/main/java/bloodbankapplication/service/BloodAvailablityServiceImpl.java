package bloodbankapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bloodbankapplication.dao.BloodAvailability;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.repository.BloodAvailabilityRepository;

@Service
public class BloodAvailablityServiceImpl implements BloodAvailabilityService{
	
	@Autowired
	private BloodAvailabilityRepository bloodAvailabilityRepository;

	

	@Override
	public BloodAvailability getBloodAvailabilityById(Integer userid) {
		// TODO Auto-generated method stub
		return bloodAvailabilityRepository.findByUserId(userid);
	}

	@Override
	public List<BloodAvailability> getAllBloodAvailability() {
		// TODO Auto-generated method stub
		return bloodAvailabilityRepository.findAll();
	}

	@Override
	public void addNewBloodAvailability(BloodAvailability bloodAvailability) {
		// TODO Auto-generated method stub
		 bloodAvailabilityRepository.save(bloodAvailability);
		
	}

	@Override
	public BloodAvailability updateBloodAvailabilityById(Integer bloodavailabilityid,
			BloodAvailability bloodAvailability) throws GlobalException {
		// TODO Auto-generated method stub
		Optional<BloodAvailability> bobj=bloodAvailabilityRepository.findById(bloodavailabilityid);
		if(bobj.isEmpty()) {
			throw new GlobalException("Blood Availability with id "+bloodavailabilityid+" not exist ");
		}
		BloodAvailability bloodAvailability2= bloodAvailabilityRepository.findById(bloodavailabilityid).get();
		if(bloodAvailability2 != null) {
			if(bloodAvailability.getA_plus() != 0) {
				bloodAvailability2.setA_plus(bloodAvailability.getA_plus());
			}if(bloodAvailability.getA_minus() != 0) {
				bloodAvailability2.setA_minus(bloodAvailability.getA_minus());
			}if(bloodAvailability.getB_plus() != 0) {
				bloodAvailability2.setB_plus(bloodAvailability.getB_plus());
			}if(bloodAvailability.getB_minus() != 0) {
				bloodAvailability2.setB_minus(bloodAvailability.getB_minus());
			}if(bloodAvailability.getAb_plus() != 0) {
				bloodAvailability2.setAb_plus(bloodAvailability.getAb_plus());
			}if(bloodAvailability.getAb_minus() != 0) {
				bloodAvailability2.setAb_minus(bloodAvailability.getAb_minus());
			}if(bloodAvailability.getO_plus() != 0) {
				bloodAvailability2.setO_plus(bloodAvailability.getO_plus());
			}if(bloodAvailability.getO_minus() != 0) {
				bloodAvailability2.setO_minus(bloodAvailability.getO_minus());
			}if(bloodAvailability.getA1_plus() != 0) {
				bloodAvailability2.setA1_plus(bloodAvailability.getA1_plus());
			}if(bloodAvailability.getA1_minus() != 0) {
				bloodAvailability2.setA1_minus(bloodAvailability.getA1_minus());
			}if(bloodAvailability.getA2_plus() != 0) {
				bloodAvailability2.setA2_plus(bloodAvailability.getA2_plus());
			}if(bloodAvailability.getA2_minus() != 0) {
				bloodAvailability2.setA2_minus(bloodAvailability.getA2_minus());
			}if(bloodAvailability.getA1b_plus() != 0) {
				bloodAvailability2.setA1b_plus(bloodAvailability.getA1b_plus());
			}if(bloodAvailability.getA1b_minus() != 0) {
				bloodAvailability2.setA1b_minus(bloodAvailability.getA1b_minus());
			}if(bloodAvailability.getA2b_plus() != 0) {
				bloodAvailability2.setA2b_plus(bloodAvailability.getA2b_plus());
			}if(bloodAvailability.getA2b_minus() != 0) {
				bloodAvailability2.setA2b_minus(bloodAvailability.getA2b_minus());
			}if(bloodAvailability.getOh_minus() != 0) {
				bloodAvailability2.setOh_minus(bloodAvailability.getOh_minus());
			}if(bloodAvailability.getRh_minus() != 0) {
				bloodAvailability2.setRh_minus(bloodAvailability.getRh_minus());
			}
		}
		return bloodAvailabilityRepository.save(bloodAvailability2);
	}

	

	
}
