/**Funciones que permiten desplegar lista de mejoras en listado asesoria junto con botones que
 * permiten cambiar su apariencia
*/
$(document).ready(function () {
            
    $("#desplegar1").click(function () {
        $("#lista1").css("display", "block");
    });

    $("#desplegar2").click(function () {
        $("#lista2").css("display", "block");
    });

    $("#btn1").click(function(){
        $("th").css({'background-color':'#A9DFBF','border-top': '4px solid #48C9B0','border-bottom': '1px solid #F8F9F9'});
        $("td").css({'background-color':'#D1F2EB','border-top': '2px solid #48C9B0','border-bottom': '1px solid #F8F9F9'});
    });

    $("#btn2").click(function(){
        $("th").css({'background-color':'#C39BD3','border-top': '4px solid #8E44AD','border-bottom': '1px solid #F8F9F9'});
        $("td").css({'background-color':'#EBDEF0','border-top': '2px solid #8E44AD','border-bottom': '1px solid #F8F9F9'});
    });

    $("#btn3").click(function(){
        $("table").css({'font-family':'Arial, Helvetica, sans-serif','width': '800px'});
        $("th").css({'background-color':'#D5D8DC'});
        $("td").css({'background-color':'#D5D8DC'});
    });
});

