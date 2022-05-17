package cestel.sercom.post.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "s_syspropcoll")
public class Syspropcoll {

    @Id
    private Long sysprop_id;
    @Column
    private String  name;
    
 
}