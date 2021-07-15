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
	let resposta = confirm("Confirma a exclusão desta veraso do projeto?")
	if (resposta === true) {
		window.location.href = "deleteVersao?idVersao=" + idversao
	}
}

