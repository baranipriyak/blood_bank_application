package bloodbankapplication.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bloodbankapplication.dao.UsersBloodRequest;

@Repository
public interface UsersBloodRequestRepository extends JpaRepository<UsersBloodRequest, Integer>{

	@Modifying
	@Transactional
	@Query(value = "update users_blood_request set acceptoruserid=?2,acceptorrole=?3,fullfillmentstatus=?4 where requestid=?1",nativeQuery = true)
	public int addAcceptRequest(Integer requestid, int acceptoruserid, String acceptorrole,String fullfillmentstatus);

	@Query(value ="select * from users_blood_request where userid=?1",nativeQuery = true)
	public List<UsersBloodRequest> getBloodRequestByUserId(Integer userid);

	@Modifying
	@Transactional
	@Query(value = "update users_blood_request set status=?2,fullfilleddate=?3,fullfillmentstatus=?4 where requestid=?1",nativeQuery = true)
	public int receivedBlood(Integer requestid, String status, LocalDate fullfilleddate,
			String fullfillmentstatus);

	@Modifying
	@Transactional
	@Query(value = "update users_blood_request set status=?2,acceptoruserid=?3,acceptorrole=?4,fullfillmentstatus=?5 where requestid=?1",nativeQuery = true)
	public int notReceivedBlood(Integer requestid, String status, int acceptoruserid,
			String acceptorrole, String fullfillmentstatus);

}
