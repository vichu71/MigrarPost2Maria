package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Sysprops;
import cestel.sercom.maria.repo.ISyspropsRepo;

@Service("syspropsServiceMaria")
public class SyspropsService {
	@Autowired
	private ISyspropsRepo repo;

	public Sysprops save(Sysprops sysprops) {
		return repo.save(sysprops);
	}

}
