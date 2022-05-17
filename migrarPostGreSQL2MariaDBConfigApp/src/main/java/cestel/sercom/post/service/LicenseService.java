package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.License;
import cestel.sercom.post.repo.ILicenseRepo;



@Service("licenseServicePost")
public class LicenseService{

	@Autowired
	private ILicenseRepo repo;

	public List<License> findAll() {
		return repo.findAll();
	}
}