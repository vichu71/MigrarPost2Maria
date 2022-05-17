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
@Table(name = "domains")
public class Domain {

    @Id
    @Column(nullable = false,unique = true,columnDefinition="serial")
    private Long id;
    @Column(nullable = false)
    private String      name;
    @Column
    private String      info;
    @Column
    private String      c_schema;
    @Column
    private String      utc;
}