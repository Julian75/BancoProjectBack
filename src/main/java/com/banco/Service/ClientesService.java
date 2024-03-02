package com.banco.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Clientes;
import com.banco.Repository.ClientesRepository;

@Service
public class ClientesService {
	
	@Autowired
	private ClientesRepository repository;
	
	public List<Clientes> all() {		
		return this.repository.findAll();
	}

	public Optional<Clientes> findById(Long id) {
		return this.repository.findById(id);
	}

	public Clientes save(Clientes clientes) {
		return this.repository.save(clientes);
	}

	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}
