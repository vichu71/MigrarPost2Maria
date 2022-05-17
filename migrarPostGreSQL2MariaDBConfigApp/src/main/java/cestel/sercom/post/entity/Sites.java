package cestel.sercom.post.entity;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "s_sites")
public class Sites {

    @Id
  
    private Long site_id;
   
    private String      name;
   
    private String      info;
    
}