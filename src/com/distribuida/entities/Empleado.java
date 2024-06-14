package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "empleado")
public class Empleado {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_empleado")
	private int id_empleado;
	 @Column(name = "apellido1")
	private String apellido1;
	 @Column(name = "apellido2")
	private String apellido2;
	 @Column(name = "dni")
	private int dni;
	 @Column(name = "fechaNac")
	private Date fechaNac;
	 @Column(name = "direccion")
	private String direccion;
	 @Column(name = "sexo")
	private String sexo;
	 @Column(name = "sueldo")
	private int sueldo;
	 @Column(name = "superdni")
	private int superDni;
	 @Column(name = "dno")
	private int dno;

	public Empleado() {}

	public Empleado(int id_empleado, String apellido1, String apellido2, int dni, Date fechaNac, String direccion,
			String sexo, int sueldo, int superDni, int dno) {
		super();
		this.id_empleado = id_empleado;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
		this.sexo = sexo;
		this.sueldo = sueldo;
		this.superDni = superDni;
		this.dno = dno;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getSuperDni() {
		return superDni;
	}

	public void setSuperDni(int superDni) {
		this.superDni = superDni;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Empleado [id_empleado=" + id_empleado + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", dni=" + dni + ", fechaNac=" + fechaNac + ", direccion=" + direccion + ", sexo=" + sexo
				+ ", sueldo=" + sueldo + ", superDni=" + superDni + ", dno=" + dno + "]";
	}


}


