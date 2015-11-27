package es.uc3m.tiw.model.dominios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Id;

@Entity
public class Usuarios implements Serializable {		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	
	//registrado
	String nick;
	String clave;
	String nombre;
	String apellido1;
	@Column(unique = false, nullable = true)
	String apellido2;
	String fechanac;
	@Column(unique = true, nullable = false)
	String correo;
	
	//matriculado
	@Column(unique = false, nullable = true)
	String cuentaBancaria;
	@Column(unique = false, nullable = true)
	String idImagen;
	@Column(unique = false, nullable = true)
	String descripcion;
	@Column(unique = false, nullable = true)
	String aficiones;
	@Column(unique = false, nullable = true)
	String calle;
	@Column(unique = false, nullable = true)
	String localidad;
	@Column(unique = false, nullable = true)
	int codigoPostal;
	@Column(unique = false, nullable = true)
	String provincia;
	@Column(unique = false, nullable = true)
	String Pais;
	@Column(unique = false, nullable = true)
	int telefono;
	@Column(unique = false, nullable = true)

	//es un estado
	String rol;

	
	/*
	@OneToMany(fetch = LAZY, cascade = ALL)
    private  Matriculados matriculados;
	
	*/
	
	
	
	
	
	
	public Usuarios() {
		super();
	}
//para el registro	
	public Usuarios(String nick, String clave, String nombre, String apellido1,
			String apellido2, String correo, String fechanac) {
		super();
		this.nick = nick;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.correo = correo;
		this.fechanac = fechanac;
	}
//para login	
	public Usuarios(String clave, String correo) {
		super();
		this.clave = clave;
		this.correo = correo;
	}
//para perfil
	public Usuarios(String rol, String nick, String clave, String nombre,
			String apellido1, String apellido2, int telefono, String correo,
			String cuentaBancaria, String idImagen, String fechanac,
			String descripcion, String aficiones, String calle, String localidad,
			int codigoPostal, String provincia, String pais) {
		super();
		this.rol = rol;
		this.nick = nick;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.correo = correo;
		this.cuentaBancaria = cuentaBancaria;
		this.idImagen = idImagen;
		this.fechanac = fechanac;
		this.descripcion = descripcion;
		this.aficiones = aficiones;
		this.calle = calle;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.Pais = pais;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public String getIdImagen() {
		return idImagen;
	}
	public void setIdImagen(String idImagen) {
		this.idImagen = idImagen;
	}
	public String getFechanac() {
		return fechanac;
	}
	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAficiones() {
		return aficiones;
	}
	public void setAficiones(String aficiones) {
		this.aficiones = aficiones;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}