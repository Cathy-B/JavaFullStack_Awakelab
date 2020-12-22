/**
 * Funciones para validar formulario de listado accidentes
 */
$(document).ready(function () {

    $("#fecha_accidente").datepicker();
    
    $("#hora_accidente").datetimepicker({
        datepicker:false,
        format:'H:i'
    });

    $("#btnvalidar").click(function () {

        $("#formaccidente").validate({
            rules: {
                id_accidente: {
                    required: true,
                    digits: true,
                    min: 1,
                    max: 1000

                },
                fecha_accidente: {
                    required: true
                },
                hora_accidente: {
                    required: true
                },
                lugar: {
                    required: true,
                    minlength: 0,
                    maxlength: 150
                },
                origen: {
                    required: true,
		            minlength: 0,
                    maxlength: 100
                  
                },
                cliente: {
                    required: true
                },
                consecuencias: {
		            minlength: 0,
                    maxlength: 100
                }
               
            },
            messages: {
                id_accidente: {
                    required: "Debe ingresar una id",
                    digits: "El campo debe ser numérico",
                    min: "El campo debe ser mayor a 0",
                    max: "El campo debe ser menor a 1000"
                },
                fecha_accidente: {
                    required: "Debe ingresar la fecha del accidente"
                },
                hora_accidente: {
                    required: "Debe ingresar la hora del accidente"
                },
                lugar: {
                    required: "Debe ingresar el lugar",
                    minlength:"Debe ingresar ingresar más de 1 carácter en el campo",
                    maxlength:"El nombre debe ser menor a 150 carácteres"
                },
                origen: {
                    required: "Debe ingresar el origen",
                    minlength:"Debe ingresar ingresar más de 1 carácter en el campo",
                    maxlength:"El nombre debe ser menor a 100 carácteres"
                },
                cliente: {
                    required: "Debe seleccionar un cliente"
                },
                consecuencias: {
		            minlength:"Debe ingresar ingresar más de 1 carácter en el campo",
                    maxlength:"El nombre debe ser menor a 100 carácteres"
                },

            }
        });

    });

});