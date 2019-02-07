package br.com.teste.service;


import br.com.teste.model.Cliente;
import br.com.teste.repository.IClienteRepo;


public class ClienteService {
	
	public IClienteRepo repo;
	
	public Cliente save(Cliente cl) {
		return repo.save(cl);
	}

}
