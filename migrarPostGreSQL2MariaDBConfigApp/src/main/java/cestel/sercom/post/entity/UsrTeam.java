package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import cestel.sercom.post.entity.composite.CompositeKeyUsrTeam;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
@Entity
@IdClass(CompositeKeyUsrTeam.class)
@Table(name = "s_usr_team", schema = "public")
public class UsrTeam {

	@Id
	private Long user_id;

	@Id
	private Long res_id;

}
