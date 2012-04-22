package br.sistemaBar;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeContas {
	
	private List<Conta> contas;
	
	public GerenciadorDeContas(){
		this.contas = new ArrayList<Conta>();
	}
	
	public void cadastrarConta(Conta c){
		this.contas.add(c);
	}
	
	public void removerConta(int codConta){
		this.contas.remove(codConta);
	}

}
