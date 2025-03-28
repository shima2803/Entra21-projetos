const cars = ['opala', 'fusca', 'TL']
        cars.push('kombi')//Add no final
        cars.unshift('motoca')//Add em 1º
        //cars.shift()//remove o 1º
        document.getElementById('garagem').innerHTML = cars.toString()
        listar()
        function ativarBotao(){
            document.getElementsByTagName('button')[0].disabled = document.getElementById('onde').value
        }
        function listar(){
            itemLista = ''
        for (let index = 0; index < cars.length; index++) {
            itemLista += '<li>' + cars[index] + '</li>'
        }
        document.getElementsByTagName('ul')[0].innerHTML = itemLista
        }
        function add(){
            var carro = document.getElementById('carro')
            if(document.getElementById('onde').checked){
                cars.unshift(carro.value)
            }
            else{
                cars.push(carro.value)
            }
            document.getElementById('carro').value = ''
            listar()
        }