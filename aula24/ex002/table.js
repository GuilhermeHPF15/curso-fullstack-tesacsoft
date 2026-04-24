let table = document.querySelector("table");
let button = document.querySelector("button");
let name = document.querySelector("#name");
let color = document.querySelector("#color");
let flavor = document.querySelector("#flavor");
let origin = document.querySelector("#origin");

function insertInto(object) {
    let newRow = document.createElement("tr");
    newRow.dataset.id = object.id;
    table.appendChild(newRow);
    Object.values(object).forEach(element => {
        let newData = document.createElement("td");
        newData.innerText = element;
        newRow.appendChild(newData);
    });
    let tdButton = document.createElement("td");
    newRow.appendChild(tdButton);
    let button = document.createElement("button");
    button.innerText = "Apagar";
    tdButton.appendChild(button);
    button.addEventListener("click", erase);
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
        fruit["id"] = getFruit.length > 0 ? getFruit[getFruit.length -1]["id"] + 1 : 1;
        getFruit.push(fruit);
        localStorage.setItem("frutas", JSON.stringify(getFruit));
    }
        insertInto(fruit);
        name.value = color.value = flavor.value = origin.value = "";
}

function erase(event) {
    let row = event.target.closest("tr");
    let targetId = row.dataset.id;
    row.remove();
    let fruits = JSON.parse(localStorage.getItem("frutas"));
    let removeFruit = fruits.filter(fruit => fruit.id != targetId);
    localStorage.setItem("frutas", JSON.stringify(removeFruit));
}

//localStorage.clear();

if (localStorage.getItem("frutas")) {
    let getFruit = JSON.parse(localStorage.getItem("frutas"));
    getFruit.forEach(fruit => {
        insertInto(fruit);
    });
}
