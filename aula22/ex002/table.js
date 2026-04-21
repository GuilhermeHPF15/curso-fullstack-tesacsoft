let table = document.querySelector("table");
let button = document.querySelector("button");
let fruit = document.querySelector("#fruta");
let color = document.querySelector("#cor");
let flavor = document.querySelector("#sabor");
let origin = document.querySelector("#origem");

function submit() {
    let newRow = document.createElement("tr");
    newRow.innerHTML = `<td>${fruit.value}</td><td>${color.value}</td><td>${flavor.value}</td><td>${origin.value}</td>`
    document.querySelector("table").appendChild(newRow);
}
