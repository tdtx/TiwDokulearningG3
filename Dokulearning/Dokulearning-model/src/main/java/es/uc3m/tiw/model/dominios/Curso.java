package es.uc3m.tiw.model.dominios;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.CascadeType.ALL;



@Entity
public class Curso implements Serializable {		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	String titulo;
	String descripcion;
	String horas;
	String temario;
	String usuario;
	String nivel;
	String certificado;
	String categoria;
	String destacado;
	String validacion;
	double precio;
	String tipoOferta;
	String idImagen;
	String fechaCaducidad;
	int descuentoCupon;
	String fechaInicio;
	int contador;
	
	
	
	/*
	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private  List <Pruebas> pruebas;
	 
	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private List<Leccion> leccion;
	 
	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private List <Matriculados> matriculados; 
	 
	 @ManyToOne(fetch = LAZY, cascade = ALL)
	    private Imagenes imagenes;
	 
	 */
	 
	
	public Curso() {
		super();
	}



	public Curso(String titulo, String descripcion, String horas,
			String temario, String usuario, String nivel, String certificado,
			String categoria, String destacado, String validacion,
			double precio, String tipoOferta, String idImagen,
			String fechaCaducidad, int descuentoCupon, String fechaInicio, int contador) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.horas = horas;
		this.temario = temario;
		this.usuario = usuario;
		this.nivel = nivel;
		this.certificado = certificado;
		this.categoria = categoria;
		this.destacado = destacado;
		this.validacion = validacion;
		this.precio = precio;
		this.tipoOferta = tipoOferta;
		this.idImagen = idImagen;
		this.fechaCaducidad = fechaCaducidad;
		this.descuentoCupon = descuentoCupon;
		this.fechaInicio = fechaInicio;
		this.contador = contador;
	}



	public int getContador() {
		return contador;
	}



	public void setContador(int contador) {
		this.contador = contador;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getHoras() {
		return horas;
	}



	public void setHoras(String horas) {
		this.horas = horas;
	}



	public String getTemario() {
		return temario;
	}



	public void setTemario(String temario) {
		this.temario = temario;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getNivel() {
		return nivel;
	}



	public void setNivel(String nivel) {
		this.nivel = nivel;
	}



	public String getCertificado() {
		return certificado;
	}



	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getDestacado() {
		return destacado;
	}



	public void setDestacado(String destacado) {
		this.destacado = destacado;
	}



	public String getValidacion() {
		return validacion;
	}



	public void setValidacion(String validacion) {
		this.validacion = validacion;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getTipoOferta() {
		return tipoOferta;
	}



	public void setTipoOferta(String tipoOferta) {
		this.tipoOferta = tipoOferta;
	}



	public String getIdImagen() {
		return idImagen;
	}



	public void setIdImagen(String idImagen) {
		this.idImagen = idImagen;
	}



	public String getFechaCaducidad() {
		return fechaCaducidad;
	}



	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}



	public int getDescuentoCupon() {
		return descuentoCupon;
	}



	public void setDescuentoCupon(int descuentoCupon) {
		this.descuentoCupon = descuentoCupon;
	}



	public String getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
