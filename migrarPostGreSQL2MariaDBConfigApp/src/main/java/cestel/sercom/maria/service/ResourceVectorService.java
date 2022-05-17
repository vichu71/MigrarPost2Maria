package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Resource;
import cestel.sercom.maria.entity.ResourceVector;
import cestel.sercom.maria.repo.IResourceRepo;
import cestel.sercom.maria.repo.IResourceVectorRepo;

@Service("resourceVectorServiceMaria")
public class ResourceVectorService {
	@Autowired
	private IResourceVectorRepo repo;

	public ResourceVector save(ResourceVector resource) {
		return repo.save(resource);
	}

}
