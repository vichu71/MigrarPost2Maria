package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_addins", schema = "public")
public class Addins {
	@Id
	 private Long addin_id;
	 private String family;
	 private String type;
	 private String a_class;
	 private String version;
	 private String node_id;
}
