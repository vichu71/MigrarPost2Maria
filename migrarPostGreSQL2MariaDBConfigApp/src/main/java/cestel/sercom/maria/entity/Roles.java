package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vmhuecas
 * @since may 2022
 */
//@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @Column(nullable = false,unique = true)
    private Long id;
   
    @Column(nullable = false)
    private String      nombre;
    @Column(nullable = false)
    private String      descripcion;
    @Column(nullable = false)
    private String      definicion;
   
}