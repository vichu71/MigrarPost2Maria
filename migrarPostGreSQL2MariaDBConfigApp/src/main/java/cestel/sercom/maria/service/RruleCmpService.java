package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.RruleCmp;
import cestel.sercom.maria.repo.IRruleCmpRepo;

@Service("rruleCmpServiceMaria")
public class RruleCmpService {
	@Autowired
	private IRruleCmpRepo repo;

	public RruleCmp save(RruleCmp rules) {
		return repo.save(rules);
	}

}
