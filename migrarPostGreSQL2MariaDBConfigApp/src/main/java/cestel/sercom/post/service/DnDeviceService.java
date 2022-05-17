package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.DnDevice;
import cestel.sercom.post.repo.IDnDeviceRepo;



@Service("dnDeviceServicePost")
public class DnDeviceService{

	@Autowired
	private IDnDeviceRepo repo;

	public List<DnDevice> findAll() {
		return repo.findAll();
	}
}
