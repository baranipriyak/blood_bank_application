package bloodbankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bloodbankapplication.dao.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

	@Query(value = "select * from users where userid=?1",nativeQuery = true)
	public Users findUserById(Integer userid);

}
