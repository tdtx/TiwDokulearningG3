package es.uc3m.tiw.web;

public class FormularioCurso {

	
	String nom;
	String rama;
	int id;
	int horas;
	String descripcion;
	String temario;
	String profesor;
	String certificado;
	String secciones;
	String lecciones;
	String material;
	String notificaciones;
	String calificaciones;
	String categoria;
	String destacado, tipo_oferta, imagen, dificultad, f_inicio, f_fin, asociado, cierre_curso;
	boolean validado, terminos;
	int precio ; 
	
	public FormularioCurso(String nom, String rama, int id, int horas,
			String descripcion, String temario, String profesor,
			String certificado, String secciones, String lecciones,
			String material, String notificaciones, String calificaciones,
			String categoria, String destacado, String tipo_oferta,
			String imagen, String dificultad, boolean terminos, String f_inicio,
			String f_fin, String asociado, String cierre_curso,
			boolean validado, int precio) {
		super();
		this.nom = nom;
		this.rama = rama;
		this.id = id;
		this.horas = horas;
		this.descripcion = descripcion;
		this.temario = temario;
		this.profesor = profesor;
		this.certificado = certificado;
		this.secciones = secciones;
		this.lecciones = lecciones;
		this.material = material;
		this.notificaciones = notificaciones;
		this.calificaciones = calificaciones;
		this.categoria = categoria;
		this.destacado = destacado;
		this.tipo_oferta = tipo_oferta;
		this.imagen = imagen;
		this.dificultad = dificultad;
		this.terminos = terminos;
		this.f_inicio = f_inicio;
		this.f_fin = f_fin;
		this.asociado = asociado;
		this.cierre_curso = cierre_curso;
		this.validado = validado;
		this.precio = precio;
	}

	public FormularioCurso(){
		super();
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRama() {
		return rama;
	}
	public void setRama(String rama) {
		this.rama = rama;
	}
	public int getId(int id){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTemario() {
		return temario;
	}

	public void setTemario(String temario) {
		this.temario = temario;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	public String getSecciones() {
		return secciones;
	}

	public void setSecciones(String secciones) {
		this.secciones = secciones;
	}

	public String getLecciones() {
		return lecciones;
	}

	public void setLecciones(String lecciones) {
		this.lecciones = lecciones;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(String notificaciones) {
		this.notificaciones = notificaciones;
	}

	public String getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(String calificaciones) {
		this.calificaciones = calificaciones;
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

	public String getTipo_oferta() {
		return tipo_oferta;
	}

	public void setTipo_oferta(String tipo_oferta) {
		this.tipo_oferta = tipo_oferta;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public boolean getTerminos() {
		return terminos;
	}

	public void setTerminos(boolean terminos) {
		this.terminos = terminos;
	}

	public String getF_inicio() {
		return f_inicio;
	}

	public void setF_inicio(String f_inicio) {
		this.f_inicio = f_inicio;
	}

	public String getF_fin() {
		return f_fin;
	}

	public void setF_fin(String f_fin) {
		this.f_fin = f_fin;
	}

	public String getAsociado() {
		return asociado;
	}

	public void setAsociado(String asociado) {
		this.asociado = asociado;
	}

	public String getCierre_curso() {
		return cierre_curso;
	}

	public void setCierre_curso(String cierre_curso) {
		this.cierre_curso = cierre_curso;
	}

	public boolean isValidado() {
		return validado;
	}

	public void setValidado(boolean validado) {
		this.validado = validado;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
}
