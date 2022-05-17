package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Roles;
import cestel.sercom.maria.entity.RruleCal;
import cestel.sercom.maria.entity.Rules;

@Repository("rruleCalRepoMaria")
public interface IRruleCalRepo extends JpaRepository<RruleCal, Long> {

}