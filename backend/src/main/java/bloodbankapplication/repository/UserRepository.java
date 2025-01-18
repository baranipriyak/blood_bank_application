package bloodbankapplication.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import bloodbankapplication.dao.User;


public interface UserRepository extends JpaRepository<User, Integer>{

	@Query(value = "select * from user where role=?1 and username=?2",nativeQuery = true)
	public Optional<User> findByRole(String role,String username);

	@Modifying
	@Transactional
	@Query(value = "update user set status=?2 where userid=?1",nativeQuery = true)
	public void accepted(Integer userid, String status);

	@Modifying
	@Transactional
	@Query(value = "update user set message=?2,status=?3 where userid=?1",nativeQuery = true)
	public void rejected(Integer userid, String message, String status);

	@Query(value = "select * from user where username=?1",nativeQuery = true)
	public User findByName(String username);

	@Modifying
	@Transactional
	@Query(value = "update user set password=?2 where username=?1",nativeQuery = true)
	public void forgotPassword(String username, String password);
	

}
