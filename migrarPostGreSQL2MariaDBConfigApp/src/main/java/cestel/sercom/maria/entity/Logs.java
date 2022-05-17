package cestel.sercom.maria.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "logs")
public class Logs {

    @Id
    @Column(nullable = false,unique = true,columnDefinition="serial")
    private Long id;
    @Column
    private String      severity;
    @Column
    private String      source;
    @Column
    private String      msg;
    @Column
    private LocalDateTime  creation;
    
}