package cestel.sercom.post.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "s_subdomains", schema = "public")
public class SubDomain {
	@Id
	 private Long subdom_id;
	 private String name;
	 private String info;
	 private Long dom_id;
	 private String utc;
}
