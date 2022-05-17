package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Resource;

@Repository("resourceRepoMaria")
public interface IResourceRepo extends JpaRepository<Resource, Long> {

}