package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.AddinsProp;
import cestel.sercom.post.repo.IAddinsPropRepo;



@Service("addinsPropServicePost")
public class AddinsPropService{

	@Autowired
	private IAddinsPropRepo repo;

	public List<AddinsProp> findAll() {
		return repo.findAll();
	}
}
