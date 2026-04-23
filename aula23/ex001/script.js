let numbers = [1, 2, 3, 4];
let fruits = ["Manga", "Laranja", "Uva", "Limão", "Morango"];

alert(fruits[2]);
console.log(fruits.length);

/*
for (let i = 0; i < fruits.length; i++) console.log(`Na posição ${i} está a fruta ${fruits[i]}`);
*/

fruits.forEach((fruit, key) => {
    console.log(`Na posição ${key} está a fruta ${fruit}`);
})

//Filter só funciona com itens string
let fruitsWithA = fruits.filter(fruit => fruit.startsWith("L"));
let laranja = fruits.filter(fruit => fruit === "Laranja");
let fruitEndsWithO = fruits.filter(fruit => fruit.endsWith("o"));
console.log(fruitsWithA);
console.log(laranja);
console.log(fruitEndsWithO);

let upperCase = fruits.map(fruit => fruit.toUpperCase());
console.log(upperCase);

function teste(valor) {
    valor = valor.toUpperCase();
    return valor;
}

let upperCase2 = fruits.map(fruit => teste(fruit));
console.log(upperCase);

fruits.push("Abacaxi");