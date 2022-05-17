package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "addins")
public class Addins {

  
    @Id
    @Column(nullable = false,unique = true,columnDefinition="serial")
    private Long id;

    @Column
    private String family;

    @Column
    private String type;
    
    @Column(nullable = false)
    private String aclass;
    
    @Column
    private String version;
    
    @Column
    private String nodeid;
    
   
 

}