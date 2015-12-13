
function validacionDatosPago(formularioPago){
    var contador = 0;
   var mensaje = "";
	   //validar tarjeta
    var dPago = document.getElementById("tarjeta").value;
	var datosP = dPago.toString();
	var datosLong = datosP.length;
	if (datosP == null || datosP == "") {

		//mensaje = mensaje.concat("El campo telefono  debe rellenarse" + '\n');
		document.getElementById("tarjeta").style.borderColor="red";
		document.getElementById("tarjeta").style.borderStyle="dotted";
		document.getElementById("txtTarjeta").style.color="red";

		
	} else if (!datosP.match(/^[A-B]([0-9a-zA-Z])*$/)){
		document.getElementById("tarjeta").style.borderColor="red";
		document.getElementById("tarjeta").style.borderStyle="dotted";
		document.getElementById("txtTarjeta").style.color="red";

		//mensaje = mensaje.concat("El campo telefono no puede contener letras ni estar en blanco" + '\n');
	} else if (datosLong < 20){
		document.getElementById("tarjeta").style.borderColor="red";
		document.getElementById("tarjeta").style.borderStyle="dotted";
		document.getElementById("txtTarjeta").style.color="red";

		//mensaje = mensaje.concat("El campo telefono debe tener 9 dígitos" + '\n');
	} else{	
		document.getElementById("tarjeta").style.borderColor="green";
		document.getElementById("tarjeta").style.borderStyle="dotted";
		document.getElementById("txtTarjeta").style.color="green";

		contador = contador + 1;
	}
	
	
	
	 //validar vale
    var dVale = document.getElementById("vale").value;
	var datosVale = dVale.toString();
	var valeLongLong = datosVale.length;
	 if (!datosVale.match(/^(VALE)[0-9]*$/)){
		alert("mal");
		document.getElementById("vale").style.borderColor="red";
		document.getElementById("vale").style.borderStyle="dotted";
		document.getElementById("txtVale").style.color="red";

		//mensaje = mensaje.concat("El campo telefono no puede contener letras ni estar en blanco" + '\n');
	} else if (valeLongLong < 24){
		document.getElementById("vale").style.borderColor="red";
		document.getElementById("vale").style.borderStyle="dotted";
		document.getElementById("txtVale").style.color="red";

		//mensaje = mensaje.concat("El campo telefono debe tener 9 dígitos" + '\n');
	} else{	
		document.getElementById("vale").style.borderColor="green";
		document.getElementById("vale").style.borderStyle="dotted";
		document.getElementById("txtVale").style.color="green";

		contador = contador + 1;
	}
	
	  
    if(contador == 2){
        alert("Operacion realizada con éxito");
    } else{
        //alert(mensaje);
        return false;
    }
}