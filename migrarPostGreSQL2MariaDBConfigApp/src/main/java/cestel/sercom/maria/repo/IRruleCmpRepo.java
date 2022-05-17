package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.RruleCmp;

@Repository("rruleCmpRepoMaria")
public interface IRruleCmpRepo extends JpaRepository<RruleCmp, Long> {

}