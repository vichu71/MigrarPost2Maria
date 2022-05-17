package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.RruleCmp;

@Repository("rruleCmpRepoPost")
public interface IRruleCmpRepo extends JpaRepository<RruleCmp, Long> {

}
