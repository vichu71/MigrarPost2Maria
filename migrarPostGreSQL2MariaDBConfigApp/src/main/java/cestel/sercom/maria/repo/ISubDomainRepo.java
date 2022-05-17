package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.SubDomain;

@Repository("subDomainRepoMaria")
public interface ISubDomainRepo extends JpaRepository<SubDomain, Long> {

}