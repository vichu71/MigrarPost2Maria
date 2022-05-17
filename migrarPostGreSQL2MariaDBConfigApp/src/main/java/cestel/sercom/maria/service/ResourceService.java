package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Resource;
import cestel.sercom.maria.repo.IResourceRepo;

@Service("resourceServiceMaria")
public class ResourceService {
	@Autowired
	private IResourceRepo repo;

	public Resource save(Resource resource) {
		return repo.save(resource);
	}

}
