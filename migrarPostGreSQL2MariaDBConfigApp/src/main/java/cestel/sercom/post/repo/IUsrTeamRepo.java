package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.UsrTeam;

@Repository("usrTeamRepoPost")
public interface IUsrTeamRepo extends JpaRepository<UsrTeam, Long> {

}
