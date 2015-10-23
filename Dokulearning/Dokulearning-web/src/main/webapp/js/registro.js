/**
 * 
 */
$(document).ready(function(){
    /*$(function() {
        $("#fechaNacimiento").datepicker({ //calendario de la fecha de nacimiento
            dateFormat: "dd/mm/yyyy",
            dayNamesMin: [ "Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sá" ] ,
            firstDay: 1,
            monthNames: [ "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
        });
    });
    $("#sexo").selectmenu().selectmenu("menuWidget").addClass("camposFormulario");
    $(document).tooltip();*/
    $("#btnEnviar").button().click(function(){ comprobarFormulario(); }); //comprobarFormulario);
    		
    

});


function comprobarFormulario(){//comprobacion de los campos del formulario con sus alerts como en la practica anterior
    var mensaje = new Array();

    $("#lblnick").removeClass("error");
    if (($("#nick").val() == "") || ($("#nick").val() == undefined)){
        $("#lblnick").addClass("error");
        mensaje.push("Debe indicar su nombre");
    }
    

    $("#lblnombre").removeClass("error");
    if (($("#nombre").val() == "") || ($("#nombre").val() == undefined)){
        $("#lblnombre").addClass("error");
        mensaje.push("Debe indicar su nombre");
    }
    
    $("#lblapellido1").removeClass("error");
    if (($("#apellido1").val() == "") || ($("#apellido1").val() == undefined)){
        $("#lblapellido1").addClass("error");
        mensaje.push("Debe indicar su primer apellido");
    }
    
    $("#lblcorreo").removeClass("error");
    if (($("#correo").val() == "") || ($("#correo").val() == undefined)){
        $("#lblcorreo").addClass("error");
        mensaje.push("Debe indicar su dirección de correo electrónico");
    }
    else{
        var patron = new RegExp(/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/);
        if(!patron.test($("#correo").val())){
            $("#lblcorreo").addClass("error");
            mensaje.push("Debe indicar una dirección de correo electrónico válida:aaa@bbb.ccc");
        }
    }
      
    $("#lblclave1").removeClass("error");
    if (($("#clave1").val() == "") || ($("#clave1").val() == undefined)){
        $("#lblclave1").addClass("error");
        mensaje.push("Debe indicar su clave de usuario");
    }
    else if($("#clave1").val().length < 8){
            $("#lblclave1").addClass("error");
            mensaje.push("La clave tiene que tener minimo 8 caracteres");
    }
    

    $("#lblclave2").removeClass("error");
    if($("#clave2").val() != $("#clave1").val()){
        $("#lblclave2").addClass("error");
        mensaje.push("Las claves de usuario no coinciden");
    }

    
    
    $("#lblterminos").removeClass("error");
    if (!$("#terminos").is(':checked')){
        $("#lblterminos").addClass("error");
        mensaje.push("Debe aceptar los terminos y las condiciones de uso");
    }
    
    $("#lblmayoredad").removeClass("error");
    if (!$("#mayoredad").is(':checked')){
        $("#lblmayoredad").addClass("error");
        mensaje.push("Debe ser mayor de edad");
    }
    
    
    
    

    if (mensaje == ""){ //No hay error
    	    $("#reg").submit();
    }
    else{
        
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
}