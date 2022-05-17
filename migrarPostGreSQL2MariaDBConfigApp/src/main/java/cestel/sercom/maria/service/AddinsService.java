package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Addins;
import cestel.sercom.maria.repo.IAddinsRepo;

@Service("addinsServiceMaria")
public class AddinsService {
	@Autowired
	private IAddinsRepo repo;

	public Addins save(Addins add) {
		return repo.save(add);
	}

}
