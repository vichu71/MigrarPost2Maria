package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Dns;
import cestel.sercom.post.entity.License;

@Repository("licenseRepoPost")
public interface ILicenseRepo extends JpaRepository<License, Long> {

}
