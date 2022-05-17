package cestel.sercom.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cestel.sercom.post.entity.Answers;
import cestel.sercom.post.repo.IAnswersRepo;



@Service("answersServicePost")
public class AnswersService{

	@Autowired
	private IAnswersRepo repo;

	public List<Answers> findAll() {
		return repo.findAll();
	}
}
