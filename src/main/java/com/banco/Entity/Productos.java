package com.banco.Entity;

import java.io.Serializable;
import java.sql.Timestamp;

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
@Table(name = "productos")
public class Productos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	@Column(name = "tipo_cuenta", nullable = false, length = 25)
	private String tipoCuenta;
	
	@Column(name = "numero_cuenta", nullable = false, length = 10)
	private Long numeroCuenta;
	
	@Column(name = "estado", nullable = false, length = 10)
	private String estado;
	
	@Column(name = "saldo", nullable = false, length = 15)
	private double saldo;

	@Column(name = "fecha_creacion", nullable = false)
	private Timestamp fechaCreacion;

	@Column(name = "fecha_modificacion", nullable = false)
	private Timestamp fechaModificacion;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_cliente", nullable = false)
	private Clientes idCliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public Long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Timestamp getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Clientes getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Clientes idCliente) {
		this.idCliente = idCliente;
	}
	
}
