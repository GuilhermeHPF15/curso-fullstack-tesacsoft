document.querySelector("#on").addEventListener("click", ligarLuz);
document.querySelector("#off").addEventListener("click", apagarLuz);

function ligarLuz() {
    document.querySelector("#imagem").src = "on.jpeg"
}

function apagarLuz() {
    document.querySelector("#imagem").src = "off.jpeg"
}