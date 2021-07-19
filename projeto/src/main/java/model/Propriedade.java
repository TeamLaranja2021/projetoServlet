package model;

public class Propriedade {
	private int idPropriedade;
	private int idRequisicao;
	private String tipoPropriedade;
	private String chave;
	private int valor;
	private int ordem;

	
	public Propriedade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdPropriedade() {
		return idPropriedade;
	}
	public void setIdPropriedade(int idPropriedade) {
		this.idPropriedade = idPropriedade;
	}
	public int getIdRequisicao() {
		return idRequisicao;
	}
	public void setIdRequisicao(int idRequisicao) {
		this.idRequisicao = idRequisicao;
	}
	public String getTipoPropriedade() {
		return tipoPropriedade;
	}
	public void setTipoPropriedade(String tipoPropriedade) {
		this.tipoPropriedade = tipoPropriedade;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public Propriedade(int idPropriedade, int idRequisicao, String tipoPropriedade, String chave, int valor,
			int ordem) {
		super();
		this.idPropriedade = idPropriedade;
		this.idRequisicao = idRequisicao;
		this.tipoPropriedade = tipoPropriedade;
		this.chave = chave;
		this.valor = valor;
		this.ordem = ordem;
	}

	
	
}
