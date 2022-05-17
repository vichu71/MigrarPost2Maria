package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.DnDevice;

@Repository("dnDeviceRepoMaria")
public interface IDnDeviceRepo extends JpaRepository<DnDevice, Long> {

}