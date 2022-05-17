package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Resource;
import cestel.sercom.post.entity.RruleCal;
import cestel.sercom.post.entity.Rules;

@Repository("rruleCalRepoPost")
public interface IRruleCalRepo extends JpaRepository<RruleCal, Long> {

}
