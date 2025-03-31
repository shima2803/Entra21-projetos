document.getElementById("clienteForm").addEventListener("submit", function(event) {
    event.preventDefault();
    
    let nome = document.getElementById("nome").value;
    let email = document.getElementById("email").value;
    
    let clientes = JSON.parse(localStorage.getItem("clientes")) || [];
    clientes.push({ nome, email });
    localStorage.setItem("clientes", JSON.stringify(clientes));
    
    alert("Cliente cadastrado com sucesso!");
    document.getElementById("clienteForm").reset();
});
