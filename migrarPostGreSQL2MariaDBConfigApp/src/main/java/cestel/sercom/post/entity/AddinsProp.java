package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import cestel.sercom.post.entity.composite.CompositeKeyAddProp;
import cestel.sercom.post.entity.composite.CompositeKeyResProp;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@IdClass(CompositeKeyAddProp.class)
@Table(name = "s_addin_props", schema = "public")
public class AddinsProp {
	@Id
	private Long addin_id;
	private String value;
	@Id
	private String name;
}
