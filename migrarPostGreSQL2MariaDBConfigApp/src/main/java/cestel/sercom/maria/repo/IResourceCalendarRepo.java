package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Resource;
import cestel.sercom.maria.entity.ResourceCalendar;
import cestel.sercom.maria.entity.ResourceVector;

@Repository("resourceCalendarRepoMaria")
public interface IResourceCalendarRepo extends JpaRepository<ResourceCalendar, Long> {

}