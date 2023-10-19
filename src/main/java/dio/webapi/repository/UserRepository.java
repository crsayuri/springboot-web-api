package dio.webapi.repository;

import dio.webapi.handler.BusinessException;
import dio.webapi.handler.MandatoryFieldsException;
import dio.webapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        /*
        if(usuario.getLogin()==null)
            throw new BusinessException("O campo login é obrigatório");
        if(usuario.getPassword()==null)
            throw new BusinessException("O campo senha é obrigatório");
            No lugar de usar o bloco acima, cria-se uma classe que possa lidar com as repetições de codigo
            */
        if(usuario.getLogin()==null)
            throw new MandatoryFieldsException("login");
        if(usuario.getPassword()==null)
            throw new BusinessException("password");


        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void removeById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("GET/id - Recebendo o username: %d para localizar um usuário", username));
        return new Usuario("gleyson","password");
    }
}
