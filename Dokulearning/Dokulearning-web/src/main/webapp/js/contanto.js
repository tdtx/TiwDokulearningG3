function validarR(formulario){
    var contador = 0;
    var mensaje = "";

	 
    //Validado el campo nombre de registrado
    var nombreRegistrado = document.getElementById("nombreJ").value;
    var nombreR = nombreRegistrado.toString();
    if (nombreR == null || nombreR == "") {
        mensaje = mensaje.concat("El campo Nombre debe rellenarse" + '\n');
        document.getElementById("nombreJ").style.borderColor="red";
        document.getElementById("nombreJ").style.borderStyle="dotted";
    } else if (nombreR.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nombreJ").style.borderColor="red";
        document.getElementById("nombreJ").style.borderStyle="dotted";
        mensaje = mensaje.concat("El nombre no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombreJ").style.borderColor="green";
        document.getElementById("nombreJ").style.borderStyle="dotted";
        contador = contador + 1;
    }


    //Validado el campo correo de registrado
    var correoRegistrado = document.getElementById("email").value;
    var correoR = correoRegistrado.toString();
    if (correoR.match(/[^\w\d.@-_ñÑ&#/]/g)|| correoR == null || correoR == ""){
        document.getElementById("email").style.borderColor="red";
        document.getElementById("email").style.borderStyle="dotted";
        mensaje = mensaje.concat("El campo correo no puede permanecer vacío" + '\n');
    } else {
        document.getElementById("email").style.borderColor="green";
        document.getElementById("email").style.borderStyle="dotted";
        contador = contador + 1;
    }
           

   
    
  //Validado el campo nick de registrado
    var nickRegistrado = document.getElementById("mensajee").value;
    var nickR = nickRegistrado.toString();
    if (nickR == null || nickR == "") {
        mensaje = mensaje.concat("El mensaje debe rellenarse" + '\n');
        document.getElementById("mensajee").style.borderColor="red";
        document.getElementById("mensajee").style.borderStyle="dotted";
    } else if (nickR.match(/[^a-zñÑA-Z\d-]/gi)){
        mensaje = mensaje.concat("El mensaje no puede contener símbolos, ni estar en blanco" + '\n');
        document.getElementById("mensajee").style.borderColor="red";
        document.getElementById("mensajee").style.borderStyle="dotted";      
    } else {
        document.getElementById("mensajee").style.borderColor="green";
        document.getElementById("mensajee").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
     
    if(contador == 3){
        alert("El mensaje se ha enviado con éxito");
        
    } else{
        alert(mensaje);
        return false;
    }
}