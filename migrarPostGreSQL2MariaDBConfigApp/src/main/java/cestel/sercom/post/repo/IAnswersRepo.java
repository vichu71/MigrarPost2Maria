package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Answers;

@Repository("answersRepoPost")
public interface IAnswersRepo extends JpaRepository<Answers, Long> {

}
