package Controller;

import Service.LIBROSERVICE;
import entity.LIBRO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
@Api(value= "Libros",description = "Indice de los libros")
public class LIBROCONTROLLER {
    @Autowired
    private LIBROSERVICE libroservice;

    @GetMapping("/all")
    @ApiOperation(value="Lista de Libros")
    public List<LIBRO> findAll() {
        return libroservice.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LIBRO> findById(@PathVariable Long id) {
        LIBRO libro = libroservice.findById(id);
        return ResponseEntity.ok(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        libroservice.deleteById(id);
    }

    @PostMapping("/save")
    public LIBRO save(@RequestBody LIBRO libro) {
        return libroservice.save(libro);
    }

    @PutMapping("/update")
    public LIBRO update(@RequestBody LIBRO libro) {
        return libroservice.save(libro);
    }
}
