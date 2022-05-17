package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Users;

@Repository("userRepoMaria")
public interface IUserRepo extends JpaRepository<Users, Long> {

}