package cestel.sercom.maria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
@Entity
@Table(name = "users_dns")
public class UsrDns {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Long id;

	@Column(nullable = false)
	private Long userid;

	@Column(nullable = false)
	private Long dnid;

}
