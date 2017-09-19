package com.ipartek.formacion.javalibro.pojo;

public class Persona {

	// Atributos no accesibles desde fuera de la clase
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String email;
	private String dni;
	private int edad;
	private String rol;
	
	//Constructores
	public Persona(String nombre, String apellido1, String apellido2,int edad, String email, String dni, String rol) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
		this.dni = dni;
		this.edad = edad;
		this.rol = rol;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	//To String
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email="
				+ email + ", dni=" + dni + ", edad=" + edad + ", rol=" + rol + "]";
	}
	
}
