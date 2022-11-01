package com.musa.spring.boot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//name es el atributo para ijndicar el nombre de la tabla, en caso de que la tabla se llame igual, se puede omitir
//como buena practica en bd las tablas se escriben en minuscula y en plural

@Entity
@Table(name="clientes") 
public class Cliente implements Serializable { 
	/*
	 * 	la serializacion de un objeto consiste en generar un secuencia de bytes lista para su almacenamiento o transmision.
	 * despues mediante la deserializacion, el estado original del objeto se puede reconstruir
	 */
	
	//como buena practica se crea la interfaz serializable, ocn spring y formularios para poder guardar los 
	//atributos en la sesion
	
	//las clases entities (de jpa) permiten tener persistencia a una bd mapeada a una tabla
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String casa;
	private String dpto;

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	@Column(name="create_at") //permite crear con ese nombre el atributo en la bd
	@Temporal(TemporalType.DATE) //permite pasar del formato date de java a formato date de sql
	private Date createAt;

	public Long getId() {
		return id; 
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	private static final long serialVersionUID = 1L;
}
