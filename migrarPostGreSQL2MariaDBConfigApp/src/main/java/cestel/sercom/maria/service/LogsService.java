package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Dns;
import cestel.sercom.maria.entity.License;
import cestel.sercom.maria.entity.Logs;
import cestel.sercom.maria.repo.IDnsRepo;
import cestel.sercom.maria.repo.ILicenseRepo;
import cestel.sercom.maria.repo.ILogsRepo;

@Service("logsServiceMaria")
public class LogsService {
	@Autowired
	private ILogsRepo repo;

	public Logs save(Logs license) {
		return repo.save(license);
	}

}
