package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Domain;

@Repository("domainRepoPost")
public interface IDomainRepo extends JpaRepository<Domain, Long> {

}
