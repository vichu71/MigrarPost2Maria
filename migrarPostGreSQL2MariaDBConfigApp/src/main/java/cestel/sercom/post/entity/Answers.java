package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_answers", schema = "public")
public class Answers {
	@Id
	 private Long id;
	 private String phone_address;
	 private Long resource_id;
	 private Long subdom_id;
	 
}
