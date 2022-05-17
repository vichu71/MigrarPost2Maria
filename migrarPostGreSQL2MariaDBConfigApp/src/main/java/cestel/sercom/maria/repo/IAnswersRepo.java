package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Answers;

@Repository("answersRepoMaria")
public interface IAnswersRepo extends JpaRepository<Answers, Long> {

}