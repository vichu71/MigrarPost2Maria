package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import cestel.sercom.post.entity.composite.CompositeKeyUsrDns;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
@Entity
@IdClass(CompositeKeyUsrDns.class)
@Table(name = "s_users_dns", schema = "public")
public class UsrDns {

	@Id
	private Long user_id;

	@Id
	private Long dn_id;

}
