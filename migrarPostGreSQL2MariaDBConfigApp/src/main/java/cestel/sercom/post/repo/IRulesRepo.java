package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Resource;
import cestel.sercom.post.entity.Rules;

@Repository("rulesRepoPost")
public interface IRulesRepo extends JpaRepository<Rules, Long> {

}
