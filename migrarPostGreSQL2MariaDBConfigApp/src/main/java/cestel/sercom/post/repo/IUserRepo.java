package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Users;

@Repository("userRepoPost")
public interface IUserRepo extends JpaRepository<Users, Long> {

}
