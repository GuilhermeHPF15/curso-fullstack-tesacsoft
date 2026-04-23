//CRUD
localStorage.setItem('chave','valor') //Guardar dados no LocalStorage (se existir altera o valor)

localStorage.getItem('chave') //Pegar dados no LocalStorage

localStorage.removeItem('chave') //Remover dados no LocalStorage

localStorage.clear() //Limpar tudo do LocalStorage

/* Para guardar listas no localStorage, você precisa lembrar que ele só aceita strings. Por isso usamos o JSON para converter arrays ou objetos em texto antes de salvar, e depois reconverter quando for usar. Se não fizermos ele salva apenas como uma string */

let frutas=['banana', 'manga', 'abacate']

//Inserir Lista no localStorage Transformando ela em String primeiro:

localStorage.setItem("frutas", JSON.stringify(frutas));

//Buscar a Lista de frutas no LocalStorage e transforma-las em array:

let pegarFrutas = JSON.parse(localStorage.getItem("frutas"))
console.log(pegarFrutas)

//Deletar dados no LocalStorage
localStorage.removeItem("frutas");

//Apagar tudo no Local Storage:
localStorage.clear();