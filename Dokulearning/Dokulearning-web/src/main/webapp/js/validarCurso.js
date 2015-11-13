/**
 * 
 */

    function validarCurso(formulario){
    	
    	var contador = 0;
    //	var mensaje = "";
    
    var nomb = document.getElementById("nom").value;
    var name = nomb.toString();
    
    if (name == null || name ==""){
    	//mensaje = mensaje.concat("El campo 'Nombre de curso' debe rellenarse" + '\n');
    	document.getElementById("nom").style.borderColor="red";
        document.getElementById("nom").style.borderStyle="dotted";
    } else if (name.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("nom").style.borderColor="red";
        document.getElementById("nom").style.borderStyle="dotted";
       // mensaje = mensaje.concat("El campo 'Nombre de curso' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("nom").style.borderColor="blue";
        document.getElementById("nom").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
    var ramab = document.getElementById("rama").value;
    var rame = ramab.toString();
    
    if (rame == null || rame ==""){
    	// mensaje = mensaje.concat("El campo 'Campo de enseñanza' debe rellenarse" + '\n');
    	document.getElementById("rama").style.borderColor="red";
        document.getElementById("rama").style.borderStyle="dotted";
    } else if (rame.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("rama").style.borderColor="red";
        document.getElementById("rama").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'Campo de enseñanza' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("rama").style.borderColor="blue";
        document.getElementById("rama").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
    var descripcionb = document.getElementById("descripcion").value;
    var descripcione = descripcionb.toString();
    
    if (descripcione == null || descripcione ==""){
    	//mensaje = mensaje.concat("El campo 'Descripcion' debe rellenarse" + '\n');
    	document.getElementById("descripcion").style.borderColor="red";
        document.getElementById("descripcion").style.borderStyle="dotted";
    } else if (descripcione.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("descripcion").style.borderColor="red";
        document.getElementById("descripcion").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'descripcion' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("descripcion").style.borderColor="blue";
        document.getElementById("descripcion").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
    var temariob = document.getElementById("temario").value;
    var temarioe = temariob.toString();
    
    if (temarioe == null || temarioe ==""){
    	//mensaje = mensaje.concat("El campo 'Contenido del curso' debe rellenarse" + '\n');
    	document.getElementById("temario").style.borderColor="red";
        document.getElementById("temario").style.borderStyle="dotted";
    } else if (temarioe.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("temario").style.borderColor="red";
        document.getElementById("temario").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'Contenido del curso' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("temario").style.borderColor="blue";
        document.getElementById("temario").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
    
    var preciob = document.getElementById("precio").value;
    var precioe = preciob.toString();
    
    if (precioe == null || precioe ==""){
    	//mensaje = mensaje.concat("El campo 'Precio' debe rellenarse" + '\n');
    	document.getElementById("precio").style.borderColor="red";
        document.getElementById("precio").style.borderStyle="dotted";
    } else if (precioe.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("precio").style.borderColor="red";
        document.getElementById("precio").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'Precio' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("precio").style.borderColor="blue";
        document.getElementById("precio").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
    var horasb = document.getElementById("horas").value;
    var horase = horasb.toString();
    
    if (horase == null || horase ==""){
    	//mensaje = mensaje.concat("El campo 'Numero de horas' debe rellenarse" + '\n');
    	document.getElementById("horas").style.borderColor="red";
        document.getElementById("horas").style.borderStyle="dotted";
    } else if (horase.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("horas").style.borderColor="red";
        document.getElementById("horas").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'Numero de horas' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("horas").style.borderColor="blue";
        document.getElementById("horas").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    var profesorb = document.getElementById("profesor").value;
    var profesore = profesorb.toString();
    
    if (profesore == null || profesore ==""){
    	//mensaje = mensaje.concat("El campo 'Nombre del profesor' debe rellenarse" + '\n');
    	document.getElementById("profesor").style.borderColor="red";
        document.getElementById("profesor").style.borderStyle="dotted";
    } else if (profesore.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("profesor").style.borderColor="red";
        document.getElementById("profesor").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'Nombre del profesor' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("profesor").style.borderColor="blue";
        document.getElementById("profesor").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
    var f_iniciob = document.getElementById("f_inicio").value;
    var f_inicioe = f_iniciob.toString();
    
    if (f_inicioe == null || f_inicioe ==""){
    	//mensaje = mensaje.concat("El campo 'Fecha de inicio' debe rellenarse" + '\n');
    	document.getElementById("f_inicio").style.borderColor="red";
        document.getElementById("f_inicio").style.borderStyle="dotted";
    } else if (f_inicioe.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("f_inicio").style.borderColor="red";
        document.getElementById("f_inicio").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'Fecha de inicio' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("f_inicio").style.borderColor="blue";
        document.getElementById("f_inicio").style.borderStyle="dotted";
        contador = contador + 1;
    }    
    
    
    var f_finb = document.getElementById("f_fin").value;
    var f_fine = f_finb.toString();
    
    if (f_fine == null || f_fine ==""){
    	//mensaje = mensaje.concat("El campo 'Fecha fin de curso' debe rellenarse" + '\n');
    	document.getElementById("f_fin").style.borderColor="red";
        document.getElementById("f_fin").style.borderStyle="dotted";
    } else if (f_fine.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("f_fin").style.borderColor="red";
        document.getElementById("f_fin").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'Fecha fin de curso' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("f_fin").style.borderColor="blue";
        document.getElementById("f_fin").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
    
    var cierreb = document.getElementById("cierre_curso").value;
    var cierree = cierreb.toString();
    
    if (cierree == null || cierree ==""){
    	//mensaje = mensaje.concat("El campo 'Fecha cierre de curso' debe rellenarse" + '\n');
    	document.getElementById("cierre_curso").style.borderColor="red";
        document.getElementById("cierre_curso").style.borderStyle="dotted";
    } else if (cierree.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
        document.getElementById("cierre_curso").style.borderColor="red";
        document.getElementById("cierre_curso").style.borderStyle="dotted";
        //mensaje = mensaje.concat("El campo 'Fecha cierre de curso' no puede contener números ni símbolos ni estar en blanco" + '\n');
    }else {
        document.getElementById("cierre_curso").style.borderColor="blue";
        document.getElementById("cierre_curso").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    //¿Para checkbox?
    
    if (contador == 0 ){
    	alert("Formulario enviado para validar");
    }else{
    	//alert(mensaje);
    	return false;
    }
    
    
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    