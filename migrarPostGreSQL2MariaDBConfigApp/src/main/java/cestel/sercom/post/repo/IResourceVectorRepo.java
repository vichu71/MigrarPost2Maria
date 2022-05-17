package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Resource;
import cestel.sercom.post.entity.ResourceVector;

@Repository("resourceVectorRepoPost")
public interface IResourceVectorRepo extends JpaRepository<ResourceVector, Long> {

}
