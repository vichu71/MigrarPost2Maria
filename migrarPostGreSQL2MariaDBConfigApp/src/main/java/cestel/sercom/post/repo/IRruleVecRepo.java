package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.RruleVec;

@Repository("rruleVecRepoPost")
public interface IRruleVecRepo extends JpaRepository<RruleVec, Long> {

}
