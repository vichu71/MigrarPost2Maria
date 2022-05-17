package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.UsrTeam;
import cestel.sercom.maria.repo.IUsrTeamRepo;

@Service("UsrTeamServiceMaria")
public class UsrTeamService {
	@Autowired
	private IUsrTeamRepo repo;

	public UsrTeam save(UsrTeam usuario) {
		return repo.save(usuario);
	}

}
