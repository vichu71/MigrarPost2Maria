package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Addins;

@Repository("addinsRepoPost")
public interface IAddinsRepo extends JpaRepository<Addins, Long> {

}
