/**
 * 
 */
/*
$(document).ready(function(){
    $(function() {
        $("#fecha").datepicker({ //calendario de la fecha de nacimiento
            dateFormat: "dd/mm/yyyy",
            dayNamesMin: [ "Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sá" ] ,
            firstDay: 1,
            monthNames: [ "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
        });
    });
    $("#sexo").selectmenu().selectmenu("menuWidget").addClass("camposFormulario");
    $(document).tooltip();
    $("#btnEnviar").button().click(function(){ comprobarFormulario(); }); //comprobarFormulario);
    		
    

});*/


/*
function comprobarFormulario(){//comprobacion de los campos del formulario con sus alerts como en la practica anterior
    var mensaje = new Array();
//TELEFONO   || ($("#telefono").val().length !=9)
    $("#txtTelefono").removeClass("error");
    if (($("#telefono").val() == "") || ($("#telefono").val() == undefined)){
        $("#txtTelefono").addClass("error");
        mensaje.push("Debe indicar su telefono");
    }else{
        var patron = new RegExp(/^[0-9]{9}$/);
        if(!patron.test($("#telefono").val())){
            $("#txtTelefono").addClass("error");
            mensaje.push("\nEl numero de telefono deben ser 9 digitos");
        }
    }
    
//GENERO    
     $("#txtGenero").removeClass("error");
    if (($("#genero").val() == "") || ($("#genero").val() == undefined)){
    	$("#txtGenero").addClass("error");
        mensaje.push("\nDebe seleccionar su genero");
    }
    
    
//CALLE    
    $("#txtCalle").removeClass("error");
    if (($("#calle").val() == "") || ($("#calle").val() == undefined)){
        $("#txtCalle").addClass("error");
        mensaje.push("\nDebe indicar su calle");
    }else{
        var patron = new RegExp(/[^\s\a-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&-]/gi);
        if(patron.test($("#calle").val())){
            $("#txtCalle").addClass("error");
            mensaje.push("\nLa calle no debe contener caracteres especiales");
        }
    }
    
//LOCALIDAD    
    $("#txtLocalidad").removeClass("error");
    if (($("#localidad").val() == "") || ($("#localidad").val() == undefined)){
        $("#txtLocalidad").addClass("error");
        mensaje.push("\nDebe indicar su localidad");
    }else{
        var patron = new RegExp(/[^\s\a-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&-]/gi);
        if(patron.test($("#localidad").val())){
            $("#txtLocalidad").addClass("error");
            mensaje.push("\nLa localidad no debe contener caracteres especiales");
        }
    }
    
    
//CP
    $("#txtCodigoPostal").removeClass("error");
    if (($("#codigopostal").val() == "") || ($("#codigopostal").val() == undefined)){
        $("#txtCodigoPostal").addClass("error");
        mensaje.push("\nDebe indicar su codigo postal");
    }else{
        var patron = new RegExp(/^[0-9]{5}$/);
        if(!patron.test($("#codigopostal").val())){
            $("#txtCodigoPostal").addClass("error");
            mensaje.push("\nEl codigo postal debe ser de 5 digitos");
        }
    }
    
//PROVINCIA    
    $("#txtProvincia").removeClass("error");
    if (($("#provincia").val() == "") || ($("#provincia").val() == undefined) ){
        $("#txtProvincia").addClass("error");
        mensaje.push("\nDebe indicar su provincia");
    }else{
        var patron = new RegExp(/[^\s\a-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&-]/gi);
        if(patron.test($("#provincia").val())){
            $("#txtProvincia").addClass("error");
            mensaje.push("\nLa provincia no debe contener caracteres especiales");
        }
    }
    
//FORMA DE PAGO    
    $("#txtFormaPago").removeClass("error");
    if (($("#formaPago").val() == "") || ($("#formaPago").val() == undefined)){
    	$("#txtFormaPago").addClass("error");
        mensaje.push("\nDebe seleccionar la forma de pago");
    }

    
//DNI
    $("#txtDNI").removeClass("error");
    if (($("#DNI").val() == "") || ($("#DNI").val() == undefined) || ($("#DNI").val().length<9)){
        $("#txtDNI").addClass("error");
        mensaje.push("\nDebe indicar su DNI");
    }else{
        var patron = new RegExp(/^\d{8}[a-zA-Z]$/);
        if(!patron.test($("#DNI").val())){
            $("#txtDNI").addClass("error");
            mensaje.push("\nEl DNI debe contener 8 digitos y 1 letra");
        }
    }
    
//CONDICIONES  
    $("#txtAceptar").removeClass("error");
    if (!$("#aceptar").is(':checked')){
        $("#txtAceptar").addClass("error");
        mensaje.push("\nDebe aceptar los terminos y las condiciones de uso");
    }
    
    if (mensaje == ""){ //No hay error
    	alert("El usuario se ha matriculado con exito!")
    	    $("#formularioMat").submit();
    	   // alert("El usuario se ha matriculado con exito!")
    }
    else{
    	return false;
    	/*alert(mensaje);

    	$("#ulErroresEnPagina").empty();
        for(error in mensaje){
            li = document.createElement("li");
            $(li).html(mensaje[error]);
            $("#ulErroresEnPagina").append(li); 
        }
      
        
    	$("#ulErrores").empty();
        for(error in mensaje){
            li = document.createElement("li");
            $(li).html(mensaje[error]);
            $("#ulErrores").append(li); 
        }
        $("#dialogo").dialog({
                    scrollable: true,
                    width: 650,
                    modal: true

                });
        $("#dialogo").show();

    }
}*/





function comprobarMatriculacion(formularioMat){
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
		  
		  
		  
		//validar genero
			 var formaPagoMatriculado = document.getElementById("formaPago").value;
			    var formaPagoM = formaPagoMatriculado.toString();
			    if (formaPagoM == null || formaPagoM == "") {
			        mensaje = mensaje.concat("El campo genero debe rellenarse" + '\n');
			        document.getElementById("formaPago").style.borderColor="red";
			        document.getElementById("formaPago").style.borderStyle="dotted";
					document.getElementById("txtFormaPago").style.color="red";

			    } else if (formaPagoM=="Transferencia" || formaPagoM=="Paypal" || formaPagoM=="Tarjeta" ){
			        document.getElementById("formaPago").style.borderColor="green";
			        document.getElementById("formaPago").style.borderStyle="dotted";
					document.getElementById("txtFormaPago").style.color="green";

			        contador = contador + 1;    
			    } else {
			        mensaje = mensaje.concat("El campo genero debe rellenarse con Hombre o Mujer" + '\n');
			        document.getElementById("formaPago").style.borderColor="red";
			        document.getElementById("formaPago").style.borderStyle="dotted";
					document.getElementById("txtFormaPago").style.color="red";

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
			    
			    if (!document.getElementById("aceptar").checked){
			        
					document.getElementById("txtAceptar").style.color="red";

			        //mensaje = mensaje.concat("El campo Contraseña del proveedor no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
			    } else {
			        
					document.getElementById("txtAceptar").style.color="green";

			        contador = contador + 1;
			    }

				
				
     
    if(contador == 9){
        alert("Usuario registrado con éxito");
    } else{
        //alert(mensaje);
        return false;
    }
}