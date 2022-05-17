package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Syspropcoll;
import cestel.sercom.maria.repo.ISyspropcollRepo;

@Service("syspropcollServiceMaria")
public class SyspropcollService {
	@Autowired
	private ISyspropcollRepo repo;

	public Syspropcoll save(Syspropcoll syspropcoll) {
		return repo.save(syspropcoll);
	}

}
