let promise = new Promise((res,err)=>{
    let x = 0
    if(x == 0){
      res('Ok tudo certo')
    }
    else{
      err('alles kaput')
    }
 }) 

 function executar(){
    promise.then(
      data => showMessage(data),
      erro => showMessage(erro))
    //promisse.catch(erro => showMessage(erro))
 }

 function showMessage(message){
    document.getElementById('resultado').innerHTML = message
 }