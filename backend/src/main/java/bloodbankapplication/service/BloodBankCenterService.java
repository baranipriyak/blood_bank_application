package bloodbankapplication.service;

import java.util.List;

import bloodbankapplication.dao.BloodBankCenter;
import bloodbankapplication.dto.BloodBankCenterRequest;
import bloodbankapplication.error.GlobalException;

public interface BloodBankCenterService {

	public void saveBloodBankCenter(BloodBankCenterRequest bloodBankCenterRequest);

	public List<BloodBankCenter> getAllBloodBankCenters();

	public BloodBankCenter getBloodBankCenterById(Integer bloodbankid);

	public BloodBankCenter updateBloodBankCenterById(Integer bloodbankid,
			BloodBankCenterRequest bloodBankCenterRequest) throws GlobalException;

	public List<BloodBankCenter> deleteBloodBankById(Integer bloodbankid);

	public BloodBankCenter getBloodbankByUserId(Integer userid);

	public void acceptedBloodbank(Integer userid, String status);

	public void rejectedBloodbank(Integer userid, String message, String status);


}
