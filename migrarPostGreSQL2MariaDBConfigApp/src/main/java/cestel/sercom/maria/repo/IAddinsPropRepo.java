package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.AddinsProp;

@Repository("addinsPropRepoMaria")
public interface IAddinsPropRepo extends JpaRepository<AddinsProp, Long> {

}