/**
 * Confirmar a exclusao de um contato
 * 
 * 
 * 
 */

function confirmar(idprojeto) {
	let resposta = confirm("Confirma a exclusão deste projeto?")
	if (resposta === true) {
		window.location.href = "delete?idProjeto=" + idprojeto
	}
}

function confirmarUser(idusuario) {
	let resposta = confirm("Confirma a exclusão deste usuario?")
	if (resposta === true) {
		window.location.href = "deleteUser?idUsuario=" + idusuario
	}
}


function confirmarVersao(idversao) {
	let resposta = confirm("Confirma a exclusão desta versao do projeto?")
	if (resposta === true) {
		window.location.href = "deleteVersao?idVersao=" + idversao
	}
	
}	
	
function confirmarTela(idtela) {
	let resposta = confirm("Confirma a exclusão desta tela ?")
	if (resposta === true) {
		window.location.href = "deleteTela?idTela=" + idtela
	}
}


function confirmarEvento(idevento) {
	let resposta = confirm("Confirma a exclusão deste evento ?")
	if (resposta === true) {
		window.location.href = "deleteEvento?idEvento=" + idevento
	}
}



function confirmarRequisicao(idrequisicao) {
	let resposta = confirm("Confirma a exclusão desta Requisicao ?")
	if (resposta === true) {
		window.location.href = "deleteRequisicao?idRequisicao=" + idrequisicao
	}
}



function confirmarPropriedade(idpropriedade) {
	let resposta = confirm("Confirma a exclusão desta Propriedade ?")
	if (resposta === true) {
		window.location.href = "deletePropriedade?idPropriedade=" + idpropriedade
	}
}


