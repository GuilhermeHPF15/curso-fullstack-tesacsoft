let table = document.querySelector("table");
let button = document.querySelector("button");
let name = document.querySelector("#name");
let color = document.querySelector("#color");
let flavor = document.querySelector("#flavor");
let origin = document.querySelector("#origin");

function insertInto(object) {
    let newRow = document.createElement("tr");
        table.appendChild(newRow);
        Object.values(object).forEach(element => {
            let newData = document.createElement("td");
            newData.innerText = element;
            newRow.appendChild(newData);
        });
}

if (localStorage.getItem("frutas")) {
    let getFruit = JSON.parse(localStorage.getItem("frutas"));
    getFruit.forEach(fruit => {
        insertInto(fruit);
    });
}

function submit() {
    let fruitArray = []
    let fruit = {id: 0, nome: name.value, cor: color.value, sabor: flavor.value, origem: origin.value};
    if (!localStorage.getItem("frutas")) {
        fruit["id"] = 1;
        fruitArray.push(fruit);
        localStorage.setItem("frutas", JSON.stringify(fruitArray));
    } else {
        let getFruit = JSON.parse(localStorage.getItem("frutas"));
        fruit["id"] = getFruit.length + 1;
        getFruit.push(fruit);
        localStorage.setItem("frutas", JSON.stringify(getFruit));
    }
        insertInto(fruit);
        name.value = color.value = flavor.value = origin.value = "";
}

//localStorage.clear();