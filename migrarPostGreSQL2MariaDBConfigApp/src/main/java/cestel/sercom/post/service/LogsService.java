package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Logs;
import cestel.sercom.post.repo.ILogsRepo;



@Service("logsServicePost")
public class LogsService{

	@Autowired
	private ILogsRepo repo;

	public List<Logs> findAll() {
		return repo.findAll();
	}
}