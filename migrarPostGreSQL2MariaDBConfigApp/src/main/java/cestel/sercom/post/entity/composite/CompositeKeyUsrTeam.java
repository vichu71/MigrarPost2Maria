package cestel.sercom.post.entity.composite;

import java.io.Serializable;

import lombok.Data;

@Data
public class CompositeKeyUsrTeam implements Serializable{
	
	
	private static final long serialVersionUID = -8544847182852449773L;
	private Long user_id;
    private Long res_id;

}
