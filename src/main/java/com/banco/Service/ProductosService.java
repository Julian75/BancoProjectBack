package com.banco.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Productos;
import com.banco.Repository.ProductosRepository;

@Service
public class ProductosService {

	@Autowired
	private ProductosRepository repository;
	
	public List<Productos> all() {		
		return this.repository.findAll();
	}

	public Optional<Productos> findById(Long id) {
		return this.repository.findById(id);
	}

	public Productos save(Productos productos) {
		return this.repository.save(productos);
	}

	public void delete(Long id) {
		this.repository.deleteById(id);		
	}
}
