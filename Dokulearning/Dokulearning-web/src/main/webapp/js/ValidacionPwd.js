function validarPassword(formulario) {
	var contador = 0;
//comprobamos que se introduce clave actual
	var pwdActual = document.getElementById("claveActual").value;
	var pwdA = pwdActual.toString();
	if (pwdA == null || pwdA == "") {
		document.getElementById("claveActual").style.borderColor = "red";
	} else {
		document.getElementById("claveActual").style.borderColor = "green";
		contador = contador + 1;
	}

	
//comprobamos que clave nueva no esta vacio	
	var pwdUsuario1 = document.getElementById("claveNueva").value;
	var pwdUno = pwdUsuario1.toString();
	var pwdUnoLong = pwdUno.length;
	if (pwdUno == null || pwdUno == "") {
		document.getElementById("claveNueva").style.borderColor = "red";
	}else if(pwdUnoLong < 4){
		document.getElementById("RclaveNueva").style.borderColor = "red";
	}else {
		document.getElementById("claveNueva").style.borderColor = "green";
		contador = contador + 1;
	}

	
	
//comprobamos que repetir clave nueva no esta vacio	
	var pwdUsuario2 = document.getElementById("RclaveNueva").value;
	var pwdDos = pwdUsuario2.toString();
	var pwdDosLong = pwdDos.length;
	if (pwdDos == null || pwdDos == "") {
		document.getElementById("RclaveNueva").style.borderColor = "red";
	} else if(pwdDosLong < 4){
		document.getElementById("RclaveNueva").style.borderColor = "red";
	}else {
		document.getElementById("RclaveNueva").style.borderColor = "green";
		contador = contador + 1;
	}

//comprobamos que ambas contraseñas coinciden
	if (pwdUno == pwdDos && pwdUno != null && pwdUno != "" && pwdDos != null && pwdDos != "") {
		document.getElementById("claveNueva").style.borderColor = "green";
		document.getElementById("RclaveNueva").style.borderColor = "green";
		contador = contador + 1;
	} else {
		document.getElementById("RclaveNueva").style.borderColor = "red";
		alert("Las contraseñas no son iguales. Por favor, introduzca la misma contraseña en ambos campos.");
	}

	if (contador == 4) {
		alert("Contraseña modificada");
	} else {
		return false;
	}
}
