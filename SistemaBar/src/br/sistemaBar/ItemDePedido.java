package br.sistemaBar;

public class ItemDePedido {
	
	private int codItem;
	private String descricao;
	private int quantidade;
	private int valorUnidade;
	
	public ItemDePedido(int codItem,String descricao,int quantidade,int valorUnidade){
		this.codItem = codItem;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
	}

	public int getCodItem() {
		return codItem;
	}

	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(int valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

}
