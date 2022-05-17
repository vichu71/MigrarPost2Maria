package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Getter
@Setter
@Entity
@Table(name = "resources")
public class Resource {

	@Id
	@Column(nullable = false,unique = true,columnDefinition="serial")
	private Long id;
	
	@Column
	private String name;

	@Column
	private String info;
	
	@Column
	private String nodeid;
	
	@Column(nullable = false)
	private String resclass;

	@Column(nullable = false)
	private Long subdomid;

}