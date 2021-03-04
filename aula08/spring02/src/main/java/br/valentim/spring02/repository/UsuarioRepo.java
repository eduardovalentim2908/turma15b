package br.valentim.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.valentim.spring02.model.Usuario;

//CRUD = Create, Read, Update and Delete (DB)
public interface UsuarioRepo extends CrudRepository<Usuario, Integer>{
    public Usuario findByEmailAndSenha(String email, String senha);
    
}
