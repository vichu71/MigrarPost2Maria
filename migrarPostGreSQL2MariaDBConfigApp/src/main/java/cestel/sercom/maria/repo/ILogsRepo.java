package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.License;
import cestel.sercom.maria.entity.Logs;

@Repository("logsRepoMaria")
public interface ILogsRepo extends JpaRepository<Logs, Long> {

}