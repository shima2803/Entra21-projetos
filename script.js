var listaContatos = [
    { nome: 'Ana', idade: 18, email: 'ana@gmail.com', fone: '(47)99090-7060' },
    { nome: 'Maria', idade: 18, email: 'maria@gmail.com', fone: '(47)99090-7060' },
    { nome: 'Joao', idade: 18, email: 'joao@gmail.com', fone: '(47)99090-7060' },
    { nome: 'Jose', idade: 18, email: 'jose@gmail.com', fone: '(47)99090-7060' }
];

function listarEmTabela() {
    listaContatos.forEach(contato => show(contato));
}

function show(contato) {
    const linha = `<tr>
        <td>${contato.nome}</td>
        <td>${contato.email}</td>
        <td>${contato.idade}</td>
        <td>${contato.fone}</td>
    </tr>`;

    document.getElementById('dados').innerHTML += linha;
}