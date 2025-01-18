package bloodbankapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bloodbankapplication.dao.Address;
import bloodbankapplication.dao.User;
import bloodbankapplication.dao.Users;
import bloodbankapplication.dto.UsersRequest;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.repository.AddressRepository;
import bloodbankapplication.repository.UserRepository;
import bloodbankapplication.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void saveUsers(UsersRequest usersRequest) {
		System.out.println(usersRequest.getUsers().getWeight());
		// TODO Auto-generated method stub
		User savedUser = userRepository.save(usersRequest.getUser());
		
		Address savedAddress = addressRepository.save(usersRequest.getAddress());
		savedAddress.setUser(savedUser);
		
		Users users=usersRepository.save(usersRequest.getUsers());
		
		users.setAddress(savedAddress);
		users.setUser(savedUser);
		
		usersRepository.save(users);
		
		
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	@Override
	public Users updateUserById(Integer usersid, UsersRequest usersRequest) throws GlobalException {
		Optional<Users> uobj = usersRepository.findById(usersid);
		System.out.println(uobj);
		if(!uobj.isPresent()) {
			throw new GlobalException("Users with id "+usersid+" not exist");
		}
		
		Users users = usersRepository.findById(usersid).get();
		User user = users.getUser();
		Address address = users.getAddress();
		
		Users users1 = usersRequest.getUsers();
		User user1 = usersRequest.getUser();
		Address address1 = usersRequest.getAddress();
		
		if(users != null) {
			if(usersRequest.getUsers() != null) {
				if(users1.getUsersname() != null) {
					users.setUsersname(users1.getUsersname());
				}
				if(users1.getUsersemail() != null) {
					users.setUsersemail(users1.getUsersemail());
				}
				if(users1.getUsersphonenumber() != null) {
					users.setUsersphonenumber(users1.getUsersphonenumber());
				}
				if(users1.getAge() != 0) {
					users.setAge(users1.getAge());
				}
				
				if(users1.getUsersbloodgroup() != null) {
					users.setUsersbloodgroup(users1.getUsersbloodgroup());
				}
				if(users1.getUsersdisease() != null) {
					users.setUsersdisease(users1.getUsersdisease());
				}
				if(users1.getWeight() != 0) {
					users.setWeight(users1.getWeight());
				}
			}
			if(usersRequest.getUser() != null) {
				if(user1.getUsername() != null) {
					user.setUsername(user1.getUsername());
				}
				if(user1.getPassword() != null) {
					user.setPassword(user1.getPassword());
				}
				if(user1.getRole() != null) {
					user.setRole(user1.getRole());
				}
			}
			if(usersRequest.getAddress() != null) {
				if(address1.getArea() != null) {
					address.setArea(address1.getArea());
				}
				if(address1.getCity() != null) {
					address.setCity(address1.getCity());
				}
				if(address1.getCountry() != null) {
					address.setCountry(address1.getCountry());
				}
				if(address1.getPincode() != null) {
					address.setPincode(address1.getPincode());
				}
			}
		}
		
		User userSaved = userRepository.save(user);
		Address userAddress = addressRepository.save(address);
		Users usersSaved = usersRepository.save(users);
		usersSaved.setUser(userSaved);
		usersSaved.setAddress(userAddress);
		return usersRepository.save(usersSaved);
	}

	@Override
	public List<Users> deleteUsersById(Integer usersid) {
		// TODO Auto-generated method stub
		Users users =usersRepository.findById(usersid).get();
		User user= users.getUser();
		usersRepository.deleteById(usersid);
		userRepository.deleteById(user.getUserid());
		return usersRepository.findAll();
	}

	@Override
	public Users getUsersById(Integer usersid) {
		// TODO Auto-generated method stub
		return usersRepository.findById(usersid).get();
	}

	@Override
	public Users getUsersByUserId(Integer userid) {
		// TODO Auto-generated method stub
		return usersRepository.findUserById(userid);
	}

}
