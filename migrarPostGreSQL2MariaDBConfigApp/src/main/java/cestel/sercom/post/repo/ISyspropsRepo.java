package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Sysprops;

@Repository("syspropsRepoPost")
public interface ISyspropsRepo extends JpaRepository<Sysprops, Long> {

}
