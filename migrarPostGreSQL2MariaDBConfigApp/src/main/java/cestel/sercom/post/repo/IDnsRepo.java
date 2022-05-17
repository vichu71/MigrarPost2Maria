package cestel.sercom.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.post.entity.Dns;

@Repository("dnsRepoPost")
public interface IDnsRepo extends JpaRepository<Dns, Long> {

}
