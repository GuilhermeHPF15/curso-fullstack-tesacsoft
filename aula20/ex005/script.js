let textBox = document.querySelector("input");
let n1 = document.querySelector("#n1");
let sinal = document.querySelector("#sinal");
let n2 = document.querySelector("#n2");
let final = false;

function MoM() {
    if (Number.isNaN(parseFloat(textBox.value))) C()
    textBox.value *= -1;
}

function CE() {
    if (Number.isNaN(parseFloat(textBox.value))) C()
    textBox.value = 0;
}

function C() {
    textBox.value = 0;
    n1.innerText = "";
    sinal.innerText = "";
    n2.innerText = "";
}

function del() {
    if (final) {
        C()
        final = false;
    } else {
        textBox.value = textBox.value.slice(0, -1);
        if (!textBox.value) textBox.value = 0;
    }
}

function introduzirDigito(valor) {
    if (final) {
        C()
        final = false;
    }
    if (valor === "." && textBox.value.includes(".")) return;
    if (textBox.value === "0" && valor !== ".") textBox.value = valor;
    else textBox.value += valor;
}

function introduzirSinal(tipoDaOperacao) {
    if (Number.isNaN(parseFloat(textBox.value))) return;
    if (final) {
        sinal.innerText = "";
        n2.innerText = "";
        final = false;
    } 
    if (sinal.innerText) {
        let resultado = operacao(parseFloat(n1.innerText), sinal.innerText, parseFloat(textBox.value));
        if (!isFinite(resultado)) {
            igual()
            return;
        } else n1.innerText = resultado
    } else n1.innerText = textBox.value;
    sinal.innerText = tipoDaOperacao;
    textBox.value = 0;
}

function operacao(n1, sinal, n2) {
    let resultado = 0;
    if (sinal === "/") resultado = n1 / n2;
    else if (sinal === "x") resultado = n1 * n2;
    else if (sinal === "-") resultado = n1 - n2;
    else if (sinal === "+") resultado = n1 + n2;
    if (!isFinite(resultado)) resultado = "Não é possível dividir por 0";
    return resultado;
}

function igual() {
    let resultado; 
    if (final) {
        resultado = operacao(parseFloat(textBox.value), sinal.innerText, parseFloat(n2.innerText));
        if (isNaN(resultado)) return;
        n1.innerText = textBox.value;
        textBox.value = resultado;
    } else {
        resultado = operacao(parseFloat(n1.innerText), sinal.innerText, parseFloat(textBox.value));
        if (!resultado) return;
        n2.innerText = textBox.value;
        textBox.value = resultado;
        final = true;
    }       
}
