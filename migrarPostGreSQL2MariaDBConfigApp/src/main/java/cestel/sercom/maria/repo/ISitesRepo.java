package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Sites;

@Repository("sitesRepoMaria")
public interface ISitesRepo extends JpaRepository<Sites, Long> {

}