package br.sistemaBar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciadorDeClientes {
	
	private List<Cliente> clientes;
	
	public GerenciadorDeClientes(){
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void cadastrarCliente(Cliente c){
		this.clientes.add(c);
	}
	
	public void removerCliente(int codCliente){
		this.clientes.remove(codCliente);
	}

}
