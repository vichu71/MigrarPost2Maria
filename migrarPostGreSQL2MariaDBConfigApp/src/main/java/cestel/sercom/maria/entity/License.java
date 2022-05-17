package cestel.sercom.maria.entity;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "licenses")
public class License {

    @Id
    @Column(nullable = false,unique = true)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String quantity;
    
    @Column(nullable = false)
    private String expirationdate;
    
    @Column(nullable = false)
    private String clave;
    
    @Column(nullable = false)
    private Long domid;
    
    @Column
    private String nodeid;
   

}