/**
 * Confirmar a exclusao de um contato
 * 
 * @author Professor Jose de Assis
 * 
 */

function confirmar(idprojeto) {
	let resposta = confirm("Confirma a exclusão deste projeto?")
	if (resposta === true) {
		window.location.href = "delete?idProjeto=" + idprojeto
	}
}