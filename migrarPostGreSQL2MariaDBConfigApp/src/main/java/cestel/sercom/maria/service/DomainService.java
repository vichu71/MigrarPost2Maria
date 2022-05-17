package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Domain;
import cestel.sercom.maria.repo.IDomainRepo;

@Service("domainServiceMaria")
public class DomainService {
	@Autowired
	private IDomainRepo repo;

	public Domain save(Domain domain) {
		return repo.save(domain);
	}

}
