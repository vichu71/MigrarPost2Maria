package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.AddinsPlg;

@Repository("addinsPlgRepoPost")
public interface IAddinsPlgRepo extends JpaRepository<AddinsPlg, Long> {

}
