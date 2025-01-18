package bloodbankapplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bloodbankapplication.dao.User;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService ;
	
	@GetMapping("getUserById/{userid}")
	public User getUserById(@PathVariable("userid") Integer userid) {
		return this.userService.getUserById(userid);
	}
	
	@PutMapping("/forgotPassword/{username}")
	public String forgotPassword(@PathVariable("username") String username,@RequestBody String password) throws GlobalException {
		this.userService.forgotPassword(username,password);
		return "{\"Updated Successfully \":1}";
		
	}
}
