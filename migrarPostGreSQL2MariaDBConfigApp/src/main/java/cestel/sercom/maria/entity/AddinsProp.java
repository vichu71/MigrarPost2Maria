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
@Table(name = "addins_prop")
public class AddinsProp {

	@Id
	@Column(nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
    private Long addinsid;
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private String value;


}