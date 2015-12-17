function validarPerfil(){
    var contador = 0;
   // var mensaje = "";
	   
    //Validado el campo nick de registrado
    var nickRegistrado = document.getElementById("nickActual").value;
    var nickR = nickRegistrado.toString();
    if (nickR == null || nickR == "") {
       // mensaje = mensaje.concat("El campo Nick debe rellenarse" + '\n');
        document.getElementById("nickActual").style.borderColor="red";
        document.getElementById("nickActual").style.borderStyle="dotted";
		document.getElementById("labelNick").style.color="red";

    } else if (nickR.match(/[^a-zñÑA-Z\d-]/gi)){
        //mensaje = mensaje.concat("El Nick no puede contener símbolos, ni estar en blanco" + '\n');
        document.getElementById("nickActual").style.borderColor="red";
        document.getElementById("nickActual").style.borderStyle="dotted";   
		document.getElementById("labelNick").style.color="red";

    } else {
        document.getElementById("nickActual").style.borderColor="green";
        document.getElementById("nickActual").style.borderStyle="dotted";
		document.getElementById("labelNick").style.color="green";

        contador = contador + 1;
    }

    
  //Validado el campo nombre de registrado
    var nombreRegistrado = document.getElementById("nombreActual").value;
    var nombreR = nombreRegistrado.toString();
    if (nombreR == null || nombreR == "") {
        //mensaje = mensaje.concat("El campo Nombre de registrado debe rellenarse" + '\n');
        document.getElementById("nombreActual").style.borderColor="red";
        document.getElementById("nombreActual").style.borderStyle="dotted";
		document.getElementById("labelNombre").style.color="red";

    } else if (nombreR.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nombreActual").style.borderColor="red";
        document.getElementById("nombreActual").style.borderStyle="dotted";
		document.getElementById("labelNombre").style.color="red";

        //mensaje = mensaje.concat("El nombre del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombreActual").style.borderColor="green";
        document.getElementById("nombreActual").style.borderStyle="dotted";
		document.getElementById("labelNombre").style.color="green";

        contador = contador + 1;
    }

    
    //Validado el campo correo de registrado
    var correoRegistrado = document.getElementById("correoActual").value;
    var correoR = correoRegistrado.toString();
    if (!correoR.match(/\S+@\S+\.\S+/g)|| correoR == null || correoR == ""){
        document.getElementById("correoActual").style.borderColor="red";
        document.getElementById("correoActual").style.borderStyle="dotted";
		document.getElementById("labelCorreo").style.color="red";

     //   mensaje = mensaje.concat("El campo correo no puede permanecer vacío" + '\n');
    } else {
        document.getElementById("correoActual").style.borderColor="green";
        document.getElementById("correoActual").style.borderStyle="dotted";
		document.getElementById("labelCorreo").style.color="green";

        contador = contador + 1;
    }
       
    
    
    //Validado el campo apellido 1 de registrado
    var apellido1Registrado = document.getElementById("apellido1Actual").value;
    var apellido1R = apellido1Registrado.toString();
    if (apellido1R == null || apellido1R == "") {
        //mensaje = mensaje.concat("El campo Apellido 1 de registrado debe rellenarse" + '\n');
        document.getElementById("apellido1Actual").style.borderColor="red";
        document.getElementById("apellido1Actual").style.borderStyle="dotted";
		document.getElementById("labelApell").style.color="red";

    } else if (apellido1R.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("apellido1Actual").style.borderColor="red";
        document.getElementById("apellido1Actual").style.borderStyle="dotted";
		document.getElementById("labelApell").style.color="red";

        //mensaje = mensaje.concat("El apellido 1 del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("apellido1Actual").style.borderColor="green";
        document.getElementById("apellido1Actual").style.borderStyle="dotted";
        
		document.getElementById("labelApell").style.color="green";

        contador = contador + 1;
    }

   
    if(contador == 4){
        alert("Informacion modificada");
    } else{
        //alert(mensaje);
        return false;
    }
}