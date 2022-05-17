package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.UsrDns;

@Repository("usrDnsRepoMaria")
public interface IUsrDnsRepo extends JpaRepository<UsrDns, Long> {

}