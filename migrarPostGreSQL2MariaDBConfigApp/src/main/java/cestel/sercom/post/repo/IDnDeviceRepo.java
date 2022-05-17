package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.DnDevice;

@Repository("dndeviceRepoPost")
public interface IDnDeviceRepo extends JpaRepository<DnDevice, Long> {

}
