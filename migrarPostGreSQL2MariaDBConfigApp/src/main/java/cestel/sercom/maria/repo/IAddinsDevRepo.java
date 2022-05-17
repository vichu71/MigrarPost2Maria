package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.AddinsDev;

@Repository("addinsDevRepoMaria")
public interface IAddinsDevRepo extends JpaRepository<AddinsDev, Long> {

}