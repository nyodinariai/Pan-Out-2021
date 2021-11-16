package exemplointegracao.aula2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import exemplointegracao.aula2.model.Usuario;

@RestController
@RequestMapping
public class UsuarioController {

	@Autowired
	UsuarioAula1Feign usuarioAula1;
	
	@GetMapping("hello")
	public String testar(){
		return "Hello";
	}
	
	@GetMapping
	public ResponseEntity<ResponseEntity<List<Usuario>>> getTodos(){
		return ResponseEntity.ok(usuarioAula1.getAll());
	}
	
	@GetMapping("listar/body")
	public ResponseEntity<List<Usuario>> getTodosBody(){
		return ResponseEntity.ok(usuarioAula1.getAll().getBody());
	}
	
	@GetMapping("listar/{id}")
	public <Usuario> Usuario getIdade(@PathVariable("id") Long id){
		Usuario usuario = (Usuario) usuarioAula1.getById(id).getBody();
		return usuario;
		
	}
	
}
