package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Resource;
import cestel.sercom.post.repo.IResourceRepo;



@Service("resourceServicePost")
public class ResourceService{

	@Autowired
	private IResourceRepo repo;

	public List<Resource> findAll() {
		return repo.findAll();
	}
}