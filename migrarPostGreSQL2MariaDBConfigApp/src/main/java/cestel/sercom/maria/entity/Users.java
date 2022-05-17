package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "users")
public class Users {

  
    @Id
    @Column(nullable = false,unique = true,columnDefinition="serial")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String info;
    
    @Column(nullable = false)
    private Long profilecode;
    
    @Column(nullable = false)
    private Long domid;
    
    @Column()
    private Long subdomid;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
   
   
    
    

}