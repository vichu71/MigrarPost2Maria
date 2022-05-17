package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Roles;
import cestel.sercom.maria.repo.IRolesRepo;

@Service("rolesServiceMaria")
public class RolesService {
	@Autowired
	private IRolesRepo repo;

	public Roles save(Roles roles) {
		return repo.save(roles);
	}

}
