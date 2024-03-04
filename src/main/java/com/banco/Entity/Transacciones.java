package com.banco.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transacciones")
public class Transacciones implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	@Column(name = "tipo_transaccion", nullable = false, length = 25)
	private String tipoTransaccion;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_cuenta_principal", nullable = false)
	private Clientes idCuentaPrincipal;
	
	@Column(name = "saldo", nullable = false, length = 15)
	private double saldo;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_cuenta_secundaria", nullable = false)
	private Clientes idCuentaSecundario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	public Clientes getIdCuentaPrincipal() {
		return idCuentaPrincipal;
	}

	public void setIdCuentaPrincipal(Clientes idCuentaPrincipal) {
		this.idCuentaPrincipal = idCuentaPrincipal;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Clientes getIdCuentaSecundario() {
		return idCuentaSecundario;
	}

	public void setIdCuentaSecundario(Clientes idCuentaSecundario) {
		this.idCuentaSecundario = idCuentaSecundario;
	}
	
}
