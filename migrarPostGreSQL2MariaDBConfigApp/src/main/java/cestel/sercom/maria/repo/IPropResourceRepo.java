package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.PropResource;
import cestel.sercom.maria.entity.Resource;

@Repository("propResourceRepoMaria")
public interface IPropResourceRepo extends JpaRepository<PropResource, Long> {

}