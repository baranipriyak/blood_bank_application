package bloodbankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bloodbankapplication.dao.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

	@Query(value = "select * from hospital where userid=?1",nativeQuery = true)
	public Hospital getHospitalByUserId(Integer userid);

}
