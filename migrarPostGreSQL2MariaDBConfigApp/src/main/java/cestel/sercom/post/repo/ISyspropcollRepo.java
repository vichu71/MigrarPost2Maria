package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Syspropcoll;

@Repository("syspropcollRepoPost")
public interface ISyspropcollRepo extends JpaRepository<Syspropcoll, Long> {

}
