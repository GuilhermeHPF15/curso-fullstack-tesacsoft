let table = document.querySelector("table");
let button = document.querySelector("button");
let name = document.querySelector("#name");
let color = document.querySelector("#color");
let flavor = document.querySelector("#flavor");
let origin = document.querySelector("#origin");

if (localStorage.getItem("frutas")) {
    let printFruit = JSON.parse(localStorage.getItem("frutas"));
    printFruit.forEach(fruit => {
        let newRow = document.createElement("tr");
        table.appendChild(newRow);
        Object.values(fruit).forEach(fruitElement => {
            newData = document.createElement("td");
            newData.innerText = fruitElement;
            newRow.appendChild(newData);
        })
    });
}

function submit() {
    let fruit = {id: Date.now(), nome: name.value, cor: color.value, sabor: flavor.value, origem: origin.value};
    if (!localStorage.getItem("frutas")) {
        let fruitArray = []
        fruitArray.push(fruit);
        localStorage.setItem("frutas", JSON.stringify(fruitArray));
    } else {
        let getFruit = JSON.parse(localStorage.getItem("frutas"));
        getFruit.push(fruit);
        localStorage.setItem("frutas", JSON.stringify(getFruit));
    }
    table.innerHTML += `<tr><td>${fruit["id"]}</td><td>${fruit["nome"]}</td><td>${fruit["cor"]}</td><td>${fruit["sabor"]}</td><td>${fruit["origin"]}</td><td><button>Apagar</button></td></tr>`
}

//localStorage.clear();