package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "addins_plg")
public class AddinsPlg {

	@Id
	@Column(nullable = false, unique = true)
	private Long id;
	
	
	@Column(nullable = false)
	private String pclass;
	


}