package bloodbankapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bloodbankapplication.dao.Address;
import bloodbankapplication.service.AddressService;

@CrossOrigin(origins = "http://localhost:4200")//connect with ang
@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/getAllAddress")
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
		
	}

}
