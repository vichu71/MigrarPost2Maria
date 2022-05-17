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
@Table(name = "rrule_cal")
public class RruleCal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(nullable = false,unique = true)
	private Long id;
	
	@Column(nullable = false)
	private Long rruleid;
	
	@Column(nullable = false)
	private Long resid;

}