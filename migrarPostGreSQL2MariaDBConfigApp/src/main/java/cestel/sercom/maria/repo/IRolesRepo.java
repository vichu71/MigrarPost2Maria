package cestel.sercom.maria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cestel.sercom.maria.entity.Roles;

@Repository("rolesRepoMaria")
public interface IRolesRepo extends JpaRepository<Roles, Long> {

}