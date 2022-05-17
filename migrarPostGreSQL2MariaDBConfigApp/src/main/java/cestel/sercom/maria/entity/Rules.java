package cestel.sercom.maria.entity;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "rrules")
public class Rules {

    @Id
    @Column(nullable = false,unique = true,columnDefinition="serial")
    private Long id;
    @Column(nullable = false)
    private String      name;
    @Column(nullable = false)
    private String      mediacode;
    @Column
    private String      accessprefix;
    @Column
    private String      accesssuffix;
   
    @Column(nullable = false)
    private Long      domid;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean       enabled;
    @Column
    private String      accessregex;
    @Column
    private String      extraprefix;
    @Column
    private String      extrasuffix;
    @Column
    private String      intervalo;
    
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean    keepaccessprefix;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean       keepaccesssuffix;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean      keepcampaign;
    @Column
    private String      nodeid;
    
   
    
    
    
    
   
   
    
}