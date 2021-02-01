//dropdownlist que permite la carga de los años.
function ComboAno(){
    var select = document.getElementById("ano");
    for(var i = 2010; i<=2050; i++)select.options.add(new Option(i,i)); 
 };


//carga la fecha actual al textbox.
 function cargarfecha(){
   var hoy= new Date();
   var fecha = hoy.getDate() + '/' + ( hoy.getMonth() + 1 ) + '/' + hoy.getFullYear();
   document.getElementById("fechaactual").value=fecha;
   

}

//valida los campos relacionados con el monto y el rut.
function validar(){
var monto = document.getElementById("monto").value;
var rut=  document.getElementById("rut").value;
    if( monto =="" || rut ==""){
        alert("Debe ingresar todos los campos!");

    }
    else{
        if(isNaN(monto) || monto<=0 || monto>99999999){
            alert("Ingrese un monto válido entre 1 y 99999999");
   
        }
        else{
            alert("Todos los campos estan correctos!");
            
        }
    }
}

//esta funcion permite cargar las demas fuciones en forma ordenada.
function iniciar(){
    ComboAno();
    cargarfecha();
}
window.onload= iniciar;
 
//Funcion para cambiar el input text
function comprueba(obj) {
    if (obj.value=='') {
        if (document.getElementById) {
            obj.style.backgroundColor = '#F2D7D5';
            obj.style.border= "1px solid #f00";
            
        }
    } else {
        if (document.getElementById) {
            obj.style.backgroundColor = '#FFFFFF';
            obj.style.border= "1px solid #17202A";
        }
    }
}