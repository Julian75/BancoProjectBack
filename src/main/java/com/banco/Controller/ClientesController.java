package com.banco.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Clientes;
import com.banco.Service.ClientesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Clientes")
public class ClientesController {

	@Autowired ClientesService service;

	@GetMapping("/Obtener")
	public List<Clientes> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<Clientes> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Clientes save(@RequestBody Clientes Clientes) {
		return service.save(Clientes);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Clientes update(@PathVariable Long id, @RequestBody Clientes Clientes) {	
		Optional<Clientes> op = service.findById(id);
		
		Clientes ClientesAppUpdate = new Clientes();
		if (!op.isEmpty()) {			
			ClientesAppUpdate = op.get();					
			ClientesAppUpdate = Clientes;			
			ClientesAppUpdate.setId(id);
		}
		return service.save(ClientesAppUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
