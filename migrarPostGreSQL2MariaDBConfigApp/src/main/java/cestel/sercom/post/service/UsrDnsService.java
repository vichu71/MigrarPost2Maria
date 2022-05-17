package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.UsrDns;
import cestel.sercom.post.repo.IUsrDnsRepo;



@Service("UsrDnsServicePost")
public class UsrDnsService{

	@Autowired
	private IUsrDnsRepo repo;

	public List<UsrDns> findAll() {
		return repo.findAll();
	}
}
