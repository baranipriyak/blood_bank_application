package bloodbankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bloodbankapplication.dao.BloodBankCenter;


@Repository
public interface BloodBankCenterRepository extends JpaRepository<BloodBankCenter, Integer>{

	@Query(value = "select * from blood_bank_center where userid=?1",nativeQuery = true)
	public BloodBankCenter getByUserId(Integer userid);

//	@Query(value = "select * from blood_bank_center where user_userid=?",nativeQuery = true)
//	public BloodBankCenter findBloodBankByUserId(Integer userid);
}
