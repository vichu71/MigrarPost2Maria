package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Dns;
import cestel.sercom.post.repo.IDnsRepo;



@Service("dnsServicePost")
public class DnsService{

	@Autowired
	private IDnsRepo repo;

	public List<Dns> findAll() {
		return repo.findAll();
	}
}
