
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="EDITORIAL")
public class EDITORIAL implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="Editorial_Id")
    private Long EditorialId;
   @Column(name="edi_name")
    private String ediName;
   @Column(name="edi_age")
   private int ediAge;
   
   
}
