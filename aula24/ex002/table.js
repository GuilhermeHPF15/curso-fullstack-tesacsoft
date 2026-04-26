//localStorage.clear();

let table = document.querySelector("table");
let save = document.querySelector("#save");
let name = document.querySelector("#name");
let color = document.querySelector("#color");
let flavor = document.querySelector("#flavor");
let origin = document.querySelector("#origin");
let searchBar = document.querySelector("#search");

function insertInto(object) {
    let newRow = document.createElement("tr");
    newRow.dataset.id = object.id;
    table.appendChild(newRow);
    Object.values(object).forEach(element => {
        let newData = document.createElement("td");
        newData.innerText = element;
        newRow.appendChild(newData);
    });
    let tdButtons = document.createElement("td");
    newRow.appendChild(tdButtons);
    let editButton = document.createElement("button");
    editButton.innerText = "Editar";
    tdButtons.appendChild(editButton);
    editButton.addEventListener("click", edit);
    let eraseButton = document.createElement("button");
    eraseButton.innerText = "Apagar";
    tdButtons.appendChild(eraseButton);
    eraseButton.addEventListener("click", erase);
}

function edit(event) {
    let row = event.target.closest("tr");
    let tdAll = row.querySelectorAll("td:not(:first-child, :last-child)");
    tdAll.forEach (td => {
        td.innerHTML = `<input type="text" value="${td.innerText}">`;
    });
    let tdParent = event.target.parentElement;
    let button1 = tdParent.querySelector("button:first-child");
    let button2 = tdParent.querySelector("button:nth-child(2)");
    button1.innerText = "Guardar";
    button1.style.backgroundColor = "blue";
    button1.removeEventListener("click", edit);
    button2.innerText = "Cancelar";
    button2.style.backgroundColor = "red";
    button2.removeEventListener("click", erase);
}   

function erase(event) {
    let row = event.target.closest("tr");
    let targetId = row.dataset.id;
    row.remove();
    let fruits = JSON.parse(localStorage.getItem("frutas"));
    let removeFruit = fruits.filter(fruit => fruit.id != targetId);
    localStorage.setItem("frutas", JSON.stringify(removeFruit));
}

save.addEventListener("click", () => {
    if (!name.value) return;
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
});

searchBar.addEventListener("input", () => {
    let rows = document.querySelectorAll("tr:not(:first-child)");
    rows.forEach(row => {
        let cells = row.querySelectorAll("td:not(:last-child)");
        let rowText = Array.from(cells).map(td => td.innerText).join(" ").toLowerCase();
        row.style.display = rowText.includes(searchBar.value.toLowerCase().trim()) ? "" : "none";
    });
});

if (localStorage.getItem("frutas")) {
    let getFruit = JSON.parse(localStorage.getItem("frutas"));
    getFruit.forEach(fruit => {
        insertInto(fruit);
    });
}
