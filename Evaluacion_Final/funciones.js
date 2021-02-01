/**
 * Funciones para agregar reportes a través de diferentes graficos en la pagina reportes 
 */
//Grafico de barras
var ctx = document.getElementById('grafico');
var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ['Santiago', 'La Florida', 'Maipú', 'Recoleta', 'Ñuñoa', 'Independencia'],
            datasets: [{
                label: 'Número de Clientes por Comuna',
                data: [12, 19, 3, 5, 2, 3],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }]
        }
    }
});

//Grafico de Lineas y puntos
var ctx2 = document.getElementById('grafico2');
var dataFirst = {
    label: "Cantidad de Visitas",
    data: [3, 19, 25, 20, 2, 5, 8, 22, 45, 33, 27, 10],
    //lineTension: 0.3,
    lineTension: 0,
    fill: false,
    borderColor: 'blue ',
    backgroundColor: 'transparent',
    borderDash: [5, 5],
    pointBorderColor: 'blue',
    pointBackgroundColor: 'blue',
    pointRadius: 5,
    pointHoverRadius: 10,
    pointHitRadius: 30,
    pointBorderWidth: 2,
    pointStyle: 'rectRounded'
   
};

var dataSecond = {
    label: "Cantidad de Accidentes",
    data: [20, 15, 17, 4, 10, 30, 1, 10, 5, 25, 34, 17],
    lineTension: 0,
    fill: false,
    borderColor: 'red',
    backgroundColor: 'transparent',
    borderDash: [5, 5],
    pointBorderColor: 'red',
    pointBackgroundColor: 'red',
    pointRadius: 5,
    pointHoverRadius: 10,
    pointHitRadius: 30,
    pointBorderWidth: 2,
    pointStyle: 'rectRounded'
    
};

var info = {
    labels: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"],
    datasets: [dataFirst, dataSecond]
};

var lineChart = new Chart(ctx2, {
    type: 'line',
    data: info,
    options:{
        responsive: true,
        maintainAspectRatio: false
    }
});

//Grafico de area
var ctx3 = document.getElementById('grafico3');
var contenido = {
    labels: [
        "Chequeos Cumplidos",
        "Chequeos No Cumplidos",
        "Chequeos Cumplidos con Observaciones"
    ],
    datasets: [
        {
            data: [4, 4, 2],
            backgroundColor: [
                "#00CC00",
                "#D98880",
                "#AED6F1"
            ]
        }]
};

var pieChart = new Chart(ctx3, {
    type: 'pie',
    data: contenido,
    options: {
        responsive: true,
        maintainAspectRatio: false
    }
});