/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImplements;

import Repository.EDITORIALREPOSITORY;
import Service.EditorialService;
import entity.EDITORIAL;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
        
public class ServiceImpEdi implements EditorialService{
 @Autowired
    private EDITORIALREPOSITORY editorialrepository;
    @Transactional

    @Override
    public List<EDITORIAL> findAll() {
        return (List<EDITORIAL>) editorialrepository.findAll();
    }

    @Override
    public EDITORIAL findById(Long id) {
         return editorialrepository.findById(id).orElse(null);
    }

    @Override
    public EDITORIAL save(EDITORIAL editorial) {
       return editorialrepository.save(editorial);
    }

    @Override
    public void delete(EDITORIAL editorial) {
         editorialrepository.delete(editorial);
    }

    @Override
    public void deleteById(Long id) {
        editorialrepository.deleteById(id);
    }

    
}
