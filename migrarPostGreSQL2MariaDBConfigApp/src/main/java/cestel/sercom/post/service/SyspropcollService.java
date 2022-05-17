package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Syspropcoll;
import cestel.sercom.post.repo.ISyspropcollRepo;



@Service("syspropcollServicePost")
public class SyspropcollService{

	@Autowired
	private ISyspropcollRepo repo;

	public List<Syspropcoll> findAll() {
		return repo.findAll();
	}
}