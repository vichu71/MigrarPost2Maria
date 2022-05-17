package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.UsrDns;

@Repository("usrDnsRepoPost")
public interface IUsrDnsRepo extends JpaRepository<UsrDns, Long> {

}
