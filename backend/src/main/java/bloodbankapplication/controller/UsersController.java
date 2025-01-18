package bloodbankapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bloodbankapplication.dao.Users;
import bloodbankapplication.dto.UsersRequest;
import bloodbankapplication.error.GlobalException;
import bloodbankapplication.service.UsersService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@PostMapping("/saveUsers")
	public String saveUsers(@Valid @RequestBody UsersRequest usersRequest) {
		usersService.saveUsers(usersRequest);
//		return "Users added successfully";
		return "{\"success\":1}";
		
	}
	
	@GetMapping("/getAllUsers")
	public List<Users> getAllUsers(){
		return usersService.getAllUsers();
		
	}
	
	@GetMapping("/getUsersById/{usersid}")
	public Users getUsersById(@PathVariable("usersid") Integer usersid) {
		return usersService.getUsersById(usersid);
	}
	
	@PutMapping("/updateUsersById/{usersid}")
	public Users updateUsersById(@PathVariable("usersid") Integer usersid,@RequestBody UsersRequest usersRequest) throws GlobalException {
		return usersService.updateUserById(usersid,usersRequest);
		
	}
	
	@DeleteMapping("/deleteUsersById/{usersid}")
	public List<Users> deleteUsersById(@PathVariable("usersid") Integer usersid){
		return usersService.deleteUsersById(usersid);
		
	}
	
	@GetMapping("/getUsersByUserId/{userid}")
	public Users getUsersByUserId(@PathVariable("userid") Integer userid) {
		return usersService.getUsersByUserId(userid);
	}
}
