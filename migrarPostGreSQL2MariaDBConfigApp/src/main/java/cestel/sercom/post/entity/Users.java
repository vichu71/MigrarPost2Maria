package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_users", schema = "public")
public class Users {
	@Id
	 private Long user_id;
	 private String name;
	 private String info;
	 private Long profilecode;
	 private String login;
	 private String pwd;
	 private Long domid;
	 private Long subdomid;

}
