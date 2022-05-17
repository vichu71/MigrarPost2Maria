package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Users;
import cestel.sercom.post.repo.IUserRepo;



@Service("usersServicePost")
public class UsersService{

	@Autowired
	private IUserRepo repo;

	public List<Users> findAll() {
		return repo.findAll();
	}
}
