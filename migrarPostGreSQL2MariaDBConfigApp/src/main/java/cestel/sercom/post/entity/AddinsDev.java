package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_addins_dev", schema = "public")
public class AddinsDev {
	@Id
	 private Long addin_id;
	 private String name;
	 private String devgroup;
	 private String media;
}
