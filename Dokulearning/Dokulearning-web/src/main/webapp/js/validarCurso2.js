/*
$(function() {
    $( "#f_inicio" ).datepicker({ minDate: 0, maxDate: "+1M +10D" });
});*/

function validarCurso(formulario){
    var contador = 0;
    //var mensaje = "";
    
//Validado el campo titulo de curso
    var tituloCurso = document.getElementById("nom").value;
    var tituloC = tituloCurso.toString();
    if (tituloC == null || tituloC == "") {
       // mensaje = mensaje.concat("El campo titulo de curso debe rellenarse" + '\n');
        document.getElementById("nom").style.borderColor="red";
        document.getElementById("nom").style.borderStyle="dotted";
		document.getElementById("labelNombre").style.color="red";

    } else if (tituloC.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nom").style.borderColor="red";
        document.getElementById("nom").style.borderStyle="dotted";
		document.getElementById("labelNombre").style.color="red";

        //mensaje = mensaje.concat("El nombre de curso no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nom").style.borderColor="green";
        document.getElementById("nom").style.borderStyle="dotted";
		document.getElementById("labelNombre").style.color="green";

        contador = contador + 1;
    }
    
//Validado el campo descripcion
	var descripcionCurso = document.getElementById("descripcion").value;
	var descripcionC = descripcionCurso.toString();
	if (descripcionC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| descripcionC == null || descripcionC == ""){
		document.getElementById("descripcion").style.borderColor="red";
		document.getElementById("descripcion").style.borderStyle="dotted";
		document.getElementById("labelDescripcion").style.color="red";

		//mensaje = mensaje.concat("El campo descripcion no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
	} else {
		document.getElementById("descripcion").style.borderColor="green";
		document.getElementById("descripcion").style.borderStyle="dotted";
		document.getElementById("labelDescripcion").style.color="green";

		contador = contador + 1;
	}
	
//Validado el campo temario
	var temarioCurso = document.getElementById("temario").value;
	var temarioC = temarioCurso.toString();
	if (temarioC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| temarioC == null || temarioC == ""){
		document.getElementById("temario").style.borderColor="red";
		document.getElementById("temario").style.borderStyle="dotted";
		document.getElementById("labelListado").style.color="red";

		//mensaje = mensaje.concat("El campo temario no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
	} else {
		document.getElementById("temario").style.borderColor="green";
		document.getElementById("temario").style.borderStyle="dotted";
		document.getElementById("labelListado").style.color="green";

		contador = contador + 1;
	}
	

	
//Validado el campo precio
    var precioCursos = document.getElementById("precio").value;
    var precioC = precioCursos.toString();
    if (precioC == null || precioC == "") {
        //mensaje = mensaje.concat("El campo precio  debe rellenarse." + '\n');
        document.getElementById("precio").style.borderColor="red";
        document.getElementById("precio").style.borderStyle="dotted";
		document.getElementById("labelPrecio").style.color="red";

    } else if (precioC.match(/[^\d.]/gi)){
        document.getElementById("precio").style.borderColor="red";
        document.getElementById("precio").style.borderStyle="dotted";
		document.getElementById("labelPrecio").style.color="red";

        //mensaje = mensaje.concat("El campo precio  no puede contener letras ni estar en blanco." + '\n');
    } else {
        document.getElementById("precio").style.borderColor="green";
        document.getElementById("precio").style.borderStyle="dotted";
		document.getElementById("labelPrecio").style.color="green";

        contador = contador + 1;
    }
    
//Validado el campo numeros de horas
	var nHorasCurso = document.getElementById("horas").value;
	var nHorasC = nHorasCurso.toString();
	var cpLong = nHorasC.length;
	if (nHorasC.match(/[\D]/g)|| nHorasC == null || nHorasC == ""){
		document.getElementById("horas").style.borderColor="red";
		document.getElementById("horas").style.borderStyle="dotted";
		document.getElementById("labelNumHoras").style.color="red";

		//mensaje = mensaje.concat("El numero de horas no puede permanecer vacío y sólo puede estar formado por números" + '\n');
	} else if(cpLong> 4){
		document.getElementById("horas").style.borderColor="red";
		document.getElementById("horas").style.borderStyle="dotted";
		document.getElementById("labelNumHoras").style.color="red";

		//mensaje = mensaje.concat("El campo numero de horas debe estar formado por 4 dígitos" + '\n');
	} else {
		document.getElementById("horas").style.borderColor="green";
		document.getElementById("horas").style.borderStyle="dotted";
		document.getElementById("labelNumHoras").style.color="green";

		contador = contador + 1;
	}
	 

    
//Validado el campo fecha de inicio
	var f_inicioursos = document.getElementById("fInicio").value;
	var f_inicio = f_inicioursos.toString();
	    hoy=new Date(); 
	    var array_fecha = f_inicio.split("/"); 
	    var ano; 
	    ano = parseInt(array_fecha[2]); 
	    var mes ;
	    mes = parseInt(array_fecha[1]); 
	    var dia;
	    dia = parseInt(array_fecha[0]); 
	    
	    if (array_fecha.length!=3) {
	    	 document.getElementById("fInicio").style.borderColor="red";
	         document.getElementById("fInicio").style.borderStyle="dotted";
	 		document.getElementById("labelFechaIni").style.color="red";

	      //   mensaje = mensaje.concat("La fecha de inicio no tiene el formato dd/mm/aaaa" + '\n');
	    }else if (isNaN(ano)) {
	    	 document.getElementById("fInicio").style.borderColor="red";
	         document.getElementById("fInicio").style.borderStyle="dotted";
	 		document.getElementById("labelFechaIni").style.color="red";

	        // mensaje = mensaje.concat("El año es incorrecto" + '\n');
	    }else if (isNaN(mes)) {
	    	 document.getElementById("fInicio").style.borderColor="red";
	         document.getElementById("fInicio").style.borderStyle="dotted";
	 		document.getElementById("labelFechaIni").style.color="red";

	         //mensaje = mensaje.concat("El mes es incorrecto" + '\n');
	    }else if (isNaN(dia)) {
	    	 document.getElementById("fInicio").style.borderColor="red";
	         document.getElementById("fInicio").style.borderStyle="dotted";
	 		document.getElementById("labelFechaIni").style.color="red";

	         //mensaje = mensaje.concat("El dia es incorrecto" + '\n');
	    }else if (ano - hoy.getYear() >= 0) {
	    	if (mes - hoy.getMonth() > 0) {
	    		if (dia - hoy.getDate() >= 0 || mes - hoy.getMonth() > 1 || ano - hoy.getFullYear() >= 1) {
	    		 	 document.getElementById("fInicio").style.borderColor="green";
	    	         document.getElementById("fInicio").style.borderStyle="dotted";
	    	 		document.getElementById("labelFechaIni").style.color="green";
 //alert(dia +" "+mes +" "+ano+"ACTUAL "+ hoy.getDate()+" "+ hoy.getMonth() +" "+ hoy.getFullYear() );
	    	         contador = contador + 1;
				}else {
				   	 document.getElementById("fInicio").style.borderColor="red";
			         document.getElementById("fInicio").style.borderStyle="dotted";
			 		document.getElementById("labelFechaIni").style.color="red";

			   //      mensaje = mensaje.concat("dia menor, el plazo de inicio de matriculacion tiene que ser mayor al dñia actual" + '\n');
				
				}
	    	}else{
		    	 document.getElementById("fInicio").style.borderColor="red";
		         document.getElementById("fInicio").style.borderStyle="dotted";
		 		document.getElementById("labelFechaIni").style.color="red";

		         //mensaje = mensaje.concat("mes menor" + '\n');
				}
	    }else{
	    	document.getElementById("fInicio").style.borderColor="red";
	         document.getElementById("fInicio").style.borderStyle="dotted";
	 		document.getElementById("labelFechaIni").style.color="red";

	         //mensaje = mensaje.concat("año menor" + '\n');
	    }
	    
	    
//Validado el campo fecha de fin
		var f_finursos = document.getElementById("fFin").value;
		var f_fin = f_finursos.toString();
		    hoyF=new Date() 
		    var array_fechaF = f_fin.split("/") 
		    var anoF 
		    anoF = parseInt(array_fechaF[2]); 
		    var mesF 
		    mesF = parseInt(array_fechaF[1]); 
		    var diaF 
		    diaF = parseInt(array_fechaF[0]); 
		    if (array_fechaF.length!=3) {
		    	 document.getElementById("fFin").style.borderColor="red";
		         document.getElementById("fFin").style.borderStyle="dotted";
			 		document.getElementById("labelFechaFin").style.color="red";

		       //  mensaje = mensaje.concat("La fecha de fin no tiene el formato dd/mm/aaaa" + '\n');
		    }else if (isNaN(anoF)) {
		    	 document.getElementById("fFin").style.borderColor="red";
		         document.getElementById("fFin").style.borderStyle="dotted";
			 		document.getElementById("labelFechaFin").style.color="red";

		         //mensaje = mensaje.concat("El año es incorrecto" + '\n');
		    }else if (isNaN(mesF)) {
		    	 document.getElementById("fFin").style.borderColor="red";
		         document.getElementById("fFin").style.borderStyle="dotted";
			 		document.getElementById("labelFechaFin").style.color="red";

		         //mensaje = mensaje.concat("El mes es incorrecto" + '\n');
		    }else if (isNaN(diaF)) {
		    	 document.getElementById("fFin").style.borderColor="red";
		         document.getElementById("fFin").style.borderStyle="dotted";
			 		document.getElementById("labelFechaFin").style.color="red";

		         //mensaje = mensaje.concat("El dia es incorrecto" + '\n');
		    }else if (anoF - ano >= 0) {
		    	if (mesF - mes >= 0) {

		    		if (diaF - dia >= 1 || mesF - mes > 1 || anoF - ano >= 1) {
		    		 	 document.getElementById("fFin").style.borderColor="green";
		    	         document.getElementById("fFin").style.borderStyle="dotted";
		    		 	document.getElementById("labelFechaFin").style.color="green";

		    	         contador = contador + 1;
					}else {
					   	 document.getElementById("fFin").style.borderColor="red";
				         document.getElementById("fFin").style.borderStyle="dotted";
					 		document.getElementById("labelFechaFin").style.color="red";

				        // mensaje = mensaje.concat("dia menor, el plazo de inicio de matriculacion tiene que ser mayor al dia actual" + '\n');
					alert("El curso debe durar al menos 1 dia");
					}
		    	}else{
			    	 document.getElementById("fFin").style.borderColor="red";
			         document.getElementById("fFin").style.borderStyle="dotted";
				 		document.getElementById("labelFechaFin").style.color="red";

			        // mensaje = mensaje.concat("mes menor" + '\n');
					}
		    }else{
		    	document.getElementById("fFin").style.borderColor="red";
		         document.getElementById("fFin").style.borderStyle="dotted";
			 		document.getElementById("labelFechaFin").style.color="red";

		         //mensaje = mensaje.concat("año menor" + '\n');
		    }
		    

//Validado el campo dificultad
	    var dificultadCursos = document.getElementById("dificultad").value;
	    var dificultadC = dificultadCursos.toString();
	    if (dificultadC == null || dificultadC == "") {
	        //mensaje = mensaje.concat("El campo dificultad debe rellenarse" + '\n');
	        document.getElementById("dificultad").style.borderColor="red";
	        document.getElementById("dificultad").style.borderStyle="dotted";
			document.getElementById("txtDif").style.color="red";

	    } else if (dificultadC=="Alta" || dificultadC=="Media" || dificultadC=="Baja"){
	        document.getElementById("dificultad").style.borderColor="green";
	        document.getElementById("dificultad").style.borderStyle="dotted";
			document.getElementById("txtDif").style.color="green";

	        contador = contador + 1;    
	    } else {
	        //mensaje = mensaje.concat("El campo dificultad debe rellenarse con Alta, Media y Baja)" + '\n');
	        document.getElementById("dificultad").style.borderColor="red";
	        document.getElementById("dificultad").style.borderStyle="dotted";
			document.getElementById("txtDif").style.color="red";

	    }
   
    
    
  //Validado el campo categoria
	var categoriaCursos = document.getElementById("categoria").value;
	var categoriaC = categoriaCursos.toString();
	if (categoriaC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| categoriaC == null || categoriaC == ""){
		document.getElementById("categoria").style.borderColor="red";
		document.getElementById("categoria").style.borderStyle="dotted";
		document.getElementById("labelCategoria").style.color="red";

		//mensaje = mensaje.concat("El campo categoria no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
	} else {
		document.getElementById("categoria").style.borderColor="green";
		document.getElementById("categoria").style.borderStyle="dotted";
		document.getElementById("labelCategoria").style.color="green";

		contador = contador + 1;
	}
			    
 //Valido el terminos
    
    if (!document.getElementById("terminos").checked){ 
		document.getElementById("terminos").style.color="red";
		document.getElementById("lblTerminos").style.color="red";

    } else { 
		document.getElementById("terminos").style.color="green";
		document.getElementById("lblTerminos").style.color="green";

        contador = contador + 1;
    }
			    		
    if(contador == 10){
        alert("Datos del curso correctos. Curso creado");
    } else{
        //alert(mensaje);
        return false;
    }
   
}