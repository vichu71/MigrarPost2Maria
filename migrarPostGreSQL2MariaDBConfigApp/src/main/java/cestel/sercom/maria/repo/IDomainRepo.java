package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Domain;

@Repository("domainRepoMaria")
public interface IDomainRepo extends JpaRepository<Domain, Long> {

}