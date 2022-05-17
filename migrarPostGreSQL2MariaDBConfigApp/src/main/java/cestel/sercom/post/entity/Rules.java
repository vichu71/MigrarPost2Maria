package cestel.sercom.post.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "s_rrules", schema = "public")
public class Rules {

    @Id
    private Long rrule_id;
    private String      name;
    private String      mediacode;
    private String      accessprefix;
    private String      accesssuffix;
    private Long      dom_id;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean       enabled;
      private String      accessregex;
   
    private String      extraprefix;
  
    private String      extrasuffix;
   
    private String      interval;
    
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean    keepaccessprefix;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean       keepaccesssuffix;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean      keepcampaign;
   
    private String      node_id;
    
   
    
    
    
    
   
   
    
}