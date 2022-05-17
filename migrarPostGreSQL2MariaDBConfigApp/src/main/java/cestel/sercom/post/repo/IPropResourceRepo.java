package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.PropResource;
import cestel.sercom.post.entity.Resource;

@Repository("propResourceRepoPost")
public interface IPropResourceRepo extends JpaRepository<PropResource, Long> {

}
