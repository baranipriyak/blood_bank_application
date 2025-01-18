package bloodbankapplication.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bloodbankapplication.dto.LoginRequest;
import bloodbankapplication.service.LoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
//	@PostMapping("/login")
//	public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){
//		String result=loginService.login(loginRequest);
//		
//		switch(result) {
//		case "Username not valid":
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
//		case "Password invalid":
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
//		default:
//			return ResponseEntity.ok(result);
//		}
//		
//	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest) {
	    Map<String, Object> response = loginService.login(loginRequest);

	    if (response.containsKey("validated") && !(boolean) response.get("validated")) {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
	    }

	    return ResponseEntity.ok(response);
	}

}
