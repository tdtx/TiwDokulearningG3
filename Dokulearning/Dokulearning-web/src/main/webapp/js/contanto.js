function validarK(formulario){
   
	
	
	var contador = 0;
    //var mensaje = "";

	 
    //Validado el campo nombre de registrado
    var nombreRegistrado = document.getElementById("nombreC").value;
    var nombreR = nombreRegistrado.toString();
    if (nombreR == null || nombreR == "") {
        //mensaje = mensaje.concat("El campo Nombre debe rellenarse" + '\n');
        document.getElementById("nombreC").style.borderColor="red";
        document.getElementById("nombreC").style.borderStyle="dotted";
		document.getElementById("etiqNombre").style.color="red";

    } else if (nombreR.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nombreC").style.borderColor="red";
        document.getElementById("nombreC").style.borderStyle="dotted";
		document.getElementById("etiqNombre").style.color="red";

        //mensaje = mensaje.concat("El nombre no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombreC").style.borderColor="green";
        document.getElementById("nombreC").style.borderStyle="dotted";
		document.getElementById("etiqNombre").style.color="green";

        contador = contador + 1;
    }


    //Validado el campo correo de registrado
    var correoContact0 = document.getElementById("correoC").value;
    var correoCC = correoContact0.toString();
    if (correoCC.match(/[^\w\d.@-_ñÑ&#/]/g)|| correoCC == null || correoCC == ""){
        document.getElementById("correoC").style.borderColor="red";
        document.getElementById("correoC").style.borderStyle="dotted";
		document.getElementById("etiqCorreo").style.color="red";

        //mensaje = mensaje.concat("El campo correo no puede permanecer vacío" + '\n');
    } else {
        document.getElementById("correoC").style.borderColor="green";
        document.getElementById("correoC").style.borderStyle="dotted";
		document.getElementById("etiqCorreo").style.color="green";

        contador = contador + 1;
    }
           

    //validar telefono

    var telefonoMatriculado = document.getElementById("telefonoC").value;
	var telefonoM = telefonoMatriculado.toString();
	var telfLong = telefonoM.length;
	if (telefonoM == null || telefonoM == "") {
		//mensaje = mensaje.concat("El campo telefono  debe rellenarse" + '\n');
		document.getElementById("telefonoC").style.borderColor="red";
		document.getElementById("telefonoC").style.borderStyle="dotted";
		document.getElementById("etiqTLF").style.color="red";

		
	} else if (telefonoM.match(/[\D]/gi)){
		document.getElementById("telefonoC").style.borderColor="red";
		document.getElementById("telefonoC").style.borderStyle="dotted";
		document.getElementById("etiqTLF").style.color="red";

		//mensaje = mensaje.concat("El campo telefono no puede contener letras ni estar en blanco" + '\n');
	} else if (telfLong < 9){
		document.getElementById("telefonoC").style.borderColor="red";
		document.getElementById("telefonoC").style.borderStyle="dotted";
		document.getElementById("etiqTLF").style.color="red";

		//mensaje = mensaje.concat("El campo telefono debe tener 9 dígitos" + '\n');
	} else{	
		document.getElementById("telefonoC").style.borderColor="green";
		document.getElementById("telefonoC").style.borderStyle="dotted";
		document.getElementById("etiqTLF").style.color="green";

		contador = contador + 1;
	}
    
  //Validado el campo mensaje de registrado
    var nickRegistrado = document.getElementById("mensajeC").value;
    var nickR = nickRegistrado.toString();
    if (nickR == null || nickR == "") {
        //mensaje = mensaje.concat("El mensaje debe rellenarse" + '\n');
        document.getElementById("mensajeC").style.borderColor="red";
        document.getElementById("mensajeC").style.borderStyle="dotted";
		document.getElementById("etiqMEnsaj").style.color="red";

    } else if (nickR.match(/[^a-zñÑA-Z\d-]/gi)){
        //mensaje = mensaje.concat("El mensaje no puede contener símbolos, ni estar en blanco" + '\n');
        document.getElementById("mensajeC").style.borderColor="red";
        document.getElementById("mensajeC").style.borderStyle="dotted";  
		document.getElementById("etiqMEnsaj").style.color="red";

    } else {
        document.getElementById("mensajeC").style.borderColor="green";
        document.getElementById("mensajeC").style.borderStyle="dotted";
		document.getElementById("etiqMEnsaj").style.color="green";

        contador = contador + 1;
    }
    
    
     
   
    
    if(contador == 4){  
    	 $("#dialogo").dialog({
             scrollable: true,
             width: 650,
             modal: true

         });
    	$("#dialogo").show;
    		
    	        
   
        
    } else{
        //alert(mensaje);
        return false;
    }
}