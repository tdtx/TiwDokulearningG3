package es.uc3m.tiw.model.dominios;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
public class Matriculados implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	String id_curso;
	@Column(unique = true, nullable = false)
	String id_usuario;
	@Column(unique = true, nullable = false)
	String cupon;
	double precio_final;
	double nota;
	
	 @ManyToOne(fetch = LAZY, cascade = ALL)
	 	private Usuarios usuarios;
	
	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private  List <ResultadosPruebas> resultadosPruebas;
	 
	 @ManyToOne(fetch = LAZY, cascade = ALL)
	 	private Curso curso;
	
	
	
	
	
	public Matriculados() {
		super();
	}
	
	
	public Matriculados(Curso curso, Usuarios usuario,
			String cupon, double precio_final, double nota) {
		super();
		this.curso = curso;
		this.usuarios = usuario;
		this.cupon = cupon;
		this.precio_final = precio_final;
		this.nota = nota;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	
	public Usuarios getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}


	public String getCupon() {
		return cupon;
	}
	public void setCupon(String cupon) {
		this.cupon = cupon;
	}
	public double getPrecio_final() {
		return precio_final;
	}
	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
