package cestel.sercom.post.entity;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import cestel.sercom.post.entity.composite.CompositeKeyResProp;
import cestel.sercom.post.entity.composite.CompositeKeySysProp;
import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@IdClass(CompositeKeySysProp.class)
@Table(name = "s_sys_props")
public class Sysprops {

    @Id
    private Long      sysprop_id;
    @Id
    private String      name;
    private String      value;
  
   

}