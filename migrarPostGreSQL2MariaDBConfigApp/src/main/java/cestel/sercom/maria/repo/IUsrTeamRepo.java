package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.UsrTeam;

@Repository("usrTeamRepoMaria")
public interface IUsrTeamRepo extends JpaRepository<UsrTeam, Long> {

}