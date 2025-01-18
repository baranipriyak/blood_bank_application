package bloodbankapplication.service;

import java.util.List;

import bloodbankapplication.dao.BloodAvailability;
import bloodbankapplication.error.GlobalException;

public interface BloodAvailabilityService {

	public BloodAvailability getBloodAvailabilityById(Integer userid);

	public List<BloodAvailability> getAllBloodAvailability();

	public void addNewBloodAvailability(BloodAvailability bloodAvailability);

	public BloodAvailability updateBloodAvailabilityById(Integer bloodavailabilityid,
			BloodAvailability bloodAvailability) throws GlobalException;


}
