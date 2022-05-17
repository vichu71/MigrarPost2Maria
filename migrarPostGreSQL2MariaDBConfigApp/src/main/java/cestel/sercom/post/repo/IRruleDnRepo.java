package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.RruleDn;

@Repository("rruleDnRepoPost")
public interface IRruleDnRepo extends JpaRepository<RruleDn, Long> {

}
