package bloodbankapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bloodbankapplication.dao.Address;
import bloodbankapplication.dao.BloodBankCenter;
import bloodbankapplication.dao.Document;
import bloodbankapplication.dao.User;
import bloodbankapplication.dto.BloodBankCenterRequest;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.repository.AddressRepository;
import bloodbankapplication.repository.BloodBankCenterRepository;
import bloodbankapplication.repository.DocumentRepository;
import bloodbankapplication.repository.UserRepository;

@Service
public class BloodBankCenterServiceImpl implements BloodBankCenterService{
	
	@Autowired
	private BloodBankCenterRepository bloodBankCenterRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private DocumentRepository documentRepository;
	

	@Override
	public void saveBloodBankCenter(BloodBankCenterRequest bloodBankCenterRequest) {
		 System.out.println("Request Data: " + bloodBankCenterRequest);
		User savedUser = userRepository.save(bloodBankCenterRequest.getUser());
		
		Address savedAddress = addressRepository.save(bloodBankCenterRequest.getAddress());
		savedAddress.setUser(savedUser);
		
		Document savedDocument = documentRepository.save(bloodBankCenterRequest.getDocument());
		savedDocument.setUser(savedUser);
		
		BloodBankCenter bloodBankCenter = bloodBankCenterRepository.save(bloodBankCenterRequest.getBloodBankCenter());
		
		 
		bloodBankCenter.setUser(savedUser);
		bloodBankCenter.setAddress(savedAddress);
		bloodBankCenter.setDocument(savedDocument);
		
		
		
		
		bloodBankCenterRepository.save(bloodBankCenter);
	}

	@Override
	public List<BloodBankCenter> getAllBloodBankCenters() {
		// TODO Auto-generated method stub
		return bloodBankCenterRepository.findAll();
	}

	@Override
	public BloodBankCenter getBloodBankCenterById(Integer bloodbankid) {
		// TODO Auto-generated method stub
		return bloodBankCenterRepository.findById(bloodbankid).get();
	}

	@Override
	public BloodBankCenter updateBloodBankCenterById(Integer bloodbankid,
			BloodBankCenterRequest bloodBankCenterRequest) throws GlobalException {
		
		Optional<BloodBankCenter> bbobj = bloodBankCenterRepository.findById(bloodbankid);
		if(!bbobj.isPresent()) {
			throw new GlobalException("Blood Bank Center with id "+bloodbankid+" not exist");
		}
		BloodBankCenter bloodbank = bloodBankCenterRepository.findById(bloodbankid).get();
		User user = bloodbank.getUser();
		Address address = bloodbank.getAddress();
		Document document = bloodbank.getDocument();
		
		BloodBankCenter bbc1 = bloodBankCenterRequest.getBloodBankCenter();
		User u1 = bloodBankCenterRequest.getUser();
		Address a1 = bloodBankCenterRequest.getAddress();
		Document d1 = bloodBankCenterRequest.getDocument();
		
		if(bloodbank != null) {
			if(bloodBankCenterRequest.getBloodBankCenter() != null) {
				if(bbc1.getBloodbankcentername() != null) {
					bloodbank.setBloodbankcentername(bbc1.getBloodbankcentername());
				}
				if(bbc1.getBloodbankemail() != null) {
					bloodbank.setBloodbankemail(bbc1.getBloodbankemail());
				}
				if(bbc1.getBloodbankphonenumber() != null) {
					bloodbank.setBloodbankphonenumber(bbc1.getBloodbankphonenumber());
				}
			}
			if(bloodBankCenterRequest.getUser() != null) {
				if(u1.getUsername() != null) {
					user.setUsername(u1.getUsername());
				}
				if(u1.getPassword() != null) {
					user.setPassword(u1.getPassword());
				}
				if(u1.getRole() != null) {
					user.setRole(u1.getRole());
				}
			}
			if(bloodBankCenterRequest.getAddress() != null) {
				if(a1.getArea() != null) {
					address.setArea(a1.getArea());
				}
				if(a1.getCity() != null) {
					address.setCity(a1.getCity());
				}
				if(a1.getCountry() != null) {
					address.setCountry(a1.getCountry());
				}
				if(a1.getPincode() != null) {
					address.setPincode(a1.getPincode());
				}
			}
			if(bloodBankCenterRequest.getDocument() != null) {
				if(d1.getProffofaddress() != null) {
					document.setProffofaddress(d1.getProffofaddress());
				}
				if(d1.getGstnumber() != null) {
					document.setGstnumber(d1.getGstnumber());
				}
				if(d1.getTaxdocument() != null) {
					document.setTaxdocument(d1.getTaxdocument());
				}
				if(d1.getImcdocument() != null) {
					document.setImcdocument(d1.getImcdocument());
				}
				if(d1.getBloodbanklicence() != null) {
					document.setBloodbanklicence(d1.getBloodbanklicence());
				}
				if(d1.getAccredidationcertificate() != null) {
					document.setAccredidationcertificate(d1.getAccredidationcertificate());
				}
				if(d1.getIdentificationdocument() != null) {
					document.setIdentificationdocument(d1.getIdentificationdocument());
				}
				if(d1.getAuthorizedpersonphoto() != null) {
					document.setAuthorizedpersonphoto(d1.getAuthorizedpersonphoto());
				}
			}
		}
		User userSaved = userRepository.save(user);
		Address addressSaved = addressRepository.save(address);
		Document documentSaved = documentRepository.save(document);
		BloodBankCenter bloodBankSaved = bloodBankCenterRepository.save(bloodbank);
		bloodBankSaved.setUser(userSaved);
		bloodBankSaved.setAddress(addressSaved);
		bloodBankSaved.setDocument(documentSaved);
		
		return bloodBankCenterRepository.save(bloodBankSaved);
	}

	@Override
	public List<BloodBankCenter> deleteBloodBankById(Integer bloodbankid) {
		// TODO Auto-generated method stub
		BloodBankCenter bloodbankcenter =bloodBankCenterRepository.findById(bloodbankid).get();
		User user=bloodbankcenter.getUser();
		
		bloodBankCenterRepository.deleteById(bloodbankid);
		userRepository.deleteById(user.getUserid());
		return bloodBankCenterRepository.findAll();
	}

	@Override
	public BloodBankCenter getBloodbankByUserId(Integer userid) {
		// TODO Auto-generated method stub
		return bloodBankCenterRepository.getByUserId(userid);
	}

	@Override
	public void acceptedBloodbank(Integer userid, String status) {
		// TODO Auto-generated method stub
		userRepository.accepted(userid, status);
		
	}

	@Override
	public void rejectedBloodbank(Integer userid, String message, String status) {
		// TODO Auto-generated method stub
		userRepository.rejected(userid, message, status);
		
	}

}
