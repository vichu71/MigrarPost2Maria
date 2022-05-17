package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.AddinsPlg;
import cestel.sercom.maria.repo.IAddinsPlgRepo;

@Service("addinsPlgServiceMaria")
public class AddinsPlgService {
	@Autowired
	private IAddinsPlgRepo repo;

	public AddinsPlg save(AddinsPlg add) {
		return repo.save(add);
	}

}
