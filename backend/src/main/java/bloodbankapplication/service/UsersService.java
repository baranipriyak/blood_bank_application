package bloodbankapplication.service;

import java.util.List;

import bloodbankapplication.dao.Users;
import bloodbankapplication.dto.UsersRequest;
import bloodbankapplication.error.GlobalException;

public interface UsersService {

	public void saveUsers(UsersRequest usersRequest);

	public List<Users> getAllUsers();

	public Users updateUserById(Integer usersid, UsersRequest usersRequest) throws GlobalException;

	public List<Users> deleteUsersById(Integer usersid);

	public Users getUsersById(Integer usersid);
	

	public Users getUsersByUserId(Integer userid);

}
