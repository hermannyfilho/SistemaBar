package br.sistemaBar;

import java.util.Date;

public interface ISistemaBar {
	
	public void cadastrarMesa(int numMesa);
    public void removerMesa(int numMesa);
    public void cadastrarConta(int codConta);
    public void removerConta(int codConta);
    public void cadastrarCliente(int codCliente,String nome,String endereco,String telefone,Date dataNasc);
    public void removerCliente(int codCliente);
    public void cadastrarItemCardapio(int codItem,String descricao,int quantidade,int valorUnidade);
    public void removerItemCardapio(int codItem);
    public void adicionarPedidosPagos(Conta conta);
    public void adicionarPedidosNPagos(Conta conta,int codCliente);
    public String pesquisarCadastroCliente(int codCliente);
    public String pesquisarItemCardapio(int codItem);
    public String fecharMesa(int numMesa);
    public String gerarContaParcial(int numMesa);
    public void adicionarPedidoNaMesa(int codPedido,int numMesa);
    public void removerItemPedido(int codItem,int quant);
    public void alterarItemPedido(int codItem);
    public void transferirPedidos(Conta conta,Mesa origem,Mesa destino);
    public String gerarRelatorioDiario(String data);
    public String gerarRelatorioPedNPago(int codCliente);

}
