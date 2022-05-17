package cestel.sercom.maria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
@Entity
@Table(name = "answers")
public class Answers {

	@Id
	 @Column(nullable = false,unique = true,columnDefinition="serial")
	private Long id;
	
	@Column(nullable = false)
	private String phoneaddress;
	
	@Column(nullable = false)
    private Long resid;
	
	
	@Column(nullable = false)
	private Long subdomid;
	
}
