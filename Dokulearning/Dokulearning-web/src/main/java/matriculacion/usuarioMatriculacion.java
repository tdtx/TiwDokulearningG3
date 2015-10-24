package matriculacion;

import dominio.validaciones;
import registro.usuarioRegistro;

public class usuarioMatriculacion extends usuarioRegistro {

	
	
	private String telefono;
	private String genero;
	private String formaPago;
	private String calle;
	private String localidad;
	private String codigoPostal;
	private String provincia;
	
	//foto
	private String fechaNacimiento;
	private String DNI;
	private boolean aceptar;
	private static int ident = 3;
	private int id;
	

	public usuarioMatriculacion( String telefono,
			String calle, String localidad, String codigoPostal,
			String provincia, String fechaNacimiento, String dNI,
			boolean aceptar, String genero, String formaPago) {
		super();
		this.telefono = telefono;
		this.calle = calle;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.fechaNacimiento = fechaNacimiento;
		DNI = dNI;
		this.aceptar = aceptar;
		this.genero=genero;
		this.formaPago=formaPago;
		this.id=getIdentificadorSiguiente();
	}



	public static int getIdentificadorSiguiente(){
    	return(ident++);
    }
	
	

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

		// TODO Auto-generated method stub
		
	

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public boolean isAceptar() {
		return aceptar;
	}

	public void setAceptar(boolean aceptar) {
		this.aceptar = aceptar;
	}

	
	public usuarioMatriculacion() {
		// TODO Auto-generated constructor stub
	}



	public String ValidarMatriculacion()
	{
		String mensaje = "";
		
		validaciones val = new validaciones();

		if (!val.formatoClave(telefono,9,9))
			mensaje += "<li>El telefono es obligatorio y debe tener nueve digitos.</li>";
		
		if (!val.oblogatorioMaxLength(calle, 80))
			mensaje += "<li>La calle es obligatoria y tiene un maximo de 20 digitos.</li>";
		
		if (!val.oblogatorioMaxLength(localidad, 20))
			mensaje += "<li>La localidad es obligatoria y tiene un maximo de 20 digitos.</li>";
		
		if (!val.oblogatorioMaxLength(codigoPostal, 10))
			mensaje += "<li>El codigoPostal es obligatorio y tiene un maximo de 10 digitos.</li>";
		
		if (!val.oblogatorioMaxLength(provincia, 20))
			mensaje += "<li>La provincia es obligatoria y tiene un maximo de 20 digitos.</li>";

		if (!val.formatoClave(DNI, 10,9))
			mensaje += "<li>El DNI es obligatorio y tiene un maximo de 10 digitos y un minimo de 9.</li>";
		
		if (!this.aceptar)
			mensaje += "<li>Debe aceptar los terminos y condiciones.</li>";
		
		
		return mensaje;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getFormaPago() {
		return formaPago;
	}



	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	
}
