function loadLogradouro(cep){
    fetch(`http://viacep.com.br/ws/${cep}/json`)
    .then(data => data.json())
    .then(res => {
        console.log(res)
    console.log(res.logradouro)
})    
}
loadLogradouro('89062256')