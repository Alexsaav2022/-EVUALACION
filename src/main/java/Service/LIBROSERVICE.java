
package Service;


import entity.LIBRO;
import java.util.List;


public interface LIBROSERVICE {
                public List<LIBRO> findAll();

    public LIBRO findById(Long id);

    public LIBRO save(LIBRO libro);

    public void delete(LIBRO libro);

    public void deleteById(Long id);
}
