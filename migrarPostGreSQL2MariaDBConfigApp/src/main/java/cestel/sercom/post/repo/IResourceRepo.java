package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Resource;

@Repository("resourceRepoPost")
public interface IResourceRepo extends JpaRepository<Resource, Long> {

}
