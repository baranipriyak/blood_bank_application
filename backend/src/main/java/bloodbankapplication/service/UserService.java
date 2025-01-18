package bloodbankapplication.service;

import bloodbankapplication.dao.User;
import bloodbankapplication.error.GlobalException;

public interface UserService {

	public User getUserById(Integer userid);

	public void forgotPassword(String username, String password) throws GlobalException;

}
