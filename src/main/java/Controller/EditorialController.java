
package Controller;

import Service.EditorialService;
import entity.EDITORIAL;
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
@RequestMapping("/editorial")
@Api(value= "Editoriales",description = "Indice de las editoriales")
public class EditorialController {
        @Autowired
    private EditorialService EditorialService;

    @GetMapping("/all")
    @ApiOperation(value="Editoriales")
    public List<EDITORIAL> findAll() {
        return EditorialService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EDITORIAL> findById(@PathVariable Long id) {
        EDITORIAL editorial = EditorialService.findById(id);
        return ResponseEntity.ok(editorial);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        EditorialService.deleteById(id);
    }

    @PostMapping("/save")
    public EDITORIAL save(@RequestBody EDITORIAL editorial) {
        return EditorialService.save(editorial);
    }

    @PutMapping("/update")
    public EDITORIAL update(@RequestBody EDITORIAL editorial) {
        return EditorialService.save(editorial);
    }
}
