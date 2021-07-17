package model;

public class Usuario {
	private int idUsuario ;
	private String nome ;
	private String email ;
	private String senha ;
	private String cargo ;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Usuario(int idUsuario, String nome, String email, String senha, String cargo) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cargo = cargo;
	}
	public Usuario(String nome, String email, String senha, String cargo) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cargo = cargo;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
