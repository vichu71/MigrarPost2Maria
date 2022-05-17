package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.PropResource;
import cestel.sercom.post.entity.Resource;
import cestel.sercom.post.repo.IPropResourceRepo;
import cestel.sercom.post.repo.IResourceRepo;



@Service("propResourceServicePost")
public class PropResourceService{

	@Autowired
	private IPropResourceRepo repo;

	public List<PropResource> findAll() {
		return repo.findAll();
	}
}