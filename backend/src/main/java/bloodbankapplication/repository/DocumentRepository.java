package bloodbankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bloodbankapplication.dao.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer>{

}
