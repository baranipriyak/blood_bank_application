package bloodbankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bloodbankapplication.dao.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
