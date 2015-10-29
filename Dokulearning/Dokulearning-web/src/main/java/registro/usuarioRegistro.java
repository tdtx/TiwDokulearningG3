package registro;

import matriculacion.usuarioMatriculacion;
import dominio.validaciones;

public class usuarioRegistro {
	


	String nick ;
	String nombre;
	String apellido1 ;
	String apellido2 ;
	String clave1;
	String clave2 ;
	String correo ;
	boolean terminos ;
	boolean mayoredad;
	usuarioMatriculacion matriculacion;
	
	
	//constructor para iniciar sesion
	public usuarioRegistro(String clave1, String correo) {
		super();
		this.clave1 = clave1;
		this.correo = correo;
	}
	
	//constructor vacio
	public usuarioRegistro() {
		super();
	}
	
	//Constructor con todo menos apellido 2
	public usuarioRegistro(String nick, String nombre, String apellido1,
			String clave1, String clave2, String correo, boolean terminos,
			boolean mayoredad) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.clave1 = clave1;
		this.clave2 = clave2;
		this.correo = correo;
		this.terminos = terminos;
		this.mayoredad = mayoredad;
	}
	
	
	//constructor con todo
	public usuarioRegistro(String nick, String nombre, String apellido1,
			String apellido2, String clave1, String clave2, String correo,
			boolean terminos, boolean mayoredad) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.clave1 = clave1;
		this.clave2 = clave2;
		this.correo = correo;
		this.terminos = terminos;
		this.mayoredad = mayoredad;
	}
	
	//constructor con todo menos checkbox ni apellido2
	public usuarioRegistro(String nick, String nombre, String apellido1,
			String clave1, String clave2, String correo) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.clave1 = clave1;
		this.clave2 = clave2;
		this.correo = correo;
	}
	
	//constructor con todo menos checkbox
	public usuarioRegistro(String nick, String nombre, String apellido1,
			String apellido2, String clave1, String clave2, String correo) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.clave1 = clave1;
		this.clave2 = clave2;
		this.correo = correo;
	}
	
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
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
	public String getClave1() {
		return clave1;
	}
	public void setClave1(String clave1) {
		this.clave1 = clave1;
	}
	public String getClave2() {
		return clave2;
	}
	public void setClave2(String clave2) {
		this.clave2 = clave2;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public boolean getTerminos() {
		return terminos;
	}
	
	public void setTerminos(boolean terminos) {
		this.terminos = terminos;
	}
	public boolean getMayoredad() {
		return mayoredad;
	}
	public void setMayoredad(boolean mayoredad) {
		this.mayoredad = mayoredad;
	}
	
	
	public usuarioMatriculacion getMatriculacion() {
		return matriculacion;
	}

	public void setMatriculacion(usuarioMatriculacion matriculacion) {
		this.matriculacion = matriculacion;
	}

	public String Validar()
	{
		String mensaje = "";
		
		validaciones val = new validaciones();

		if (!val.oblogatorioMaxLength(nick, 8))
			mensaje += "<li>El nick es obligatorio y no debe ser  mayor de 8 caracteres.</li>";
		if (!val.oblogatorioMaxLength(nombre, 20))
			mensaje += "<li>El nombre es obligatorio y no debe ser  mayor de 20 caracteres.</li>";
		if (!val.oblogatorioMaxLength(apellido1, 20))
			mensaje += "<li>El primer apellido es obligatorio y no debe ser  mayor de 20 caracteres.</li>";
		if (!val.maxLength(apellido2, 20))
			mensaje += "<li>El segundo apellido no debe ser  mayor de 20 caracteres.</li>";
		/*if (!val.correo(correo, 20))
			mensaje += "<li>El correo es obligatorio y el formato valido, debe ser: aaa@bb.ccc y no debe ser mayor de 20 caracteres.</li>"*/;
		if (!val.formatoClave(clave1, 20,8))
			mensaje += "<li> La clave tiene que tener minimo 8 caracteres y maximo 20</li>";
		if (!val.stringIguales(clave1, clave2))
			mensaje += "<li>Las claves no coinciden</li>";
		if (!this.terminos)
			mensaje += "<li>Debe aceptar los terminos y condiciones.</li>";
		if (!this.mayoredad)
			mensaje += "<li>Debe ser mayor de edad.</li>";
		
		return mensaje;
	}
}
