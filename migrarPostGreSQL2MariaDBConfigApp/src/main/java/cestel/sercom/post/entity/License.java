package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_licenses", schema = "public")
public class License {
	@Id
	 private Long lic_id;
	 private String name;
	 private String quantity;
	 private String expirationdate;
	 private String keys;
	 private Long dom_id;
	 private String node_id;
}
