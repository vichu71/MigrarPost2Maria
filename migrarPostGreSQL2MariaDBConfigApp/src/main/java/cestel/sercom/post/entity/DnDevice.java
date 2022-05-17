package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_dn_device", schema = "public")
public class DnDevice {
	@Id
	 private Long dn_id;
	 private Long dev_id;
}
