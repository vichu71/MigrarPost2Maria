package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Dns;
import cestel.sercom.maria.entity.License;
import cestel.sercom.maria.repo.IDnsRepo;
import cestel.sercom.maria.repo.ILicenseRepo;

@Service("licenseServiceMaria")
public class LicenseService {
	@Autowired
	private ILicenseRepo repo;

	public License save(License license) {
		return repo.save(license);
	}

}
