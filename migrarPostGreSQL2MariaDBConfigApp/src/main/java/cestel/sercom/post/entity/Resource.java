package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_resources", schema = "public")
public class Resource {
	@Id
	 private Long res_id;
	 private String res_class;
	 private String name;
	 private String info;
	 private Long subdom_id;
	 private String node_id;
}
