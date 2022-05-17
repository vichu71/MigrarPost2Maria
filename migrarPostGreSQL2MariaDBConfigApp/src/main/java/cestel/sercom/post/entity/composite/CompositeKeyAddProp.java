package cestel.sercom.post.entity.composite;

import java.io.Serializable;

import lombok.Data;

@Data
public class CompositeKeyAddProp implements Serializable{
	
	
	private static final long serialVersionUID = -8544847182852449773L;
	private Long addin_id;
    private String name;

}
