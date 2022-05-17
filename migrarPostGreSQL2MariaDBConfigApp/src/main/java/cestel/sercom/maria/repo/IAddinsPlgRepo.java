package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.AddinsPlg;

@Repository("addinsPlgRepoMaria")
public interface IAddinsPlgRepo extends JpaRepository<AddinsPlg, Long> {

}