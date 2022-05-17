package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "sites")
public class Sites {

    @Id
    @Column(nullable = false,unique = true,columnDefinition="serial")
    private Long id;
    @Column(nullable = false)
    private String      name;
    @Column
    private String      info;
    
}