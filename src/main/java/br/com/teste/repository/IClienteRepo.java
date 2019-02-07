package br.com.teste.repository;

import br.com.teste.model.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface IClienteRepo extends CrudRepository<Cliente, Long>{

}
