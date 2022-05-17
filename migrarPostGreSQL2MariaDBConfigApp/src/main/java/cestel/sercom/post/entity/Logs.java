package cestel.sercom.post.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_logs", schema = "public")
public class Logs {
	@Id
	 private Long log_id;
	 private String severity;
	 private String source;
	 private String msg;
	 private LocalDateTime creation;
	
}
