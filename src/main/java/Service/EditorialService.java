
package Service;

import entity.EDITORIAL;
import java.util.List;


public interface EditorialService {
            public List<EDITORIAL> findAll();

    public EDITORIAL findById(Long id);

    public EDITORIAL save(EDITORIAL editorial);

    public void delete(EDITORIAL editorial);

    public void deleteById(Long id);
    
}
