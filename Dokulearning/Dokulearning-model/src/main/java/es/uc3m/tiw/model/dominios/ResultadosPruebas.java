package es.uc3m.tiw.model.dominios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
public class ResultadosPruebas implements Serializable{
	
private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	String id_prueba;
	@Column(unique = true, nullable = false)
	String id_matricula;
	double nota;
	@Column(unique = false, nullable = true)
	String comentario;
	
	
	
	 @ManyToOne(fetch = LAZY, cascade = ALL)
	    private Matriculados matriculado;
	 
	@ManyToOne(fetch = LAZY, cascade = ALL)
	    private Pruebas prueba;
	 
	 
	
	public ResultadosPruebas() {
		super();
	}
	
	
	public ResultadosPruebas(String id_prueba, String id_matricula,
			double nota, String comentario) {
		super();
		this.id_prueba = id_prueba;
		this.id_matricula = id_matricula;
		this.nota = nota;
		this.comentario = comentario;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getId_prueba() {
		return id_prueba;
	}
	public void setId_prueba(String id_prueba) {
		this.id_prueba = id_prueba;
	}
	public String getId_matricula() {
		return id_matricula;
	}
	public void setId_matricula(String id_matricula) {
		this.id_matricula = id_matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
