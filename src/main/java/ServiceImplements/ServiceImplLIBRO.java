package ServiceImplements;

import Repository.LIBROREPOSITORY;
import Service.LIBROSERVICE;
import entity.LIBRO;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
        
public class ServiceImplLIBRO implements LIBROSERVICE{
   @Autowired
   private LIBROREPOSITORY librorepository;
   @Transactional
   
    @Override
    public List<LIBRO> findAll() {
        return (List<LIBRO>) librorepository.findAll();
    }

    @Override
    public LIBRO findById(Long id) {
         return librorepository.findById(id).orElse(null);
    }

    @Override
    public LIBRO save(LIBRO libro) {
       return librorepository.save(libro);
    }

    @Override
    public void delete(LIBRO libro) {
         librorepository.delete(libro);
    }

    @Override
    public void deleteById(Long id) {
        librorepository.deleteById(id);
    }
}
