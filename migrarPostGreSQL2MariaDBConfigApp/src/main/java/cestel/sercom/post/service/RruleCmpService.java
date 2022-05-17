package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.RruleCmp;
import cestel.sercom.post.repo.IRruleCmpRepo;



@Service("rruleCmpServicePost")
public class RruleCmpService{

	@Autowired
	private IRruleCmpRepo repo;

	public List<RruleCmp> findAll() {
		return repo.findAll();
	}
}