package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.License;

@Repository("licenseRepoMaria")
public interface ILicenseRepo extends JpaRepository<License, Long> {

}