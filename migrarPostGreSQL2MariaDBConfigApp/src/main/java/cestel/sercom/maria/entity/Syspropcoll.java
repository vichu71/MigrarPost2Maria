package cestel.sercom.maria.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import lombok.Data;

/**
 * @author vmhuecas
 * @since may 2022
 */
@Data
@Entity
@Table(name = "syspropcoll")
public class Syspropcoll {

    @Id
    private Long id;
    @Column
    private String  name;
    
 
}