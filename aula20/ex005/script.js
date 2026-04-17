let textBox = document.querySelector("input");
let p = document.querySelector("#n1");
let p2 = document.querySelector("#n2");
let sinal = document.querySelector("#sinal");
let resultado = 0;
let final = false;

function MoM() {
    textBox.value *= -1;
}

function CE() {
    textBox.value = 0;
}

function C() {
    textBox.value = 0;
    p.innerText = "";
    p2.innerText = "";
    sinal.innerText = "";
}

function del() {
    textBox.value = textBox.value.slice(0, -1);
}

function enterNumber(valor) {
    if (final) {
        p.innerText = "";
        p2.innerText = "";
        sinal.innerText = "";
        textBox.value = "0";
        final = false;
    }

    if (textBox.value == 0) {
        textBox.value = valor;
    } else {
        textBox.value += valor;
    }
}

function operacao(acao) {
    if (final) {
        p.innerText = textBox.value;
        p2.innerText = "";
        sinal.innerText = "";
        final = false;
    }

    if (sinal.innerText == "") {
        resultado = parseFloat(textBox.value);
    }

    else if (sinal.innerText == "+") {
        resultado = parseFloat(textBox.value) + parseFloat(p.innerText);
    }

    else if (sinal.innerText == "-") {
        if (p.innerText == 0) {
            resultado = parseFloat(textBox.value) - parseFloat(p.innerText);
        } else {
            resultado = parseFloat(p.innerText) - parseFloat(textBox.value);
        }
    }

    else if (sinal.innerText == "x") {
        if (p.innerText == 0) {
            resultado = parseFloat(textBox.value) * 1;
        } else {
            resultado = parseFloat(p.innerText) * parseFloat(textBox.value);
        }
    }

    else if (sinal.innerText == "/") {
        if (p.innerText == 0) {
            resultado = parseFloat(textBox.value) / 1;
        } else {
            resultado = parseFloat(p.innerText) / parseFloat(textBox.value);
        }
    }

    p.innerText = resultado;
    textBox.value = "0";
    
    if (acao == "soma") {
        sinal.innerText = "+";
    }

    if (acao == "sub") {
        sinal.innerText = "-";
    }
    
    if (acao == "mult") {
        sinal.innerText = "x";
    }

    if (acao == "div") {
        sinal.innerText = "/";
    }
}

function igual() {
    if (final) {
        p.innerText = textBox.value;

        if (sinal.innerText == "+") {
            resultado = parseFloat(textBox.value) + parseFloat(p2.innerText);
        } else if (sinal.innerText == "-") {
            resultado = parseFloat(textBox.value) - parseFloat(p2.innerText);
        } else if (sinal.innerText == "x") {
            resultado = parseFloat(textBox.value) * parseFloat(p2.innerText);
        } else if (sinal.innerText == "/") {
            resultado = parseFloat(textBox.value) / parseFloat(p2.innerText);
        }

        textBox.value = resultado;
    } else {
        if (sinal.innerText == "+") {
            resultado = parseFloat(p.innerText) + parseFloat(textBox.value);
        } else if (sinal.innerText == "-") {
            resultado = parseFloat(p.innerText) - parseFloat(textBox.value);
        } else if (sinal.innerText == "x") {
            resultado = parseFloat(p.innerText) * parseFloat(textBox.value);
        } else if (sinal.innerText == "/") {
            resultado = parseFloat(p.innerText) / parseFloat(textBox.value);
        }

        p2.innerText += textBox.value;
        textBox.value = resultado;
        final = true;
    }
}