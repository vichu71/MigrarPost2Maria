package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Addins;

@Repository("addinsRepoMaria")
public interface IAddinsRepo extends JpaRepository<Addins, Long> {

}