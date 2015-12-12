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
	private Usuarios from;
	@OneToOne
	private Usuarios to;
	
	
	
 	public Mensaje() {
 		// TODO Auto-generated constructor stub
 	}
 	public Mensaje(String mensaje2) {
 		this.mensaje = mensaje;
 	}

	public Mensaje(String mensaje, Usuarios from, Usuarios to) {
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
	public Usuarios getTo() {
		return to;
	}
	public void setTo(Usuarios to) {
		this.to = to;
	}
	public Usuarios getFrom() {
		return from;
	}
	public void setFrom(Usuarios from) {
		this.from = from;
	}
 	
 }
