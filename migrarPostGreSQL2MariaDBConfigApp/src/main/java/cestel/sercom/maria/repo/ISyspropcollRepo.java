package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Syspropcoll;

@Repository("syspropscollRepoMaria")
public interface ISyspropcollRepo extends JpaRepository<Syspropcoll, Long> {

}