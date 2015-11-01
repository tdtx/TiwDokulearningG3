function pwdIguales(){ //Antes de validar el resto del formulario, es indispensable que tanto la contraseña como la confirmación de contraseña sean la misma
    var pwd1 = document.getElementById("clave1").value;
    var pwd2 = document.getElementById("clave2").value;
    if(pwd1==pwd2 && pwd1 != null && pwd1 != "" && pwd2 != null && pwd2 != ""){
        return validarF();
    } else {
        document.getElementById("clave1").style.borderColor="red";
        document.getElementById("clave1").style.borderStyle="dotted";
        document.getElementById("clave2").style.borderColor="red";
        document.getElementById("clave2").style.borderStyle="dotted";
        alert("Las contraseñas no son iguales. Por favor, introduzca la misma contraseña en ambos campos.");
        return false;
    }
}	
function validarR(formulario){
    var contador = 0;
    var mensaje = "";
	   //Validado el campo correo de registrado
    var correoRegistrado = document.getElementById("correoR").value;
    var correoR = correoRegistrado.toString();
    if (correoR.match(/[^\w\d.@-_ñÑ&#/]/g)|| correoR == null || correoR == ""){
        document.getElementById("correoR").style.borderColor="red";
        document.getElementById("correoR").style.borderStyle="dotted";
        mensaje = mensaje.concat("El campo correo no puede permanecer vacío" + '\n');
    } else {
        document.getElementById("correoR").style.borderColor="green";
        document.getElementById("correoR").style.borderStyle="dotted";
        contador = contador + 1;
    }
    //Validado el campo nick de registrado
    var nickRegistrado = document.getElementById("nick").value;
    var nickR = nickRegistrado.toString();
    if (nickR == null || nickR == "") {
        mensaje = mensaje.concat("El campo Nick debe rellenarse" + '\n');
        document.getElementById("nick").style.borderColor="red";
        document.getElementById("nick").style.borderStyle="dotted";
    } else if (nickR.match(/[^a-zñÑA-Z\d-]/gi)){
        mensaje = mensaje.concat("El Nick no puede contener símbolos, ni estar en blanco" + '\n');
        document.getElementById("nick").style.borderColor="red";
        document.getElementById("nick").style.borderStyle="dotted";      
    } else {
        document.getElementById("nick").style.borderColor="green";
        document.getElementById("nick").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    //Validado el campo nombre de registrado
    var nombreRegistrado = document.getElementById("nombre").value;
    var nombreR = nombreRegistrado.toString();
    if (nombreR == null || nombreR == "") {
        mensaje = mensaje.concat("El campo Nombre de registrado debe rellenarse" + '\n');
        document.getElementById("nombre").style.borderColor="red";
        document.getElementById("nombre").style.borderStyle="dotted";
    } else if (nombreR.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nombre").style.borderColor="red";
        document.getElementById("nombre").style.borderStyle="dotted";
        mensaje = mensaje.concat("El nombre del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombre").style.borderColor="green";
        document.getElementById("nombre").style.borderStyle="dotted";
        contador = contador + 1;
    }


    //Validado el campo apellido 1 de registrado
    var apellido1Registrado = document.getElementById("apellido1").value;
    var apellido1R = apellido1Registrado.toString();
    if (apellido1R == null || apellido1R == "") {
        mensaje = mensaje.concat("El campo Apellido 1 de registrado debe rellenarse" + '\n');
        document.getElementById("apellido1").style.borderColor="red";
        document.getElementById("apellido1").style.borderStyle="dotted";
    } else if (apellido1R.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("apellido1").style.borderColor="red";
        document.getElementById("apellido1").style.borderStyle="dotted";
        mensaje = mensaje.concat("El apellido 1 del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("apellido1").style.borderColor="green";
        document.getElementById("apellido1").style.borderStyle="dotted";
        contador = contador + 1;
    }
    //Valido el campo 'contrasena'
    var pwdUsuario = document.getElementById("clave1").value;
    var pwd = pwdUsuario.toString();
    if (pwd.match(/[^\w\d-.@$%&#€/¡!¿?ñÑáéíóúüçÁÉÍÓÚÇÜ]/g)|| pwd == null || pwd == ""){
        document.getElementById("clave1").style.borderColor="red";
        document.getElementById("clave1").style.borderStyle="dotted";
        mensaje = mensaje.concat("El campo Contraseña del proveedor no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
    } else {
        document.getElementById("clave1").style.borderColor="green";
        document.getElementById("clave1").style.borderStyle="dotted";
        contador = contador + 1;
    }
     
    //Valido el campo 'confirmar contrasena'
    var pwd2Usuario = document.getElementById("clave2").value;
    var pwd2 = pwd2Usuario.toString();
    if (pwd2.match(/[^\w\d-.@$%&#€/¡!¿?ñÑáéíóúüçÁÉÍÓÚÇÜ]/g)|| pwd == null || pwd == ""){
        document.getElementById("clave2").style.borderColor="red";
        document.getElementById("clave2").style.borderStyle="dotted";
        mensaje = mensaje.concat("El campo Contraseña del proveedor no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
    } else {
        document.getElementById("clave2").style.borderColor="green";
        document.getElementById("clave2").style.borderStyle="dotted";
        contador = contador + 1;
    }


 

     
    if(contador == 6){
        alert("Usuario registrado con éxito");
    } else{
        alert(mensaje);
        return false;
    }
}