package com.banco.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id; 

		@Column(name = "tipo_identificacion", nullable = false, length = 10)
		private String tipoIdentificacion;

		@Column(name = "numero_identificacion", nullable = false, length = 15)
		private int numeroIdentificacion;

		@Column(name = "nombres", nullable = false, length = 100)
		private String nombres;

		@Column(name = "apellidos", nullable = false, length = 100)
		private String apellidos;

		@Column(name = "correo", nullable = false, length = 100)
		private String correo;

		@Column(name = "fecha_nacimiento", nullable = false)
		private Date fechaNacimiento;

		@Column(name = "fecha_creacion", nullable = false)
		private Timestamp fechaCreacion;

		@Column(name = "fecha_modificacion", nullable = false)
		private Timestamp fechaModificacion;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTipoIdentificacion() {
			return tipoIdentificacion;
		}

		public void setTipoIdentificacion(String tipoIdentificacion) {
			this.tipoIdentificacion = tipoIdentificacion;
		}

		public int getNumeroIdentificacion() {
			return numeroIdentificacion;
		}

		public void setNumeroIdentificacion(int numeroIdentificacion) {
			this.numeroIdentificacion = numeroIdentificacion;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
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

}
