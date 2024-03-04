package com.banco.EntityDTO;

public class ContadoresDTO {

	Long idProducto;
	int contadorCliente;
	int contadorProducto;
	
	public ContadoresDTO() {
		super();
	}

	public ContadoresDTO(Long idProducto, int contadorCliente, int contadorProducto) {
		super();
		this.idProducto = idProducto;
		this.contadorCliente = contadorCliente;
		this.contadorProducto = contadorProducto;
	}

	public int getContadorCliente() {
		return contadorCliente;
	}

	public void setContadorCliente(int contadorCliente) {
		this.contadorCliente = contadorCliente;
	}

	public int getContadorProducto() {
		return contadorProducto;
	}

	public void setContadorProducto(int contadorProducto) {
		this.contadorProducto = contadorProducto;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

}
