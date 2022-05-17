package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * @author vmhuecas
 * @since may 2022
 */
//@Data
@Getter
@Setter
@Entity
@Table(name = "addins_dev")
public class AddinsDev {

	@Id
	@Column(nullable = false, unique = true)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String devgroup;

	@Column(nullable = false)
	private String media;

	
}