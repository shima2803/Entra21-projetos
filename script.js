//console.log(localStorage.getItem('teste'))
//let cesta = localStorage.getItem('cesta')
//console.log(cesta)

/* console.log(localStorage.getItem('teste'))
let cesta = JSON.parse(localStorage.getItem('cesta'))|| []
    cesta.map(f => console.log(f))*/

/*function gravar() {
    let nome = document.getElementById('nome').value.trim();
    if (nome === "") return;

    let contatos = localStorage.getItem('contatos');

    try {
        contatos = JSON.parse(contatos);
        if (!Array.isArray(contatos)) {
            contatos = [];
        }
    } catch (e) {
        contatos = [];
    }

    contatos.push(nome);
    localStorage.setItem('contatos', JSON.stringify(contatos));
    document.getElementById('nome').value = "";

    console.log("Nomes salvos:", contatos);*/
    function gravar() {
        //contatos
        let contatos = JSON.parse(localStorage.getItem('contatos')) || []
        contatos.push(document.getElementById('nome').value)
        localStorage.setItem('contatos', JSON.stringify(contatos))
    }