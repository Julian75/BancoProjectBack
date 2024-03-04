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

import com.banco.Entity.Transacciones;
import com.banco.Service.TransaccionesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Transacciones")
public class TransaccionesController {

	@Autowired TransaccionesService service;

	@GetMapping("/Obtener")
	public List<Transacciones> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<Transacciones> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Transacciones save(@RequestBody Transacciones Transacciones) {
		return service.save(Transacciones);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Transacciones update(@PathVariable Long id, @RequestBody Transacciones Transacciones) {	
		Optional<Transacciones> op = service.findById(id);
		
		Transacciones TransaccionesAppUpdate = new Transacciones();
		if (!op.isEmpty()) {			
			TransaccionesAppUpdate = op.get();					
			TransaccionesAppUpdate = Transacciones;			
			TransaccionesAppUpdate.setId(id);
		}
		return service.save(TransaccionesAppUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
