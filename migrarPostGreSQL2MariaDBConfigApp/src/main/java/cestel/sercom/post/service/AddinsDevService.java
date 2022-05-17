package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.AddinsDev;
import cestel.sercom.post.repo.IAddinsDevRepo;



@Service("addinsDevServicePost")
public class AddinsDevService{

	@Autowired
	private IAddinsDevRepo repo;

	public List<AddinsDev> findAll() {
		return repo.findAll();
	}
}
