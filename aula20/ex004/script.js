function acender() {
    setTimeout(() => document.querySelector("#imagem").src = "on.jpeg", 3000);
}

function apagar() {
   setTimeout(() => document.querySelector("#imagem").src = "off.jpeg", 3000);
}

document.querySelector("#on").addEventListener("click", acender);
document.querySelector("#off").addEventListener("click", apagar);