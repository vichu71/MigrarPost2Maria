package cestel.sercom.maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.maria.entity.Answers;
import cestel.sercom.maria.repo.IAnswersRepo;

@Service("answersServiceMaria")
public class AnswersService {
	@Autowired
	private IAnswersRepo repo;

	public Answers save(Answers answers) {
		return repo.save(answers);
	}

}
