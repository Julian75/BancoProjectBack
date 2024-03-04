package com.banco.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.banco.EntityDTO.ContadoresDTO;

@Repository
public class ConsultasService {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	//Consulta para saber si el cliente tiene algun producto con contador
	public List<ContadoresDTO> findByRelacionCuenta(Long idCliente) {
		List<ContadoresDTO> lista = new ArrayList<ContadoresDTO>();
		try {
			String consultaId = "SELECT COUNT(id) AS contadorCliente, id AS idProducto FROM productos WHERE id_cliente = "+idCliente;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(ContadoresDTO.class));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	//Consulta para saber si el cliente tiene algun producto
	public List<ContadoresDTO> findByRelacionCuentaId(Long idCliente) {
		List<ContadoresDTO> lista = new ArrayList<ContadoresDTO>();
		try {
			String consultaId = "SELECT id AS idProducto FROM productos WHERE id_cliente = "+idCliente;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(ContadoresDTO.class));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	//Consulta para saber si el numero de cuenta ya existe
	public List<ContadoresDTO> findByExistenciaCuenta(Long numeroCuenta) {
		List<ContadoresDTO> lista = new ArrayList<ContadoresDTO>();
		try {
			String consultaId = "SELECT COUNT(id) AS contadorProducto FROM productos WHERE numero_cuenta = "+numeroCuenta;
			lista = jdbcTemplate.query(consultaId, BeanPropertyRowMapper.newInstance(ContadoresDTO.class));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}
