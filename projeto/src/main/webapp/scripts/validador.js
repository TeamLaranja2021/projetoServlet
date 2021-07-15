/**
 * Validar campos obrigatorios
 * 
 *
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


//usuario
function validarUser() {
	let nome = frmUsuario.nome.value
	let senha = frmUsuario.senha.value
	let email = frmUsuario.email.value
	let cargo = frmUsuario.cargo.value
	if (nome === "") {
		alert('Preencha o campo Nome de Usuario')
		frmUsuario.nome.focus()
		return false
	} else if (senha === "") {
		alert('Preencha o campo senha')
		frmUsuario.senha.focus()
		return false
	} else if (email === "") {
		alert('Preencha o campo email')
		frmUsuario.email.focus()
		return false	
	} else if (cargo === "") {
		alert('Preencha o campo cargo')
		frmUsuario.cargo.focus()
		return false
	} else {
		document.forms["frmUsuario"].submit()
	}
}




//versao
function validarVersao() {

		document.forms["frmVersao"].submit()
	
}