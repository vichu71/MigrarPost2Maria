package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Sites;

@Repository("sitesRepoPost")
public interface ISitesRepo extends JpaRepository<Sites, Long> {

}
