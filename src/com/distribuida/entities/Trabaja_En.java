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
@Table(name = "trabaja_en")
public class Trabaja_En {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_trabajaEn")
	private int id_trabajaEn;
	 @Column(name = "numProv")
	private int numProv;
	 @Column(name = "horas")
	private int horas;
	
	public Trabaja_En() {
		
}

	public Trabaja_En(int id_trabajaEn, int numProv, int horas) {
		super();
		this.id_trabajaEn = id_trabajaEn;
		this.numProv = numProv;
		this.horas = horas;
	}

	public int getId_trabajaEn() {
		return id_trabajaEn;
	}

	public void setId_trabajaEn(int id_trabajaEn) {
		this.id_trabajaEn = id_trabajaEn;
	}

	public int getNumProv() {
		return numProv;
	}

	public void setNumProv(int numProv) {
		this.numProv = numProv;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Trabaja_En [id_trabajaEn=" + id_trabajaEn + ", numProv=" + numProv + ", horas=" + horas + "]";
	}
	
	}
