package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "dn_device")
public class DnDevice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,unique = true)
	private Long id;
	
	 @Column(nullable = false)
	private Long dnid;
	
	 @Column(nullable = false)
	private Long devid;

}