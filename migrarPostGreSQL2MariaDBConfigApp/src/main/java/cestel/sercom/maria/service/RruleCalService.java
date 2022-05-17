package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Roles;
import cestel.sercom.maria.entity.RruleCal;
import cestel.sercom.maria.entity.Rules;
import cestel.sercom.maria.repo.IRolesRepo;
import cestel.sercom.maria.repo.IRruleCalRepo;
import cestel.sercom.maria.repo.IRulesRepo;

@Service("rruleCalServiceMaria")
public class RruleCalService {
	@Autowired
	private IRruleCalRepo repo;

	public RruleCal save(RruleCal rules) {
		return repo.save(rules);
	}

}
