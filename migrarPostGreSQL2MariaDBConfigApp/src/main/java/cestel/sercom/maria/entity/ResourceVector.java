package cestel.sercom.maria.entity;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "res_vector")
public class ResourceVector {
	@Id
	@Column(nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Long resid;

	@Column  (length = 8192)
	private String xmldata;

}