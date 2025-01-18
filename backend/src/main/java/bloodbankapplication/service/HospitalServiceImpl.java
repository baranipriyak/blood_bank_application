package bloodbankapplication.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bloodbankapplication.dao.Address;
import bloodbankapplication.dao.Document;
import bloodbankapplication.dao.Hospital;
import bloodbankapplication.dao.User;
import bloodbankapplication.dto.HospitalRequest;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.repository.AddressRepository;
import bloodbankapplication.repository.DocumentRepository;
import bloodbankapplication.repository.HospitalRepository;
import bloodbankapplication.repository.UserRepository;

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private DocumentRepository documentRepository;
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public void saveHospital(HospitalRequest hospitalrequest) {
		
		User savedUser = userRepository.save(hospitalrequest.getUser());
//		userRepository.findAll();
		
		Address savedAddress = addressRepository.save(hospitalrequest.getAddress());
//		addressRepository.findAll();
		savedAddress.setUser(savedUser);
		
		Document savedDocument = documentRepository.save(hospitalrequest.getDocument());
//		documentRepository.findAll();
		savedDocument.setUser(savedUser);
		
		Hospital hospital = hospitalRepository.save(hospitalrequest.getHospital());
//		hospitalRepository.findAll();
		
		hospital.setUser(savedUser);
		hospital.setAddress(savedAddress);
		hospital.setDocument(savedDocument);
		
		 hospitalRepository.save(hospital);
		
		
	}


	@Override
	public List<Hospital> getAllHospitals() {
		// TODO Auto-generated method stub
		return hospitalRepository.findAll();
	}


	@Override
	public Hospital getHospitalById(Integer hospitalid) throws GlobalException {
		// TODO Auto-generated method stub
		Optional<Hospital> hobj = hospitalRepository.findById(hospitalid);
		if(hobj.isEmpty()) {
			throw new GlobalException("Hospital with id "+hospitalid+" not exist");
		}
		return hospitalRepository.findById(hospitalid).get();
	}


	@Override
	public Hospital updateHospitalById(Integer hospitalid, HospitalRequest hospitalRequest) throws GlobalException {
		// TODO Auto-generated method stub
		Optional<Hospital> hobj = hospitalRepository.findById(hospitalid);
		if(hobj.isEmpty()) {
			throw new GlobalException("Hospital with id "+hospitalid+" not exist ");
		}
		Hospital hospital1 = hospitalRepository.findById(hospitalid).get();
		User user1 = hospital1.getUser();
		Address address1 = hospital1.getAddress();
		Document document1 = hospital1.getDocument();
		
		Hospital hospital=hospitalRequest.getHospital();
		Address address = hospitalRequest.getAddress();
		Document document = hospitalRequest.getDocument();
		User user = hospitalRequest.getUser();
		
		if(hospital1 != null) {
			if(hospitalRequest.getHospital() != null) {
				if(hospital.getHospitalname() != null) {
					hospital1.setHospitalname(hospital.getHospitalname());
				}
				if(hospital.getHospitalemail() != null) {
					hospital1.setHospitalemail(hospital.getHospitalemail());
				}
				if(hospital.getHospitalphonenumber() != null) {
					hospital1.setHospitalphonenumber(hospital.getHospitalphonenumber());
				}
			}
			if(hospitalRequest.getUser() != null) {
				if(user.getUsername() != null) {
					user1.setUsername(user.getUsername());
				}
				if(user.getPassword() != null) {
					user1.setPassword(user.getPassword());
				}
				if(user.getRole() != null) {
					user1.setRole(user.getRole());
				}
			}
			if(hospitalRequest.getAddress() != null) {
				if(address.getArea() != null) {
					address1.setArea(address.getArea());
				}
				if(address.getCity() != null) {
					address1.setCity(address.getCity());
				}
				if(address.getCountry() != null) {
					address1.setCountry(address.getCountry());
				}
				if(address.getPincode() != null) {
					address1.setPincode(address.getPincode());
				}
			}
			if(hospitalRequest.getDocument() != null) {
				if(document.getProffofaddress() != null) {
					document1.setProffofaddress(document.getProffofaddress());
				}
				if(document.getGstnumber() != null) {
					document1.setGstnumber(document.getGstnumber());
				}
				if(document.getTaxdocument() != null) {
					document1.setTaxdocument(document.getTaxdocument());
				}
				if(document.getImcdocument() != null) {
					document1.setImcdocument(document.getImcdocument());
				}
				if(document.getBloodbanklicence() != null) {
					document1.setBloodbanklicence(document.getBloodbanklicence());
				}
				if(document.getAccredidationcertificate() != null) {
					document1.setAccredidationcertificate(document.getAccredidationcertificate());
				}
				if(document.getIdentificationdocument() != null) {
					document1.setIdentificationdocument(document.getIdentificationdocument());
				}
				if(document.getAuthorizedpersonphoto() != null) {
					document1.setAuthorizedpersonphoto(document.getAuthorizedpersonphoto());
				}
			}
			
			
		}
		User userSaved = userRepository.save(user1);
		Address addressSaved = addressRepository.save(address1);
		Document documentSaved = documentRepository.save(document1);
		Hospital hospitalSaved = hospitalRepository.save(hospital1);
		hospitalSaved.setUser(userSaved);
		hospitalSaved.setAddress(addressSaved);
		hospitalSaved.setDocument(documentSaved);
		
		
		return hospitalRepository.save(hospitalSaved);
	}


	@Override
	public List<Hospital> deleteHospitalById(Integer hospitalid) {
		// TODO Auto-generated method stub
	Hospital hospital =hospitalRepository.findById(hospitalid).get();
	User user=hospital.getUser();
		hospitalRepository.deleteById(hospitalid);
		userRepository.deleteById(user.getUserid());
		return hospitalRepository.findAll();
	}


	@Override
	public Hospital getHospitalByUserId(Integer userid) {
		// TODO Auto-generated method stub
		return hospitalRepository.getHospitalByUserId(userid);
	}


	@Override
	public void acceptedHospital(Integer userid, String status) {
		// TODO Auto-generated method stub
		 userRepository.accepted(userid,status);
		
	}


	@Override
	public void rejectedHospital(Integer userid, String message, String status) {
		// TODO Auto-generated method stub
		userRepository.rejected(userid,message,status);
		
	}



	

}
