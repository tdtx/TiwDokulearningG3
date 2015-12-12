package es.uc3m.tiw.model.dominios;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Leccion implements Serializable {		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	String idCurso;
	String idSeccion;
	String descripcion;
	
	
	/* @ManyToOne(fetch = LAZY, cascade = ALL)
	    private  Curso curso;
	
	 @ManyToOne(fetch = LAZY, cascade = ALL)
	    private  Seccion seccion;*/
	
	public Leccion() {
		super();
	}
	public Leccion(String idCurso, String idSeccion, String descripcion) {
		super();
		this.idCurso = idCurso;
		this.idSeccion = idSeccion;
		this.descripcion = descripcion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}
	public String getIdSeccion() {
		return idSeccion;
	}
	public void setIdSeccion(String idSeccion) {
		this.idSeccion = idSeccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
