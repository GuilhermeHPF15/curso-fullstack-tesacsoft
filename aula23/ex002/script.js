let fruit = {
    nome: "Manga",
    cor: "Amarela",
    sabor: "Doce",
    origem: "Brasil"
};

console.log(fruit.nome);

let carro = {
    marca: "Tesla",
    cor: "Amarelo",
    fábrica: "Tesla",
    origem: "Brasil",
    acelerar: function() {console.log("VOCÊ ACELEROU O CARRO!")},
    parar: function() {console.log("VOCÊ PAROU O CARRO!")}
};

carro.acelerar();
carro.parar();

let fruits = [
    {nome: "Manga", cor: "Amarela"},
    {nome: "Laranja", cor: "Laranja"}
];

let fruitsJSON = JSON.stringify(fruits);
console.log(fruitsJSON);

let fruitsObject = JSON.parse(fruitsJSON);
console.log(fruitsObject[0].nome);
