package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Users;
import cestel.sercom.maria.repo.IUserRepo;

@Service("usersServiceMaria")
public class UsersService {
	@Autowired
	private IUserRepo repo;

	public Users save(Users usuario) {
		return repo.save(usuario);
	}

}
