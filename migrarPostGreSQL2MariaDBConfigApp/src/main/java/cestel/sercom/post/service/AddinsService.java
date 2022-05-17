package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Addins;
import cestel.sercom.post.repo.IAddinsRepo;



@Service("addinsServicePost")
public class AddinsService{

	@Autowired
	private IAddinsRepo repo;

	public List<Addins> findAll() {
		return repo.findAll();
	}
}
