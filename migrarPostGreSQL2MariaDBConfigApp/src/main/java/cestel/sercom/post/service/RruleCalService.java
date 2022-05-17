package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.RruleCal;
import cestel.sercom.post.entity.Rules;
import cestel.sercom.post.repo.IRruleCalRepo;
import cestel.sercom.post.repo.IRulesRepo;



@Service("rruleCalServicePost")
public class RruleCalService{

	@Autowired
	private IRruleCalRepo repo;

	public List<RruleCal> findAll() {
		return repo.findAll();
	}
}