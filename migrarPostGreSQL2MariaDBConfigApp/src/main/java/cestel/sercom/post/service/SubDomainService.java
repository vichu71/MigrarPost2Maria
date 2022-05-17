package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.SubDomain;
import cestel.sercom.post.repo.ISubDomainRepo;



@Service("subDomainServicePost")
public class SubDomainService{

	@Autowired
	private ISubDomainRepo repo;

	public List<SubDomain> findAll() {
		return repo.findAll();
	}
}
