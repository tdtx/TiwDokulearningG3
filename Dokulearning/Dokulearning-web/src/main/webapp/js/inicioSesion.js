function validarInicioSesion() {
	var contador = 0;
//comprobamos que se introduce correo
	var correo = document.getElementById("correo").value;
	var correoS = correo.toString();
	if (!correoS.match(/\S+@\S+\.\S+/g)|| correoS == null || correoS == "") {
		document.getElementById("correo").style.borderColor = "red";
	} else {
		contador = contador + 1;
	}
	
	
//comprobamos que se introduce correo
	
	var clave = document.getElementById("clave1").value;
	var claveS = clave.toString();
	if (claveS == null || claveS == "") {
		document.getElementById("clave1").style.borderColor = "red";
	} else {
		contador = contador + 1;
	}
	
	
	if(contador == 2) {
	} else {
		return false;
	}
}
