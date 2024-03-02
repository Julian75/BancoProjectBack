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

import com.banco.Entity.Productos;
import com.banco.Service.ProductosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Productos")
public class ProductosController {

	@Autowired ProductosService service;

	@GetMapping("/Obtener")
	public List<Productos> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<Productos> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Productos save(@RequestBody Productos Productos) {
		return service.save(Productos);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Productos update(@PathVariable Long id, @RequestBody Productos Productos) {	
		Optional<Productos> op = service.findById(id);
		
		Productos ProductosAppUpdate = new Productos();
		if (!op.isEmpty()) {			
			ProductosAppUpdate = op.get();					
			ProductosAppUpdate = Productos;			
			ProductosAppUpdate.setId(id);
		}
		return service.save(ProductosAppUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
