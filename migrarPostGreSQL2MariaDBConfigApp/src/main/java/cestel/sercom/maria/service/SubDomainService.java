package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.SubDomain;
import cestel.sercom.maria.repo.ISubDomainRepo;

@Service("subDomainServiceMaria")
public class SubDomainService {
	@Autowired
	private ISubDomainRepo repo;

	public SubDomain save(SubDomain subdomain) {
		return repo.save(subdomain);
	}

}
