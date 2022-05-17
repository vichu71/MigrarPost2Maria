package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Sysprops;

@Repository("syspropsRepoMaria")
public interface ISyspropsRepo extends JpaRepository<Sysprops, Long> {

}