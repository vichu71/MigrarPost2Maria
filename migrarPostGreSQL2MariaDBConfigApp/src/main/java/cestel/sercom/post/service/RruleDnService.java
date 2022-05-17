package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.RruleDn;
import cestel.sercom.post.repo.IRruleDnRepo;



@Service("rruleDnServicePost")
public class RruleDnService{

	@Autowired
	private IRruleDnRepo repo;

	public List<RruleDn> findAll() {
		return repo.findAll();
	}
}