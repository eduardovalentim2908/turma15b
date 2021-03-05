package br.valentim.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Classe mapeada no DB
@Table(name="usuario")


public class Usuario {
    
    @Id //chave primaria no DB
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Valor gerado automaticamente
    @Column(name = "id") // Nome da coluna no DB
    private int id;
    
    @Column(name="nome", length = 150, nullable = false)
    private String nome; 
    
    @Column(name="senha", length = 20, nullable = false)    
    private String senha; 
    
    @Column(name="cpf", length = 11, nullable = false, unique = true)
    private String cpf;
    
    @Column(name="email", length = 30, nullable = false)
    private String email;

    @OneToMany(mappedBy = "usuario")
    @JsonIgnoreProperties("usuario")
    private List<Compra> compra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }

    
}
