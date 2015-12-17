function pwdIguales(){ //Antes de validar el resto del formulario, es indispensable que tanto la contraseña como la confirmación de contraseña sean la misma
    var pwd1 = document.getElementById("clave").value;
    var pwd2 = document.getElementById("clave2").value;
    if(pwd1==pwd2 && pwd1 != null && pwd1 != "" && pwd2 != null && pwd2 != ""){
        return validarR();
    } else {
        document.getElementById("clave").style.borderColor="red";
        document.getElementById("clave").style.borderStyle="dotted";
		document.getElementById("txtclave1Reg").style.color="red";
        document.getElementById("clave2").style.borderColor="red";
        document.getElementById("clave2").style.borderStyle="dotted";
		document.getElementById("txtclave2Reg").style.color="red";
        alert("Las contraseñas no son iguales. Por favor, introduzca la misma contraseña en ambos campos.");
        return false;
    }
}	
function validarR(formulario){
    var contador = 0;
   // var mensaje = "";
	   
    //Validado el campo nick de registrado
    var nickRegistrado = document.getElementById("nick").value;
    var nickR = nickRegistrado.toString();
    if (nickR == null || nickR == "") {
       // mensaje = mensaje.concat("El campo Nick debe rellenarse" + '\n');
        document.getElementById("nick").style.borderColor="red";
        document.getElementById("nick").style.borderStyle="dotted";
		document.getElementById("txtNickReg").style.color="red";

    } else if (nickR.match(/[^a-zñÑA-Z\d-]/gi)){
        //mensaje = mensaje.concat("El Nick no puede contener símbolos, ni estar en blanco" + '\n');
        document.getElementById("nick").style.borderColor="red";
        document.getElementById("nick").style.borderStyle="dotted";   
		document.getElementById("txtNickReg").style.color="red";

    } else {
        document.getElementById("nick").style.borderColor="green";
        document.getElementById("nick").style.borderStyle="dotted";
		document.getElementById("txtNickReg").style.color="green";

        contador = contador + 1;
    }

    
    
    
    //Validado el campo apellido 1 de registrado
    var apellido1Registrado = document.getElementById("apellido1").value;
    var apellido1R = apellido1Registrado.toString();
    if (apellido1R == null || apellido1R == "") {
        //mensaje = mensaje.concat("El campo Apellido 1 de registrado debe rellenarse" + '\n');
        document.getElementById("apellido1").style.borderColor="red";
        document.getElementById("apellido1").style.borderStyle="dotted";
		document.getElementById("txtApellido1Reg").style.color="red";

    } else if (apellido1R.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("apellido1").style.borderColor="red";
        document.getElementById("apellido1").style.borderStyle="dotted";
		document.getElementById("txtApellido1Reg").style.color="red";

        //mensaje = mensaje.concat("El apellido 1 del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("apellido1").style.borderColor="green";
        document.getElementById("apellido1").style.borderStyle="dotted";
        
		document.getElementById("txtApellido1Reg").style.color="green";

        contador = contador + 1;
    }

    
    
    //Validado el campo correo de registrado
    var correoRegistrado = document.getElementById("correoR").value;
    var correoR = correoRegistrado.toString();
    if (!correoR.match(/\S+@\S+\.\S+/g)|| correoR == null || correoR == ""){
        document.getElementById("correoR").style.borderColor="red";
        document.getElementById("correoR").style.borderStyle="dotted";
		document.getElementById("txtCorreoReg").style.color="red";

     //   mensaje = mensaje.concat("El campo correo no puede permanecer vacío" + '\n');
    } else {
        document.getElementById("correoR").style.borderColor="green";
        document.getElementById("correoR").style.borderStyle="dotted";
		document.getElementById("txtCorreoReg").style.color="green";

        contador = contador + 1;
    }
       
    
    
    //Valido el campo 'contrasena'
    var pwdUsuario = document.getElementById("clave").value;
    var pwd = pwdUsuario.toString();
	var pwd1Long = pwd.length;
    if (pwd.match(/[^\w\d-.@$%&#€/¡!¿?ñÑáéíóúüçÁÉÍÓÚÇÜ]/g)|| pwd == null || pwd == ""){
        document.getElementById("clave").style.borderColor="red";
        document.getElementById("clave").style.borderStyle="dotted";
		document.getElementById("txtclave1Reg").style.color="red";

        //mensaje = mensaje.concat("El campo Contraseña del proveedor no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
    } else if(pwd1Long < 4){
    	document.getElementById("clave").style.borderColor="red";
        document.getElementById("clave").style.borderStyle="dotted";
		document.getElementById("txtclave1Reg").style.color="red";
		alert("la contraseña debe tener minimo 4 caracteres");
	}else {
        document.getElementById("clave").style.borderColor="green";
        document.getElementById("clave").style.borderStyle="dotted";
		document.getElementById("txtclave1Reg").style.color="green";

        contador = contador + 1;
    }

    
    
    //Validado el campo nombre de registrado
    var nombreRegistrado = document.getElementById("nombre").value;
    var nombreR = nombreRegistrado.toString();
    if (nombreR == null || nombreR == "") {
        //mensaje = mensaje.concat("El campo Nombre de registrado debe rellenarse" + '\n');
        document.getElementById("nombre").style.borderColor="red";
        document.getElementById("nombre").style.borderStyle="dotted";
		document.getElementById("txtNombreReg").style.color="red";

    } else if (nombreR.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nombre").style.borderColor="red";
        document.getElementById("nombre").style.borderStyle="dotted";
		document.getElementById("txtNombreReg").style.color="red";

        //mensaje = mensaje.concat("El nombre del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombre").style.borderColor="green";
        document.getElementById("nombre").style.borderStyle="dotted";
		document.getElementById("txtNombreReg").style.color="green";

        contador = contador + 1;
    }

    
    
    
    
    
    
  //Validado el campo fecha de registrado
	var fechaNcRegistrado = document.getElementById("fechanac").value;
	var fechaNcR = fechaNcRegistrado.toString();
	    hoy=new Date() 
	    var array_fecha = fechaNcR.split("/") 
	    var ano 
	    ano = parseInt(array_fecha[2]); 
	    var mes 
	    mes = parseInt(array_fecha[1]); 
	    var dia 
	    dia = parseInt(array_fecha[0]); 
	    edad=hoy.getYear()- ano - 1; 
	    if (array_fecha.length!=3) {
	    	 document.getElementById("fechanac").style.borderColor="red";
	         document.getElementById("fechanac").style.borderStyle="dotted";
	 		document.getElementById("txtFechaReg").style.color="red";

//	         mensaje = mensaje.concat("La fecha no tiene el formato dd/mm/aaaa" + '\n');
	    }else if (isNaN(ano)) {
	    	 document.getElementById("fechanac").style.borderColor="red";
	         document.getElementById("fechanac").style.borderStyle="dotted";
		 		document.getElementById("txtFechaReg").style.color="red";

//	         mensaje = mensaje.concat("El año es incorrecto" + '\n');
	    }else if (isNaN(mes)) {
	    	 document.getElementById("fechanac").style.borderColor="red";
	         document.getElementById("fechanac").style.borderStyle="dotted";
	         
		 		document.getElementById("txtFechaReg").style.color="red";

//	         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
	    }else if (isNaN(dia)) {
	    	 document.getElementById("fechanac").style.borderColor="red";
	         document.getElementById("fechanac").style.borderStyle="dotted";	 		
	         document.getElementById("txtFechaReg").style.color="red";

//	         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
	    }else if (ano<=99) {
	        ano +=1900 
	    }else if (hoy.getMonth() + 1 - mes < 0) {
	    	 document.getElementById("fechanac").style.borderColor="red";
	         document.getElementById("fechanac").style.borderStyle="dotted";
		 		document.getElementById("txtFechaReg").style.color="red";

//	         mensaje = mensaje.concat("Eres menor de edad" + '\n');
	    }else if (hoy.getMonth() + 1 - mes > 0) {
	    	 document.getElementById("fechanac").style.borderColor="green";
	         document.getElementById("fechanac").style.borderStyle="dotted";
		 		document.getElementById("txtFechaReg").style.color="green";

	         contador = contador + 1;
	    }else if (hoy.getUTCDate() - dia >= 0) {
		   	 document.getElementById("fechanac").style.borderColor="red";
	         document.getElementById("fechanac").style.borderStyle="dotted";
		 		document.getElementById("txtFechaReg").style.color="red";

//	         mensaje = mensaje.concat("Eres menor de edad por dia" + '\n');
	    }else{
	    	document.getElementById("fechanac").style.borderColor="red";
	         document.getElementById("fechanac").style.borderStyle="dotted";
	         
		 		document.getElementById("txtFechaReg").style.color="red";

//	         mensaje = mensaje.concat("La fecha no tiene el formato dd/mm/aaaa" + '\n');
	    }    
    
    
    

           
    //Valido el campo 'confirmar contrasena'
    var pwd2Usuario = document.getElementById("clave2").value;
    var pwd2 = pwd2Usuario.toString();
	var pwd2Long = pwd2.length;
    if (pwd2.match(/[^\w\d-.@$%&#€/¡!¿?ñÑáéíóúüçÁÉÍÓÚÇÜ]/g)|| pwd2 == null || pwd2 == ""){
        document.getElementById("clave2").style.borderColor="red";
        document.getElementById("clave2").style.borderStyle="dotted";
		document.getElementById("txtclave2Reg").style.color="red";
        //mensaje = mensaje.concat("El campo Contraseña del proveedor no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
    }  else if(pwd2Long < 4){
    	 document.getElementById("clave2").style.borderColor="red";
         document.getElementById("clave2").style.borderStyle="dotted";
 		document.getElementById("txtclave2Reg").style.color="red";
	}else {
        document.getElementById("clave2").style.borderColor="green";
        document.getElementById("clave2").style.borderStyle="dotted";
		document.getElementById("txtclave2Reg").style.color="green";
        contador = contador + 1;
    }

 
    
    
//Valido el terminos
    
    if (!document.getElementById("aceptarterm").checked){ 
		document.getElementById("aceptarterm").style.color="red";
		document.getElementById("txtterminos").style.color="red";

    } else { 
		document.getElementById("aceptarterm").style.color="green";
		document.getElementById("txtterminos").style.color="green";

        contador = contador + 1;
    }
 

     
    if(contador == 8){
        alert("Usuario registrado con éxito");
    } else{
        //alert(mensaje);
        return false;
    }
}