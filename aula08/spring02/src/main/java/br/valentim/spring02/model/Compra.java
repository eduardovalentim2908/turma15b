package br.valentim.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Compra")

public class Compra {
   
    @Id //chave primaria no DB
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Valor gerado automaticamente
    @Column(name = "id") // Nome da coluna no DB
    private int id;
    
    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao; 
    
    @Column(name = "valor", nullable = false)    
    private double valor;
 
    
	public String getDescricao() {
        return descricao;
	}
    
	public void setDescricao(String descricao) {
        this.descricao = descricao;
	}
    
	public double getValor() {
        return valor;
	}
    
	public void setValor(double valor) {
        this.valor = valor;
	}
}