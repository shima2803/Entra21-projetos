console.log(localStorage.getItem('teste'))
let cesta = JSON.parse(localStorage.getItem('cesta'))|| []
 cesta.map(f => console.log(f))