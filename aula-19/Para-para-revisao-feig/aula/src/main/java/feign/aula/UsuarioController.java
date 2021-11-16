package feign.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

	
	@Autowired
	private Repo repository;
	
    @GetMapping
    public ResponseEntity<List<Usuario>> getAll() {
    	return ResponseEntity.ok(repository.findAll());

    }
    
//    @GetMapping
//    public ResponseEntity<Integer> getIdade(@PathVariable("id") Long id){
//    	Usuario usuario = new Usuario();
//    	int idadeUsuario = usuario.getIdade();
//    	
//    	return ResponseEntity.ok(idadeUsuario);
//    }

}
