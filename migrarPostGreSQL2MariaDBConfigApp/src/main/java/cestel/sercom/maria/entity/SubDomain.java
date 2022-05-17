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
@Table(name = "subdomains")
public class SubDomain {

    @Id
    @Column(nullable = false,unique = true,columnDefinition="serial")
    private Long id;
    @Column(nullable = false)
    private String      name;
    @Column
    private String      info;
    @Column(nullable = false)
    private Long        dom_id;
    @Column
    private String      utc;
}