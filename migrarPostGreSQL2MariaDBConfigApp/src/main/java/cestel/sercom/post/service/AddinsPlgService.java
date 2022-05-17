package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.AddinsPlg;
import cestel.sercom.post.repo.IAddinsPlgRepo;



@Service("addinsPlgServicePost")
public class AddinsPlgService{

	@Autowired
	private IAddinsPlgRepo repo;

	public List<AddinsPlg> findAll() {
		return repo.findAll();
	}
}
