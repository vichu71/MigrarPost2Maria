package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.ResourceCalendar;
import cestel.sercom.post.repo.IResourceCalendarRepo;



@Service("resourceCalendarServicePost")
public class ResourceCalendarService{

	@Autowired
	private IResourceCalendarRepo repo;

	public List<ResourceCalendar> findAll() {
		return repo.findAll();
	}
}