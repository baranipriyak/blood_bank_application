package bloodbankapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bloodbankapplication.dao.User;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(Integer userid) {
		// TODO Auto-generated method stub
		return userRepository.findById(userid).get();
	}

	@Override
	public void forgotPassword(String username, String password) throws GlobalException {
		// TODO Auto-generated method stub
		User user = userRepository.findByName(username);
		if(user == null) {
			throw new GlobalException("username not available");
		}
		userRepository.forgotPassword(username,password);
		
	}
	
	

}
