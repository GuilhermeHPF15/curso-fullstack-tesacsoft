let variable = "Bonito"
localStorage.setItem("frase", "Hello World!");
localStorage.setItem("Frase", "Batata");
localStorage.setItem("adjetivo", variable);
item = localStorage.getItem("frase");

console.log(item);

localStorage.removeItem("Frase");
//localStorage.clear();

let fruits = ["banana", "manga", "abacate"]
fruitsJSON = ("frutas", JSON.stringify(fruits));
localStorage.setItem("frutas", (fruitsJSON));
let fruitsArray = JSON.parse(localStorage.getItem("frutas"));
console.log(fruitsArray);
console.log(typeof(fruitsArray));
