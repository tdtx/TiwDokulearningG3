package es.uc3m.tiw.model.dominios;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class direccion implements Serializable {		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	String calle;
	String localidad;
	int codigoPostal;
	String provincia;
	String Pais;
	
	
	
	public direccion() {
		super();
	}
	
	public direccion(Long id, String calle, String localidad, int codigoPostal,
			String provincia, String pais) {
		super();
		this.id = id;
		this.calle = calle;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		Pais = pais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
