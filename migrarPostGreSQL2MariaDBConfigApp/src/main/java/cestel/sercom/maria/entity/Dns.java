package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "dns")
public class Dns {

    @Id
    @Column(nullable = false,unique = true,columnDefinition="serial")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String dntypecode;
    
    @Column(nullable = false)
    private String mediacode;
    
    @Column
    private String remotepeer;

    @Column(nullable = false)
    private Long      domid;
    
    @Column
    private String nodeid;
    
   
}