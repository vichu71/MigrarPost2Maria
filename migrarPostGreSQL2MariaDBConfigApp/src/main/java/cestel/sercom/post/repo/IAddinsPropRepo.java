package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.AddinsProp;

@Repository("addinsPropRepoPost")
public interface IAddinsPropRepo extends JpaRepository<AddinsProp, Long> {

}
