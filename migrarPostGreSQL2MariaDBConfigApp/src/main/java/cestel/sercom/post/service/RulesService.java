package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Rules;
import cestel.sercom.post.repo.IRulesRepo;



@Service("rulesServicePost")
public class RulesService{

	@Autowired
	private IRulesRepo repo;

	public List<Rules> findAll() {
		return repo.findAll();
	}
}