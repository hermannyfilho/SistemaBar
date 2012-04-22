package br.sistemaBar;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int numPedido;
	private List<ItemDePedido> itensConsumo;
	
	public Pedido(int numPedido){
		this.numPedido = numPedido;
		this.itensConsumo = new ArrayList<ItemDePedido>();
	}

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public List<ItemDePedido> getItens() {
		return itensConsumo;
	}
	
	public void adicionaItemDoCardapio(ItemDePedido item){
		this.itensConsumo.add(item);
	}

}
