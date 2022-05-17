package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Sites;
import cestel.sercom.post.repo.ISitesRepo;



@Service("sitesServicePost")
public class SitesService{

	@Autowired
	private ISitesRepo repo;

	public List<Sites> findAll() {
		return repo.findAll();
	}
}