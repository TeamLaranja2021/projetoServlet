/**
 * Validar campos obrigatorios
 * 
 * @author Professor Jose de Assis
 */

function validar() {
	let nomeProjeto = frmProjeto.nomeProjeto.value
	let situacao = frmProjeto.nomeProjeto.value
	if (nomeProjeto === "") {
		alert('Preencha o campo Nome Projeto')
		frmProjeto.nomeProjeto.focus()
		return false
	} else if (situacao === "") {
		alert('Preencha o campo situacao')
		frmProjeto.situacao.focus()
		return false
	} else {
		document.forms["frmProjeto"].submit()
	}
}