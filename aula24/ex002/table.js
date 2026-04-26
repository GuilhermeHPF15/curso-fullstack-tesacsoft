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
    let rowCopy = row.cloneNode(true);
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
    button1.addEventListener("click", () => saveEdit(row));
    button2.innerText = "Cancelar";
    button2.style.backgroundColor = "red";
    button2.removeEventListener("click", erase);
    button2.addEventListener("click", () => cancelEdit(row, rowCopy));
}   

function saveEdit(editedRow) {
    let fruits = JSON.parse(localStorage.getItem("frutas"));
    let fruitIndex = fruits.findIndex(fruit => fruit.id == editedRow.dataset.id);
    let inputs = editedRow.querySelectorAll("input")
    newData = Array.from(inputs).map(input => input.value);
    fruits[fruitIndex].nome = newData[0];
    fruits[fruitIndex].cor = newData[1];
    fruits[fruitIndex].sabor = newData[2];
    fruits[fruitIndex].origem = newData[3];
    localStorage.setItem("frutas", JSON.stringify(fruits));
    let tds = editedRow.querySelectorAll("td:not(:first-child, :last-child)");
    tds.forEach((td, index) => {
        td.innerText = newData[index];
    })
    let tdButtons = editedRow.querySelector("td:last-child");
    let button1 = tdButtons.querySelector("button:first-child");
    let button2 = tdButtons.querySelector("button:nth-child(2)");
    let newButton1 = button1.cloneNode(true);
    button1.replaceWith(newButton1);
    newButton1.innerText = "Editar";
    newButton1.style.backgroundColor = "#4CAF50";
    newButton1.addEventListener("click", edit);
    let newButton2 = button2.cloneNode(true);
    button2.replaceWith(newButton2);
    newButton2.innerText = "Apagar";
    newButton2.style.backgroundColor = "#4CAF50";
    newButton2.addEventListener("click", erase);
}

function cancelEdit(editedRow, originalRow) {
    editedRow.replaceWith(originalRow);
    originalRow.querySelector("button:first-child").addEventListener("click", edit);
    originalRow.querySelector("button:nth-child(2)").addEventListener("click", erase);
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
