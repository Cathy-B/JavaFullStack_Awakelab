/**
 * Funciones para validar formulario de pagina administrar asistentes
 */
$(document).ready(function () {


    $("#btnvalidar").click(function () {

        $("#frmcrearid").validate({
            rules: {
                id_asistente: {
                    required: true,
                    digits: true,
                    min: 1,
                    max: 10000

                },
                Nombre_asistente: {
                    required: true,
                    minlength:1,
                    maxlength:100
                },
                edad_asistente: {
                    required: true,
                    digits: true,
                    min: 1,
                    max: 150
                },
                correo_asistente: {
                    required: true,
                    email: true
                },
                telefono_asistente: {
                    required: true,
                    number: true,
		            minlength: 8,
                    maxlength: 8
                  
                }
               
            },
            messages: {
                id_asistente: {
                    required: "Debe ingresar una id",
                    digits: "El campo debe ser numérico",
                    min: "El campo debe ser mayor a 0",
                    max: "El campo debe ser menor a 10000"
                },
                Nombre_asistente: {
                    required: "Debe ingresar su nombre completo",
                    minlength:"Debe ingresar ingresar mas de 1 caracter en el campo",
                    maxlength:"El nombre debe ser menor a 100  caracteres"
                },
                edad_asistente: {
                    required: "Debe ingresar una edad",
                    digits: "Solo debe ingresar numeros",
                    min: "Debe ser mayor a 0",
                    max: "Debe ser menor a 150"
                },
                correo_asistente: {
                    required: "Debe ingresar su correo electronico",
                    email: "Debe ingresar un correo electronico valido"
                },
                telefono_asistente: {
                    required: "Debe ingresar su telefono",
                    number: "Debe ingresar solo numeros",
		            minlength: "Minimo 8 digitos",
                    maxlength: "Maximo 8 digitos"
                },

            }
        });

    });

});






