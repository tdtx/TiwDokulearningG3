package es.uc3m.tiw.model.dominios;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CreadorCurso implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	String titulo;
	@Column(unique = true, nullable = false)
	String nickUsuario;
	double precio;
	
//faltan las relaciones, seran igual que matriculados
	
	public CreadorCurso(String titulo, String nickUsuario, double precio) {
		super();
		this.titulo = titulo;
		this.nickUsuario = nickUsuario;
		this.precio = precio;
	}
	
	public CreadorCurso(){
		super();
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

	public String getNickUsuario() {
		return nickUsuario;
	}

	public void setNickUsuario(String nickUsuario) {
		this.nickUsuario = nickUsuario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	
	
	
	
}