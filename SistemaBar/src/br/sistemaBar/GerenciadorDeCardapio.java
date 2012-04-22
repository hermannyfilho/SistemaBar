package br.sistemaBar;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeCardapio {
	
	List<ItemDePedido> itens;
	
	public GerenciadorDeCardapio(){
		this.itens = new ArrayList<ItemDePedido>();
	}
	
	public void cadastrarItemCardapio(ItemDePedido i){
		this.itens.add(i);
	}
	
	public void removerItemCardapio(int codItem){
		this.itens.remove(codItem);
	}
	
	public String pesquisarItemCardapio(int codItem){
		
		for(ItemDoCardapio i : )
	}

}
