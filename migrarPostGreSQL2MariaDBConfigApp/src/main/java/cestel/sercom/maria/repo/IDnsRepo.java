package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Dns;

@Repository("dnsRepoMaria")
public interface IDnsRepo extends JpaRepository<Dns, Long> {

}