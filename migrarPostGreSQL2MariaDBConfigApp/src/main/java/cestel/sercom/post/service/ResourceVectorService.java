package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Resource;
import cestel.sercom.post.entity.ResourceVector;
import cestel.sercom.post.repo.IResourceRepo;
import cestel.sercom.post.repo.IResourceVectorRepo;



@Service("resourceVectorServicePost")
public class ResourceVectorService{

	@Autowired
	private IResourceVectorRepo repo;

	public List<ResourceVector> findAll() {
		return repo.findAll();
	}
}