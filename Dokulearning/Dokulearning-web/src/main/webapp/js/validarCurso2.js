function validarCurso(formulario){
    var contador = 0;
    var mensaje = "";
    
    //Validado el campo titulo de curso
    var tituloCurso = document.getElementById("nom").value;
    var tituloC = tituloCurso.toString();
    if (tituloC == null || tituloC == "") {
        mensaje = mensaje.concat("El campo titulo de curso debe rellenarse" + '\n');
        document.getElementById("nom").style.borderColor="red";
        document.getElementById("nom").style.borderStyle="dotted";
    } else if (tituloC.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nom").style.borderColor="red";
        document.getElementById("nom").style.borderStyle="dotted";
        mensaje = mensaje.concat("El nombre de curso no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nom").style.borderColor="green";
        document.getElementById("nom").style.borderStyle="dotted";
        contador = contador + 1;
    }
    //Validado el campo descripcion
	var descripcionCurso = document.getElementById("descripcion").value;
	var descripcionC = descripcionCurso.toString();
	if (descripcionC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| descripcionC == null || descripcionC == ""){
		document.getElementById("descripcion").style.borderColor="red";
		document.getElementById("descripcion").style.borderStyle="dotted";
		mensaje = mensaje.concat("El campo descripcion no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
	} else {
		document.getElementById("descripcion").style.borderColor="green";
		document.getElementById("descripcion").style.borderStyle="dotted";
		contador = contador + 1;
	}
	//Validado el campo numeros de horas
	var nHorasCurso = document.getElementById("horas").value;
	var nHorasC = nHorasCurso.toString();
	var cpLong = nHorasC.length;
	if (nHorasC.match(/[\D]/g)|| nHorasC == null || nHorasC == ""){
		document.getElementById("horas").style.borderColor="red";
		document.getElementById("horas").style.borderStyle="dotted";
		mensaje = mensaje.concat("El numero de horas no puede permanecer vacío y sólo puede estar formado por números" + '\n');
	} else if(cpLong != 4){
		document.getElementById("horas").style.borderColor="red";
		document.getElementById("horas").style.borderStyle="dotted";
		mensaje = mensaje.concat("El campo numero de horas debe estar formado por 4 dígitos" + '\n');
	} else {
		document.getElementById("horas").style.borderColor="green";
		document.getElementById("horas").style.borderStyle="dotted";
		contador = contador + 1;
	}
	  //Validado el campo temario
	var temarioCurso = document.getElementById("temario").value;
	var temarioC = temarioCurso.toString();
	if (temarioC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| temarioC == null || temarioC == ""){
		document.getElementById("temario").style.borderColor="red";
		document.getElementById("temario").style.borderStyle="dotted";
		mensaje = mensaje.concat("El campo temario no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
	} else {
		document.getElementById("temario").style.borderColor="green";
		document.getElementById("temario").style.borderStyle="dotted";
		contador = contador + 1;
	}
	//Validado el campo nombre del profesor
    var profesorCurso = document.getElementById("profesor").value;
    var profesorC = profesorCurso.toString();
    if (profesorC == null || profesorC == "") {
        mensaje = mensaje.concat("El campo profesor de cursp debe rellenarse" + '\n');
        document.getElementById("profesor").style.borderColor="red";
        document.getElementById("profesor").style.borderStyle="dotted";
    } else if (profesorC.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("profesor").style.borderColor="red";
        document.getElementById("profesor").style.borderStyle="dotted";
        mensaje = mensaje.concat("El profesor del curso no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("profesor").style.borderColor="green";
        document.getElementById("profesor").style.borderStyle="dotted";
        contador = contador + 1;
    }
  //Validado el campo categoria
	var categoriaCursos = document.getElementById("categoria").value;
	var categoriaC = categoriaCursos.toString();
	if (categoriaC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| categoriaC == null || categoriaC == ""){
		document.getElementById("categoria").style.borderColor="red";
		document.getElementById("categoria").style.borderStyle="dotted";
		mensaje = mensaje.concat("El campo categoria no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
	} else {
		document.getElementById("categoria").style.borderColor="green";
		document.getElementById("categoria").style.borderStyle="dotted";
		contador = contador + 1;
	}
	//Validado el campo precio
    var precioCursos = document.getElementById("precio").value;
    var precioC = precioCursos.toString();
    if (precioC == null || precioC == "") {
        mensaje = mensaje.concat("El campo precio  debe rellenarse." + '\n');
        document.getElementById("precio").style.borderColor="red";
        document.getElementById("precio").style.borderStyle="dotted";
    } else if (precioC.match(/[^\d.]/gi)){
        document.getElementById("precio").style.borderColor="red";
        document.getElementById("precio").style.borderStyle="dotted";
        mensaje = mensaje.concat("El campo precio  no puede contener letras ni estar en blanco." + '\n');
    } else {
        document.getElementById("precio").style.borderColor="green";
        document.getElementById("precio").style.borderStyle="dotted";
        contador = contador + 1;
    }
	   //Validado el campo dificultad
    var dificultadCursos = document.getElementById("dificultad").value;
    var dificultadC = dificultadCursos.toString();
    if (dificultadC == null || dificultadC == "") {
        mensaje = mensaje.concat("El campo dificultad debe rellenarse" + '\n');
        document.getElementById("dificultad").style.borderColor="red";
        document.getElementById("dificultad").style.borderStyle="dotted";
    } else if (dificultadC=="Alta" || dificultadC=="Media" || dificultadC=="Baja"){
        document.getElementById("dificultad").style.borderColor="green";
        document.getElementById("dificultad").style.borderStyle="dotted";
        contador = contador + 1;    
    } else {
        mensaje = mensaje.concat("El campo dificultad debe rellenarse con Alta, Media y Baja)" + '\n');
        document.getElementById("dificultad").style.borderColor="red";
        document.getElementById("dificultad").style.borderStyle="dotted";
    }
    //Validando campo rama
	/*var ramaCursos = document.getElementById("rama").value;
	var ramaC = ramaCursos.toString();
	if (ramaC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| ramaC == null || ramaC == ""){
		document.getElementById("rama").style.borderColor="red";
		document.getElementById("rama").style.borderStyle="dotted";
		mensaje = mensaje.concat("El campo rama no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
	} else {
		document.getElementById("rama").style.borderColor="green";
		document.getElementById("rama").style.borderStyle="dotted";
		contador = contador + 1;
	}*/
    //Validado el campo fecha de inicio
	var f_inicioursos = document.getElementById("f_inicio").value;
	var f_inicio = f_inicioursos.toString();
	    hoy=new Date() 
	    var array_fecha = f_inicio.split("/") 
	    var ano 
	    ano = parseInt(array_fecha[2]); 
	    var mes 
	    mes = parseInt(array_fecha[1]); 
	    var dia 
	    dia = parseInt(array_fecha[0]); 
	    if (array_fecha.length!=3) {
	    	 document.getElementById("f_inicio").style.borderColor="red";
	         document.getElementById("f_inicio").style.borderStyle="dotted";
	         mensaje = mensaje.concat("La fecha de inicio no tiene el formato dd/mm/aaaa" + '\n');
	    }else if (isNaN(ano)) {
	    	 document.getElementById("f_inicio").style.borderColor="red";
	         document.getElementById("f_inicio").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El año es incorrecto" + '\n');
	    }else if (isNaN(mes)) {
	    	 document.getElementById("f_inicio").style.borderColor="red";
	         document.getElementById("f_inicio").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
	    }else if (isNaN(dia)) {
	    	 document.getElementById("f_inicio").style.borderColor="red";
	         document.getElementById("f_inicio").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
	    }else if (ano - hoy.getYear()+1 >= 0) {
	    	if (mes - hoy.getMonth()+1 >= 0) {
	    		if (dia - hoy.getUTCDate() >= 0 || mes - hoy.getMonth()+1 >= 1 || ano - hoy.getYear()+1 >= 1) {
	    		 	 document.getElementById("f_inicio").style.borderColor="green";
	    	         document.getElementById("f_inicio").style.borderStyle="dotted";
	    	         contador = contador + 1;
				}else {
				   	 document.getElementById("f_inicio").style.borderColor="red";
			         document.getElementById("f_inicio").style.borderStyle="dotted";
			         mensaje = mensaje.concat("dia menor, el plazo de inicio de matriculacion tiene que ser mayor al dñia actual" + '\n');
				
				}
	    	}else{
		    	 document.getElementById("f_inicio").style.borderColor="red";
		         document.getElementById("f_inicio").style.borderStyle="dotted";
		         mensaje = mensaje.concat("mes menor" + '\n');
				}
	    }else{
	    	document.getElementById("f_inicio").style.borderColor="red";
	         document.getElementById("f_inicio").style.borderStyle="dotted";
	         mensaje = mensaje.concat("año menor" + '\n');
	    }
	    
	    
	  //Validado el campo fecha de fin
		var f_finursos = document.getElementById("f_fin").value;
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
		    	 document.getElementById("f_fin").style.borderColor="red";
		         document.getElementById("f_fin").style.borderStyle="dotted";
		         mensaje = mensaje.concat("La fecha de fin no tiene el formato dd/mm/aaaa" + '\n');
		    }else if (isNaN(anoF)) {
		    	 document.getElementById("f_fin").style.borderColor="red";
		         document.getElementById("f_fin").style.borderStyle="dotted";
		         mensaje = mensaje.concat("El año es incorrecto" + '\n');
		    }else if (isNaN(mesF)) {
		    	 document.getElementById("f_fin").style.borderColor="red";
		         document.getElementById("f_fin").style.borderStyle="dotted";
		         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
		    }else if (isNaN(diaF)) {
		    	 document.getElementById("f_fin").style.borderColor="red";
		         document.getElementById("f_fin").style.borderStyle="dotted";
		         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
		    }else if (anoF - ano >= 0) {
		    	if (mesF - mes >= 0) {
		    		if (diaF - hoyF.getUTCDate() >= 0) {
		    		 	 document.getElementById("f_fin").style.borderColor="green";
		    	         document.getElementById("f_fin").style.borderStyle="dotted";
		    	         contador = contador + 1;
					}else if  (mesF - mes >= 1 || anoF - ano >= 1) {
						 document.getElementById("f_fin").style.borderColor="green";
		    	         document.getElementById("f_fin").style.borderStyle="dotted";
		    	         contador = contador + 1;
					}
						else {
					   	 document.getElementById("f_fin").style.borderColor="red";
				         document.getElementById("f_fin").style.borderStyle="dotted";
				         mensaje = mensaje.concat("dia menor" + '\n');	
					}
		    	}else{
			    	 document.getElementById("f_fin").style.borderColor="red";
			         document.getElementById("f_fin").style.borderStyle="dotted";
			         mensaje = mensaje.concat("mes menor" + '\n');
					}
		    }else{
		    	document.getElementById("f_fin").style.borderColor="red";
		         document.getElementById("f_fin").style.borderStyle="dotted";
		         mensaje = mensaje.concat("año menor" + '\n');
		    }
		    
		  //Validado el campo f del cierre curso
		    var cierre_cursoursos = document.getElementById("cierre_curso").value;
			var cierre_curso = cierre_cursoursos.toString();
			    hoyC=new Date() 
			    var array_fechaF = cierre_curso.split("/") 
			    var anoC 
			    anoC = parseInt(array_fechaF[2]); 
			    var mesC 
			    mesC = parseInt(array_fechaF[1]); 
			    var diaC 
			    diaC = parseInt(array_fechaF[0]); 
			    if (array_fechaF.length!=3) {
			    	 document.getElementById("cierre_curso").style.borderColor="red";
			         document.getElementById("cierre_curso").style.borderStyle="dotted";
			         mensaje = mensaje.concat("La fecha de fin no tiene el formato dd/mm/aaaa" + '\n');
			    }else if (isNaN(anoC)) {
			    	 document.getElementById("cierre_curso").style.borderColor="red";
			         document.getElementById("cierre_curso").style.borderStyle="dotted";
			         mensaje = mensaje.concat("El año es incorrecto" + '\n');
			    }else if (isNaN(mesC)) {
			    	 document.getElementById("cierre_curso").style.borderColor="red";
			         document.getElementById("cierre_curso").style.borderStyle="dotted";
			         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
			    }else if (isNaN(diaC)) {
			    	 document.getElementById("cierre_curso").style.borderColor="red";
			         document.getElementById("cierre_curso").style.borderStyle="dotted";
			         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
			    }else if (anoC - ano >= 0) {
			    	if (mesC - mes >= 0) {
			    		if (diaC - dia >= 0) {
			    		 	 document.getElementById("cierre_curso").style.borderColor="green";
			    	         document.getElementById("cierre_curso").style.borderStyle="dotted";
			    	         contador = contador + 1;
						}else if  (mesC - mes >= 1 || anoC - ano >= 1) {
							 document.getElementById("cierre_curso").style.borderColor="green";
			    	         document.getElementById("cierre_curso").style.borderStyle="dotted";
			    	         contador = contador + 1;
						}
							else {
						   	 document.getElementById("cierre_curso").style.borderColor="red";
					         document.getElementById("cierre_curso").style.borderStyle="dotted";
					         mensaje = mensaje.concat("dia menor" + '\n');	
						}
			    	}else{
				    	 document.getElementById("cierre_curso").style.borderColor="red";
				         document.getElementById("cierre_curso").style.borderStyle="dotted";
				         mensaje = mensaje.concat("mes menor" + '\n');
						}
			    }else{
			    	document.getElementById("cierre_curso").style.borderColor="red";
			         document.getElementById("cierre_curso").style.borderStyle="dotted";
			         mensaje = mensaje.concat("año menor" + '\n');
			    }

    
    if(contador == 11){
        alert("Curso enviado para validar con éxito");
    } else{
        alert(mensaje);
        return false;
    }
	
	
    
}