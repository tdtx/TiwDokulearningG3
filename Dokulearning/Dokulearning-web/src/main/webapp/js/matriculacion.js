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
        alert(mensaje);

    	/*$("#ulErroresEnPagina").empty();
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
*/
    }
}