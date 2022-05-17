package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.PropResource;
import cestel.sercom.maria.entity.Resource;
import cestel.sercom.maria.repo.IPropResourceRepo;
import cestel.sercom.maria.repo.IResourceRepo;

@Service("propResourceServiceMaria")
public class PropResourceService {
	@Autowired
	private IPropResourceRepo repo;

	public PropResource save(PropResource resource) {
		return repo.save(resource);
	}

}
