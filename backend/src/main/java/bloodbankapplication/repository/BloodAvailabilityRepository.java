package bloodbankapplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bloodbankapplication.dao.BloodAvailability;

@Repository
public interface BloodAvailabilityRepository extends JpaRepository<BloodAvailability, Integer>{

	@Query(value = "select * from blood_availability where userid=?1",nativeQuery = true)
	public BloodAvailability findByUserId(Integer userid);

}
