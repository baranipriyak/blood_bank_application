package bloodbankapplication.service;

import java.util.List;

import bloodbankapplication.dao.Hospital;
import bloodbankapplication.dto.HospitalRequest;
import bloodbankapplication.error.GlobalException;

public interface HospitalService {

	public void saveHospital(HospitalRequest hospitalrequest);

	public List<Hospital> getAllHospitals();

	public Hospital getHospitalById(Integer hospitalid) throws GlobalException;

	public Hospital updateHospitalById(Integer hospitalid, HospitalRequest hospitalRequest) throws GlobalException;

	public List<Hospital> deleteHospitalById(Integer hospitalid);

	public Hospital getHospitalByUserId(Integer userid);

	public void acceptedHospital(Integer userid, String status);

	public void rejectedHospital(Integer userid, String message, String status);

}
