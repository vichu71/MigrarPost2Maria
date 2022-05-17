package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import cestel.sercom.post.entity.composite.CompositeKeyResProp;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@IdClass(CompositeKeyResProp.class)
@Table(name = "s_res_props", schema = "public")
public class PropResource {
	@Id
	 private Long res_id;
	 private String value;
	 @Id
	 private String name;
}
