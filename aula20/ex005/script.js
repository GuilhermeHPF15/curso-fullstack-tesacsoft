let textBox = document.querySelector("input");
let p = document.querySelector("p");
let sinal = document.querySelector("#sinal");

function enterNumber(valor) {
    textBox.value += valor;
}

function operacao(acao) {
    p.innerText = textBox.value;
        if (acao == "soma") {
            let valor = textBox.value;
            textBox.value = "0";
            sinal.innerText = "+";
        }
}

function igual() {
    let resultado = 0;
    if (sinal.innerText == "+") {
        resultado = parseFloat(p.innerText) + parseFloat(textBox.value);
    } else if (sinal.innerText == "-") {
        resultado = parseFloat(p.innerText) - parseFloat(textBox.value);
    } else if (sinal.innerText == "x") {
        resultado = parseFloat(p.innerText) * parseFloat(textBox.value);
    } else if (sinal.innerText == "/") {
        resultado = parseFloat(p.innerText) / parseFloat(textBox.value);
    }

    textBox.value = resultado;
    p.innerText = "";
}