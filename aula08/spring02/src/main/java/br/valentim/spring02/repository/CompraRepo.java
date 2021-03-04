package br.valentim.spring02.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.valentim.spring02.model.Compra;

public interface CompraRepo extends CrudRepository<Compra, Integer>{
    Compra findByid(int id);
    public List<Compra> findByvalorGreaterThan(double valor);

    
}
