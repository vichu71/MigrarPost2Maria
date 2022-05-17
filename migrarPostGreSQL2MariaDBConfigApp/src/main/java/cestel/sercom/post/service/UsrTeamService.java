package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.UsrTeam;
import cestel.sercom.post.repo.IUsrTeamRepo;



@Service("UsrTeamServicePost")
public class UsrTeamService{

	@Autowired
	private IUsrTeamRepo repo;

	public List<UsrTeam> findAll() {
		return repo.findAll();
	}
}
