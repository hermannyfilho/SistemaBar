package br.sistemaBar;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeMesas {
	
	private List<Mesa> mesas;
	
	public GerenciadorDeMesas(){
		this.mesas = new ArrayList<Mesa>();
	}
	
	public void cadastrarMesa(Mesa m){
		this.mesas.add(m);
	}
	
	public void removerMesa(int numMesa){
		this.mesas.remove(numMesa);
	}

}
