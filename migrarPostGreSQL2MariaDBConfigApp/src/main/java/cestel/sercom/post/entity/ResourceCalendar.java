package cestel.sercom.post.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_resources_adv_cal", schema = "public")
public class ResourceCalendar {
	@Id
	 private Long res_id;
	 private String xml_data;
}
