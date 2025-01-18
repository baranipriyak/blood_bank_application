package bloodbankapplication.service;

import java.util.Map;

import bloodbankapplication.dto.LoginRequest;

public interface LoginService {

	public Map<String, Object> login(LoginRequest loginRequest);

}
