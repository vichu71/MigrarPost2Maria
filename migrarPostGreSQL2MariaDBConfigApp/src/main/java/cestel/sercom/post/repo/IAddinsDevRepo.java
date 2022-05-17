package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.AddinsDev;

@Repository("addinsDevRepoPost")
public interface IAddinsDevRepo extends JpaRepository<AddinsDev, Long> {

}
