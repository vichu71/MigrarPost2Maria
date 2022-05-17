package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.UsrDns;
import cestel.sercom.maria.repo.IUsrDnsRepo;

@Service("UsrDnsServiceMaria")
public class UsrDnsService {
	@Autowired
	private IUsrDnsRepo repo;

	public UsrDns save(UsrDns usuario) {
		return repo.save(usuario);
	}

}
