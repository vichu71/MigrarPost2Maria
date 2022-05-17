package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Roles;
import cestel.sercom.maria.entity.Rules;
import cestel.sercom.maria.repo.IRolesRepo;
import cestel.sercom.maria.repo.IRulesRepo;

@Service("rulesServiceMaria")
public class RulesService {
	@Autowired
	private IRulesRepo repo;

	public Rules save(Rules rules) {
		return repo.save(rules);
	}

}
