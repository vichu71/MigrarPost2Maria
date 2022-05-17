package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_rrule_dn", schema = "public")
public class RruleDn {
	@Id
	 private Long rrule_id;
	 private Long dn_id;
	}
