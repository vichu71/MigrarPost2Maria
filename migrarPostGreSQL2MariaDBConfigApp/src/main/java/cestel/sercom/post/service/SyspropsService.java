package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Sysprops;
import cestel.sercom.post.repo.ISyspropsRepo;



@Service("syspropsServicePost")
public class SyspropsService{

	@Autowired
	private ISyspropsRepo repo;

	public List<Sysprops> findAll() {
		return repo.findAll();
	}
}