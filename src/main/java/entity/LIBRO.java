
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
@Data

@Entity
@Table(name = "LIBRO")
public class LIBRO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Libro_Id")
    private Long LibroId;
    @Column(name="Libro_Name")
    private String LibroName;
    @Column(name="Libro_Autor")
    private String LibroAutor;
    @Column(name ="Libro_Año")
    private String LibroAño;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name ="Libro_Categoria")
    private String LibroCategoria;
     @JoinColumn (name="code")
    private EDITORIAL editorial;
}
