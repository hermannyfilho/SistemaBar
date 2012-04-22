package br.sistemaBar;

import java.util.Date;

public class SistemaBarFacade implements ISistemaBar {
	
	private GerenciadorDeMesas gerMesas;
	private GerenciadorDeContas gerContas;
	private GerenciadorDeCardapio gerCardapio;
	private GerenciadorDeClientes gerClientes;
	
	public SistemaBarFacade(GerenciadorDeMesas gerMesas, GerenciadorDeContas gerContas,
			GerenciadorDeCardapio gerCardapio, GerenciadorDeClientes gerClientes){
		
		this.gerMesas = gerMesas;
		this.gerContas = gerContas;
		this.gerCardapio = gerCardapio;
		this.gerClientes = gerClientes;
	}
	
	@Override
	public void cadastrarMesa(int numMesa) {
		this.gerMesas.cadastrarMesa(new Mesa(numMesa));

	}

	@Override
	public void removerMesa(int numMesa) {
		this.gerMesas.removerMesa(numMesa);

	}
	
	@Override
	public void cadastrarConta(int codConta) {
		this.gerContas.cadastrarConta(new Conta(codConta));
		
	}

	@Override
	public void removerConta(int codConta) {
		this.gerContas.removerConta(codConta);
		
	}

	@Override
	public void cadastrarCliente(int codCliente, String nome, String endereco, String telefone, Date dataNasc) {
		this.gerClientes.cadastrarCliente(new Cliente(codCliente, nome, endereco, telefone, dataNasc));

	}

	@Override
	public void removerCliente(int codCliente) {
		this.gerClientes.removerCliente(codCliente);

	}

	@Override
	public void cadastrarItemCardapio(int codItem, String descricao, int quantidade, int valorUnidade) {
		this.gerCardapio.cadastrarItemCardapio(new ItemDePedido(codItem, descricao, quantidade, valorUnidade));

	}

	@Override
	public void removerItemCardapio(int codItem) {
		this.gerCardapio.removerItemCardapio(codItem);

	}

	@Override
	public void adicionarPedidosPagos(Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void adicionarPedidosNPagos(Conta conta, int codCliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public String pesquisarCadastroCliente(int codCliente) {
		return this.gerClientes.toString();
	}

	@Override
	public String pesquisarItemCardapio(int codItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fecharMesa(int numMesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gerarContaParcial(int numMesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarPedidoNaMesa(int codPedido, int numMesa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerItemPedido(int codItem, int quant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterarItemPedido(int codItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferirPedidos(Conta conta, Mesa origem, Mesa destino) {
		// TODO Auto-generated method stub

	}

	@Override
	public String gerarRelatorioDiario(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gerarRelatorioPedNPago(int codCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
