package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "localizaciones_dpto")

public class Localizaciones_Dpto {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id:localizacionesDpto")
	private int id_localizacionesDpto;
	 @Column(name = "numeroDpto")
	private int numeroDpto;
	 @Column(name = "id:ubicacioneDpto")
	private String ubicacionDpto;
	
	public Localizaciones_Dpto() {}

	public Localizaciones_Dpto(int id_localizacionesDpto, int numeroDpto, String ubicacionDpto) {
		super();
		this.id_localizacionesDpto = id_localizacionesDpto;
		this.numeroDpto = numeroDpto;
		this.ubicacionDpto = ubicacionDpto;
	}

	public int getId_localizacionesDpto() {
		return id_localizacionesDpto;
	}

	public void setId_localizacionesDpto(int id_localizacionesDpto) {
		this.id_localizacionesDpto = id_localizacionesDpto;
	}

	public int getNumeroDpto() {
		return numeroDpto;
	}

	public void setNumeroDpto(int numeroDpto) {
		this.numeroDpto = numeroDpto;
	}

	public String getUbicacionDpto() {
		return ubicacionDpto;
	}

	public void setUbicacionDpto(String ubicacionDpto) {
		this.ubicacionDpto = ubicacionDpto;
	}

	@Override
	public String toString() {
		return "Localizaciones_Dpto [id_localizacionesDpto=" + id_localizacionesDpto + ", numeroDpto=" + numeroDpto
				+ ", ubicacionDpto=" + ubicacionDpto + "]";
	}
	
}
