package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Sites;
import cestel.sercom.maria.repo.ISitesRepo;

@Service("sitesServiceMaria")
public class SitesService {
	@Autowired
	private ISitesRepo repo;

	public Sites save(Sites sites) {
		return repo.save(sites);
	}

}
