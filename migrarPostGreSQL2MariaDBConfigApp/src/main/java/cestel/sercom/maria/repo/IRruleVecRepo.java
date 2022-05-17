package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.RruleVec;

@Repository("rruleVecRepoMaria")
public interface IRruleVecRepo extends JpaRepository<RruleVec, Long> {

}