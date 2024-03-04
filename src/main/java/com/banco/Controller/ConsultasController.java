package com.banco.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.EntityDTO.ContadoresDTO;
import com.banco.Service.ConsultasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "api/Consultas")
public class ConsultasController {

	@Autowired ConsultasService consultasService;
	
	@GetMapping("/ObtenerRelacionCuenta")
	public ResponseEntity<List<ContadoresDTO>> getRelacionCuenta(Long idCliente) {
	    try {
	      List<ContadoresDTO> datos = new ArrayList<ContadoresDTO>();
	      consultasService.findByRelacionCuenta(idCliente).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerRelacionCuentaId")
	public ResponseEntity<List<ContadoresDTO>> getRelacionCuentaId(Long idCliente) {
	    try {
	      List<ContadoresDTO> datos = new ArrayList<ContadoresDTO>();
	      consultasService.findByRelacionCuentaId(idCliente).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
	
	@GetMapping("/ObtenerExistenciaCuenta")
	public ResponseEntity<List<ContadoresDTO>> getExistenciaCuenta(Long numeroCuenta) {
	    try {
	      List<ContadoresDTO> datos = new ArrayList<ContadoresDTO>();
	      consultasService.findByExistenciaCuenta(numeroCuenta).forEach(datos::add);
	      if (datos.isEmpty()) {
	        return new ResponseEntity<>(datos, HttpStatus.OK);
	      }
	      return new ResponseEntity<>(datos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 }
}
