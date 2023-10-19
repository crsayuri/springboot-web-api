package dio.webapi.controller;

import dio.webapi.model.Usuario;
import dio.webapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") //para evitar ficar digitando isso toda vez que chamar o
                            // RequestMapping,  pode-se fazer uma vez só
public class UserController {
    @Autowired
    private UserRepository repository;
//    @GetMapping("/users")
    @GetMapping()
    public List<Usuario> getUsers() {
        return repository.listAll();
    }
//    @GetMapping("/users/{username}")
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
//    @DeleteMapping("/users/{id}")
    @GetMapping("/{id}")
    public void remove(@PathVariable("id") Integer id){
        repository.removeById(id);
    }
//    @PostMapping("/users")
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
