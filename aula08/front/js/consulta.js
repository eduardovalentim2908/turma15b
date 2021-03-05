//function hello2() {
    //    alert('Hello World 2.')
    //    }
    
    
    
    function validaLogin() {
        let usuario = localStorage.getItem("userLogged")
        
        if(!usuario){
            window.location = "login.html"
        }
        
        let objuser = JSON.parse(usuario)
        document.getElementById("dadosUser").innerHTML = 'Usuário: <b>' + objuser.nome + '</b> - ' + objuser.email + '<br>'
    }
    
    
    function logout() {
        localStorage.removeItem("userLogged")
        window.location = "login.html"
    }
    
    
    function hello() {
    let numero
    numero = document.getElementById("chave").value
    console.log('Voce digitou: ' + numero)
    let saida = document.getElementById("saida").innerHTML = "Voce digitou o texto ou numero: " + numero
    //saida.innerHTML = "Voce digitou: " + numero
}

function consultaUsuario() {
    let numero
    numero = document.getElementById("chave").value

    const url = "http://localhost:8080/user/compras/" + numero

    fetch(url)
    .then(res => validaResposta(res))
}

function validaResposta(restultado) {
    if (restultado.status == 200){
        restultado.json().then(res => exibirDados(res))
    }else{
        document.getElementById("saida").innerHTML = "Não encontrado: "

    }
}

function exibirDados(compras) {
    console.log(compras)

    let table = 'Descrição - Valor - Data <br>'
    for (let index = 0; index < compras.length; index++) {
        table += compras[index].descricao + ' - ' + compras[index].valor + ' - ' + compras[index].data + '<br>';
     
    }
    
    document.getElementById("saida").innerHTML = table

}

    