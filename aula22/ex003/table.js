let table = document.querySelector("table");
let button = document.querySelector("button");
let fruit = document.querySelector("#fruta");
let color = document.querySelector("#cor");
let flavor = document.querySelector("#sabor");
let origin = document.querySelector("#origem");

function submit() {
    let newRow = document.createElement("tr")
    let tdFruit = document.createElement("td");
    let tdColor = document.createElement("td");
    let tdFlavor = document.createElement("td");
    let tdOrigin = document.createElement("td");
    tdFruit.innerText = fruit.value;
    tdColor.innerText = color.value;
    tdFlavor.innerText = flavor.value;
    tdOrigin.innerText = origin.value;
    document.querySelector("table").appendChild(newRow);
    newRow.appendChild(tdFruit);
    newRow.appendChild(tdColor);
    newRow.appendChild(tdFlavor);
    newRow.appendChild(tdOrigin);
}
