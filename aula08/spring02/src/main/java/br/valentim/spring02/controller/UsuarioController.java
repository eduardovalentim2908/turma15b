package br.valentim.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.valentim.spring02.dto.UsuarioDTO;
import br.valentim.spring02.model.Usuario;
import br.valentim.spring02.repository.UsuarioRepo;



@RestController
@CrossOrigin("*") //Requisicoes de qualquer origem.
@RequestMapping("/user")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepo repo;

    @GetMapping("/id/{id}") // {id} Nome da variavel.
    public ResponseEntity<UsuarioDTO> obterUsuarioPorId(@PathVariable int id){
        Usuario usuarioEncontrado = repo.findById(id).orElse(null); // FindbyId busca pela chave primaria
        
        if(usuarioEncontrado != null){
            UsuarioDTO userDTO = new UsuarioDTO(usuarioEncontrado);
            return ResponseEntity.ok(userDTO); //Response OK 200
        }

        return ResponseEntity.notFound().build(); // Response Not Founf 404
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        List<Usuario> lista = (List<Usuario>) repo.findAll();

        return ResponseEntity.ok(lista);
    }

    @PostMapping("/loginemail")
    public ResponseEntity<Usuario> loginByEmail(@RequestBody Usuario user){
        Usuario userFound = repo.findByEmailAndSenha(user.getEmail(), user.getSenha());
            if(userFound != null){
                userFound.setSenha("***********");
                userFound.setId(00);
                return ResponseEntity.ok(userFound);
            }
            return ResponseEntity.status(404).build();
        
    }
}
