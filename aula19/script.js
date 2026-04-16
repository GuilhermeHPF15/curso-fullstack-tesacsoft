let saudar = (a,b) => a+b;

//alert(saudar(23,34));

let numeros = [1, 2, 3, 4, 5];
numeros.forEach((numero) => {
    console.log(numero);
});

let numeros2 = [1, 2, 3, 4, 5];
numeros.forEach((numero, indice) => {
    console.log(`${numero} na posição ${indice}`);
});

function mudarCor() {
    let botao = document.querySelector("#botao1");
    botao.style.backgroundColor = "blue";
}