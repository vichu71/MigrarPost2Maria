package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.AddinsProp;
import cestel.sercom.maria.repo.IAddinsPropRepo;

@Service("addinsPropServiceMaria")
public class AddinsPropService {
	@Autowired
	private IAddinsPropRepo repo;

	public AddinsProp save(AddinsProp add) {
		return repo.save(add);
	}

}
