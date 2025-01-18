package bloodbankapplication.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bloodbankapplication.dao.User;
import bloodbankapplication.dto.LoginRequest;
import bloodbankapplication.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepository userRepository;

//	@Override
//	public String login(LoginRequest loginRequest) {
//		// TODO Auto-generated method stub
//		Optional<User> userOptional = userRepository.findByRole(loginRequest.getRole());
//		System.out.println(userOptional.get());
//		if(userOptional.isEmpty()) {
//			return "Role mismatch";
//		}
//		User user = userOptional.get();
//		
//		if(!user.getUsername().equals(loginRequest.getUsername())) {
//			return "Username not valid";
//		}
//		if(!user.getPassword().equals(loginRequest.getPassword())) {
//			return "Password inavalid";
//		}
//		return "Login Successful";
//	}
	
	@Override
	public Map<String, Object> login(LoginRequest loginRequest) {
	    Map<String, Object> response = new HashMap<>();

	    // Check for role mismatch
	    Optional<User> userOptional = userRepository.findByRole(loginRequest.getRole(),loginRequest.getUsername());
	    if (userOptional.isEmpty()) {
	        response.put("validated", false);
	        response.put("message", "Role mismatch");
	        return response;
	    }
	    System.out.println(userOptional);
	    

	    User user = userOptional.get();

	    // Check for username validity
	    if (!user.getUsername().equals(loginRequest.getUsername())) {
	        response.put("validated", false);
	        response.put("message", "Username not valid");
	        System.out.println(response);
	        return response;
	       
	    }

	    // Check for password validity
	    if (!user.getPassword().equals(loginRequest.getPassword())) {
	        response.put("validated", false);
	        response.put("message", "Password invalid");
	        System.out.println(response);
	        return response;
	    }
//	    if (user.getStatus().equals("pending")) {
//	        response.put("validated", false);
//	        response.put("message", "Your request is pending approval.");
//	        return response;
//	    } else if (user.getStatus().equals("rejected")) {
//	        response.put("validated", false);
//	        response.put("message", user.getMessage());
//	        return response;
//	    }

	    // Successful login
	    response.put("validated", true);
	    response.put("status",user.getStatus());
	    response.put("message", "Login Successful");
	    response.put("userId", String.valueOf(user.getUserid())); // Assuming user ID is of type Long or Integer
	    response.put("role", user.getRole());
	    
	    System.out.println(response);
	    return response;
	    
	    
	}

}
