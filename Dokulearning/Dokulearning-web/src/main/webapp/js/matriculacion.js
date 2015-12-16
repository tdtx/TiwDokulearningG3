
function comprobarMatriculacion(){
    var contador = 0;
   var mensaje = "";
	   //validar telefono

    var telefonoMatriculado = document.getElementById("telefono").value;
	var telefonoM = telefonoMatriculado.toString();
	var telfLong = telefonoM.length;
	if (telefonoM == null || telefonoM == "") {
		//mensaje = mensaje.concat("El campo telefono  debe rellenarse" + '\n');
		document.getElementById("telefono").style.borderColor="red";
		document.getElementById("telefono").style.borderStyle="dotted";
		document.getElementById("txtTelefono").style.color="red";

		
	} else if (telefonoM.match(/[\D]/gi)){
		document.getElementById("telefono").style.borderColor="red";
		document.getElementById("telefono").style.borderStyle="dotted";
		document.getElementById("txtTelefono").style.color="red";

		//mensaje = mensaje.concat("El campo telefono no puede contener letras ni estar en blanco" + '\n');
	} else if (telfLong < 9){
		document.getElementById("telefono").style.borderColor="red";
		document.getElementById("telefono").style.borderStyle="dotted";
		document.getElementById("txtTelefono").style.color="red";

		//mensaje = mensaje.concat("El campo telefono debe tener 9 dígitos" + '\n');
	} else{	
		document.getElementById("telefono").style.borderColor="green";
		document.getElementById("telefono").style.borderStyle="dotted";
		document.getElementById("txtTelefono").style.color="green";

		contador = contador + 1;
	}
   //validar genero
	 var generoMatriculado = document.getElementById("genero").value;
	    var generoM = generoMatriculado.toString();
	    if (generoM == null || generoM == "") {
	        mensaje = mensaje.concat("El campo genero debe rellenarse" + '\n');
	        document.getElementById("genero").style.borderColor="red";
	        document.getElementById("genero").style.borderStyle="dotted";
			document.getElementById("txtGenero").style.color="red";

	    } else if (generoM=="Hombre" || generoM=="Mujer" ){
	        document.getElementById("genero").style.borderColor="green";
	        document.getElementById("genero").style.borderStyle="dotted";
			document.getElementById("txtGenero").style.color="green";

	        contador = contador + 1;    
	    } else {
	        mensaje = mensaje.concat("El campo genero debe rellenarse con Hombre o Mujer" + '\n');
	        document.getElementById("genero").style.borderColor="red";
	        document.getElementById("genero").style.borderStyle="dotted";
			document.getElementById("txtGenero").style.color="red";

	    }
    
	  //Validado el campo dni
		var dniMatriculado = document.getElementById("DNI").value;
		var dniM = dniMatriculado.toString();
		  var expresion_regular_dni;		 
		  expresion_regular_dni = /^\d{8}[a-zA-Z]$/;		 
		  if(expresion_regular_dni.test(dniM) == true){
			  document.getElementById("DNI").style.borderColor="green";
			  document.getElementById("DNI").style.borderStyle="dotted";
			  document.getElementById("txtDNI").style.color="green";

				contador = contador + 1;
		  }else{
			  document.getElementById("DNI").style.borderColor="red";
				document.getElementById("DNI").style.borderStyle="dotted";
				document.getElementById("txtDNI").style.color="red";

				mensaje = mensaje.concat("El formato del DNI es incorrecto, el formato es 8 digito +1 letra sin espacio" + '\n');
		   } 
		  
		  
		  
		
 
			  //Validado el campo calle
				var calleMatriculado = document.getElementById("calle").value;
				var calleM = calleMatriculado.toString();
				if (calleM.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| calleM == null || calleM == ""){
					document.getElementById("calle").style.borderColor="red";
					document.getElementById("calle").style.borderStyle="dotted";
					document.getElementById("txtCalle").style.color="red";

					mensaje = mensaje.concat("El campo calle no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
				} else {
					document.getElementById("calle").style.borderColor="green";
					document.getElementById("calle").style.borderStyle="dotted";
					document.getElementById("txtCalle").style.color="green";

					contador = contador + 1;
				}
				
				//Validado el campo localidad
				var localidadMatriculado = document.getElementById("localidad").value;
				var localidadM = localidadMatriculado.toString();

				if (localidadM == null || localidadM == "") {
					mensaje = mensaje.concat("El campo localidad debe rellenarse" + '\n');
					document.getElementById("localidad").style.borderColor="red";
					document.getElementById("localidad").style.borderStyle="dotted";
					document.getElementById("txtLocalidad").style.color="red";

				} else if (localidadM.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)){
					document.getElementById("localidad").style.borderColor="red";
					document.getElementById("localidad").style.borderStyle="dotted";
					document.getElementById("txtLocalidad").style.color="red";

					
					mensaje = mensaje.concat("El campo localidad no puede contener números ni símbolos ni estar en blanco" + '\n');
				} else {
					document.getElementById("localidad").style.borderColor="green";
					document.getElementById("localidad").style.borderStyle="dotted";
					document.getElementById("txtLocalidad").style.color="green";

					contador = contador + 1;
				}
				
				
				
				//Valido el campo 'codigo postal'
				var cpMatriculado = document.getElementById("codigopostal").value;
				var cpM = cpMatriculado.toString();
				var cpLong = cpM.length;
				if (cpM.match(/[\D]/g)|| cpM == null || cpM == ""){
					document.getElementById("codigopostal").style.borderColor="red";
					document.getElementById("codigopostal").style.borderStyle="dotted";
					document.getElementById("txtCodigoPostal").style.color="red";

					mensaje = mensaje.concat("El campo Codigo postal no puede permanecer vacío y sólo puede estar formado por números" + '\n');
				} else if(cpLong != 5){
					document.getElementById("codigopostal").style.borderColor="red";
					document.getElementById("codigopostal").style.borderStyle="dotted";
					document.getElementById("txtCodigoPostal").style.color="red";

					mensaje = mensaje.concat("El campo Codigo postal debe estar formado por 5 dígitos" + '\n');
				} else {
					document.getElementById("codigopostal").style.borderColor="green";
					document.getElementById("codigopostal").style.borderStyle="dotted";
					document.getElementById("txtCodigoPostal").style.color="green";

					contador = contador + 1;
				}	
				
				
				
				//Validado el campo provincia
				var provinciaMatriculado = document.getElementById("provincia").value;
				var provinciaM = provinciaMatriculado.toString();
				if (provinciaM == null || provinciaM == "") {
					mensaje = mensaje.concat("El campo Provincia debe rellenarse" + '\n');
					document.getElementById("provincia").style.borderColor="red";
					document.getElementById("provincia").style.borderStyle="dotted";
					document.getElementById("txtProvincia").style.color="red";

				} else if (provinciaM.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
					document.getElementById("provincia").style.borderColor="red";
					document.getElementById("provincia").style.borderStyle="dotted";
					document.getElementById("txtProvincia").style.color="red";

					mensaje = mensaje.concat("El campo Provincia no puede contener números ni símbolos ni estar en blanco" + '\n');
				} else {
					document.getElementById("provincia").style.borderColor="green";
					document.getElementById("provincia").style.borderStyle="dotted";
					document.getElementById("txtProvincia").style.color="green";

					contador = contador + 1;
				}
				
				
				 //Valido el campo terminos
			    
			    if (!document.getElementById("aceptarterm").checked){
			    	document.getElementById("aceptarterm").style.color="red";
					document.getElementById("txtAceptar").style.color="red";

			        //mensaje = mensaje.concat("El campo Contraseña del proveedor no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
			    } else {
			        
					document.getElementById("txtAceptar").style.color="green";
			    	document.getElementById("aceptarterm").style.color="green";

			        contador = contador + 1;
			    }

				
				
     
    if(contador == 8){
        alert("Usuario registrado con éxito");
    } else{
        //alert(mensaje);
        return false;
    }
}