package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Dns;
import cestel.sercom.maria.repo.IDnsRepo;

@Service("dnsServiceMaria")
public class DnsService {
	@Autowired
	private IDnsRepo repo;

	public Dns save(Dns domain) {
		return repo.save(domain);
	}

}
