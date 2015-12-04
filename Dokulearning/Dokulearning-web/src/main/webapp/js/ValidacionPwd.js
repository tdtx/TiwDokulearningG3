function validarPassword(formulario) {
	var contador = 0;

	var pwdUsuario1 = document.getElementById("claveNueva").value;
	var pwdUno = pwdUsuario1.toString();
	var pwdUsuario2 = document.getElementById("RclaveNueva").value;
	var pwdDos = pwdUsuario2.toString();
	if (pwdUno == null
			|| pwdUno == "") {
		alert("uno");

		alert("La contraseña actual es incorrecta");
	} else {
		alert("bien uno");

		contador = contador + 1;
	}

	if (pwdDos == null
			|| pwdDos == "") {
		alert("dos");

		/*document.getElementById("claveNueva").style.borderColor = "red";
		document.getElementById("claveNueva").style.borderStyle = "dotted";
		document.getElementById("lblClaveNueva").style.color = "red";
		document.getElementById("RclaveNueva").style.borderColor = "red";
		document.getElementById("RclaveNueva").style.borderStyle = "dotted";
		document.getElementById("lblRClaveNueva").style.color = "red";*/

		alert("La contraseña actual es incorrecta");
	} else {
		
		alert("bien dos");

		contador = contador + 1;
	}

	var pwd1 = document.getElementById("claveNueva").value;
	var pwd2 = document.getElementById("RclaveNueva").value;
	if (pwd1 == pwd2 && pwd1 != null && pwd1 != "" && pwd2 != null
			&& pwd2 != "") {
		alert("bien tres");

		contador = contador + 1;
	} else {
		/*document.getElementById("claveNueva").style.borderColor = "red";
		document.getElementById("claveNueva").style.borderStyle = "dotted";
		document.getElementById("lblClaveNueva").style.color = "red";
		document.getElementById("RclaveNueva").style.borderColor = "red";
		document.getElementById("RclaveNueva").style.borderStyle = "dotted";
		document.getElementById("lblRClaveNueva").style.color = "red";*/
		alert("Las contraseñas no son iguales. Por favor, introduzca la misma contraseña en ambos campos.");
	}

	if (contador == 3) {
		alert("Contraseña modificada");
	} else {
		alert("MAAAAALLL");
		return false;
	}
}
