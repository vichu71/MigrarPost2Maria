package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.RruleVec;
import cestel.sercom.post.repo.IRruleVecRepo;



@Service("rruleVecServicePost")
public class RruleVecService{

	@Autowired
	private IRruleVecRepo repo;

	public List<RruleVec> findAll() {
		return repo.findAll();
	}
}