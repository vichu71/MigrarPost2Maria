package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Domain;
import cestel.sercom.post.repo.IDomainRepo;



@Service("domainServicePost")
public class DomainService{

	@Autowired
	private IDomainRepo repo;

	public List<Domain> findAll() {
		return repo.findAll();
	}
}
