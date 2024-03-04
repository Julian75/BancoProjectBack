package com.banco.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Transacciones;
import com.banco.Repository.TransaccionesRepository;

@Service
public class TransaccionesService {

	@Autowired
	private TransaccionesRepository repository;
	
	public List<Transacciones> all() {		
		return this.repository.findAll();
	}

	public Optional<Transacciones> findById(Long id) {
		return this.repository.findById(id);
	}

	public Transacciones save(Transacciones Transacciones) {
		return this.repository.save(Transacciones);
	}

	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}
