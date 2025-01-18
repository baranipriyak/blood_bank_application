package bloodbankapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bloodbankapplication.dao.Address;
import bloodbankapplication.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

}
