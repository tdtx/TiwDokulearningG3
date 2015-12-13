package es.uc3m.tiw.model.dominios;
 
 import java.io.Serializable;
 
 import javax.persistence.Entity;
 import javax.persistence.Id;
 import javax.persistence.GeneratedValue;
 
 import static javax.persistence.GenerationType.AUTO;
 
import javax.persistence.OneToOne;
 @Entity
 public class Mensaje implements Serializable{
 
 	@Id
 	@GeneratedValue(strategy = AUTO)
 	private Long id;
 	private String mensaje;
	@OneToOne
	private Usuario from;
	@OneToOne
	private Usuario to;
	
	
	
 	public Mensaje() {
 		// TODO Auto-generated constructor stub
 	}
 	public Mensaje(String mensaje) {
 		this.mensaje = mensaje;
 	}

	public Mensaje(String mensaje, Usuario from, Usuario to) {
		super();
		
		this.mensaje = mensaje;
		this.from = from;
		this.to = to;
	}
 	public String getMensaje() {
 		return mensaje;
 	}
 	public void setMensaje(String mensaje) {
 		this.mensaje = mensaje;
 	}
 	public Long getId() {
 		return id;
 	}
 	public void setId(Long id) {
 		this.id = id;
 	}
	public Usuario getTo() {
		return to;
	}
	public void setTo(Usuario to) {
		this.to = to;
	}
	public Usuario getFrom() {
		return from;
	}
	public void setFrom(Usuario from) {
		this.from = from;
	}
 	
 }
