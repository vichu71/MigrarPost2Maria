package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_dns", schema = "public")
public class Dns {
	@Id
	 private Long dn_id;
	 private String name;
	 private String dntypecode;
	 private String mediacode;
	 private String remotepeer;
	 private Long dom_id;
	 private String node_id;
}
