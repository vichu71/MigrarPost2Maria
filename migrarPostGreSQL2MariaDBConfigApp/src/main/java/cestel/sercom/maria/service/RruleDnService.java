package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.RruleDn;
import cestel.sercom.maria.repo.IRruleDnRepo;

@Service("rruleDnServiceMaria")
public class RruleDnService {
	@Autowired
	private IRruleDnRepo repo;

	public RruleDn save(RruleDn rules) {
		return repo.save(rules);
	}

}
