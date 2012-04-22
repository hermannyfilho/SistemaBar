package br.sistemaBar;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private List<Pedido> pedidos;
	private int codConta;
	private Mesa mesa;
	private Cliente cliente;
	private double valorDesconto;
	private double porGarcom;
	private double valorRecebido;
	private double valorCouvert;
	private int quantPessoas;
	private String data;
	
	public Conta(int codConta, Mesa mesa, Cliente cliente, double valorDesconto, double porGarcom,
			double valorRecebido, double valorCouvert, int quantPessoas, String data){
		
		this.codConta = codConta;
		this.mesa = mesa;
		this.cliente = cliente;
		this.valorDesconto = valorDesconto;
		this.porGarcom = porGarcom;
		this.valorRecebido = valorRecebido;
		this.valorCouvert = valorCouvert;
		this.quantPessoas = quantPessoas;
		this.data = data;
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public Conta(int codConta){
		this.codConta = codConta;
		this.pedidos = new ArrayList<Pedido>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public int getCodConta() {
		return codConta;
	}

	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double getPorGarcom() {
		return porGarcom;
	}

	public void setPorGarcom(double porGarcom) {
		this.porGarcom = porGarcom;
	}

	public double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public double getValorCouvert() {
		return valorCouvert;
	}

	public void setValorCouvert(double valorCouvert) {
		this.valorCouvert = valorCouvert;
	}

	public int getQuantPessoas() {
		return quantPessoas;
	}

	public void setQuantPessoas(int quantPessoas) {
		this.quantPessoas = quantPessoas;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void adicionarPedido(Pedido p){
		this.pedidos.add(p);
	}
	
	public List<Pedido> pesquisaPedidoPeloItem(int codItemPed){
		
		List<Pedido> pedidosTemp = new ArrayList<Pedido>();
		
		for(Pedido p : this.pedidos){
			for(ItemDePedido i : p.getItens()){
				if(i.getCodItem() == codItemPed){
					pedidosTemp.add(p);
				}
			}
		}return pedidosTemp;
	}
	
	public void removerPedido(int numPedido){
		
		for(Pedido p : this.pedidos){
			if(p.getNumPedido() == numPedido){
				this.pedidos.remove(numPedido);
			}
		}
	}

}