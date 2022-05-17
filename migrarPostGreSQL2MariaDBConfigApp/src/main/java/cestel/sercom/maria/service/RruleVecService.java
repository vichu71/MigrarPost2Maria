package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.RruleVec;
import cestel.sercom.maria.repo.IRruleVecRepo;

@Service("rruleVecServiceMaria")
public class RruleVecService {
	@Autowired
	private IRruleVecRepo repo;

	public RruleVec save(RruleVec rules) {
		return repo.save(rules);
	}

}
