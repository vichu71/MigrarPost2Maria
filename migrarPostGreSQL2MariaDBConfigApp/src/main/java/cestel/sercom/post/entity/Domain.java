package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_domains", schema = "public")
public class Domain {
	@Id
	 private Long dom_id;
	 private String name;
	 private String info;
	 private String schema;
	 private String utc;
}
