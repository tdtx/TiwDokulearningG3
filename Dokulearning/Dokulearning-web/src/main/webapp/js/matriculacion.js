/**
 * 
 */

$(document).ready(function(){
    /*$(function() {
        $("#fecha").datepicker({ //calendario de la fecha de nacimiento
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
    
    $("#txtTelefono").removeClass("error");
    if (($("#telefono").val() == "") || ($("#telefono").val() == undefined) || ($("#telefono").val().length !=9)){
        $("#txtTelefono").addClass("error");
        mensaje.push("Debe indicar su telefono");
    }

    $("#txtGenero").removeClass("error");
    if (($("#genero").val() == "") || ($("#telefono").val() == undefined)){
    	$("#txtGenero").addClass("error");
        mensaje.push("Debe seleccionar su genero");
    }
    
    $("#txtCalle").removeClass("error");
    if (($("#calle").val() == "") || ($("#calle").val() == undefined)){
        $("#txtCalle").addClass("error");
        mensaje.push("Debe indicar su calle");
    }
    
    $("#txtLocalidad").removeClass("error");
    if (($("#localidad").val() == "") || ($("#localidad").val() == undefined)){
        $("#txtLocalidad").addClass("error");
        mensaje.push("Debe indicar su localidad");
    }
    
    $("#txtCodigoPostal").removeClass("error");
    if (($("#codigopostal").val() == "") || ($("#codigopostal").val() == undefined) || ($("#codigopostal").val().length <3)){
        $("#txtCodigoPostal").addClass("error");
        mensaje.push("Debe indicar su codigo postal");
    }
    
    $("#txtProvincia").removeClass("error");
    if (($("#provincia").val() == "") || ($("#provincia").val() == undefined) ){
        $("#txtProvincia").addClass("error");
        mensaje.push("Debe indicar su provincia");
    }
    
    
    $("#txtFormaPago").removeClass("error");
    if (($("#formaPago").val() == "") || ($("#formaPago").val() == undefined)){
    	$("#txtFormaPago").addClass("error");
        mensaje.push("Debe seleccionar la forma de pago");
    }
    
    $("#txtDNI").removeClass("error");
    if (($("#DNI").val() == "") || ($("#DNI").val() == undefined) || ($("#DNI").val().length<9)){
        $("#txtDNI").addClass("error");
        mensaje.push("Debe indicar su DNI");
    }
    
    $("#txtAceptar").removeClass("error");
    if (!$("#aceptar").is(':checked')){
        $("#txtAceptar").addClass("error");
        mensaje.push("Debe aceptar los terminos y las condiciones de uso");
    }
    
    if (mensaje == ""){ //No hay error
    	    $("#formularioMat").submit();
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