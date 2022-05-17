package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.DnDevice;
import cestel.sercom.maria.repo.IDnDeviceRepo;

@Service("dnDeviceServiceMaria")
public class DnDeviceService {
	@Autowired
	private IDnDeviceRepo repo;

	public DnDevice save(DnDevice dnDevice) {
		return repo.save(dnDevice);
	}

}
