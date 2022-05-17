package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Resource;
import cestel.sercom.maria.entity.ResourceCalendar;
import cestel.sercom.maria.entity.ResourceVector;
import cestel.sercom.maria.repo.IResourceCalendarRepo;
import cestel.sercom.maria.repo.IResourceRepo;
import cestel.sercom.maria.repo.IResourceVectorRepo;

@Service("resourceCalendarServiceMaria")
public class ResourceCalendarService {
	@Autowired
	private IResourceCalendarRepo repo;

	public ResourceCalendar save(ResourceCalendar resource) {
		return repo.save(resource);
	}

}
