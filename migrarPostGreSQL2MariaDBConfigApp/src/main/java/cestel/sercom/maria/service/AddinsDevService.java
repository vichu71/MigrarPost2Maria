package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.AddinsDev;
import cestel.sercom.maria.repo.IAddinsDevRepo;

@Service("addinsDevServiceMaria")
public class AddinsDevService {
	@Autowired
	private IAddinsDevRepo repo;

	public AddinsDev save(AddinsDev add) {
		return repo.save(add);
	}

}
