package Application;

import Model.Cliente;
import Model.Compra;
import Model.DescontoFidelidade;
import Model.DescontoPorValor;
import Model.DescontoQuantidade;
import Model.Item;
import Model.Promocional;;

public class TestaCompra {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setPontos(2000);
		
		Compra compra = new Compra();
		compra.setCliente(cliente);
		Item sabonete = new Item("Sabonete", 2.50);
		Item ruffles = new Item("Ruffles", 2.50);
		Item iogurte = new Item("Iogurte", 5.00);
		
		for(int i = 0; i<25; i++){
			compra.AdicionarCarrinho(iogurte);
		}
		compra.AdicionarCarrinho(sabonete);
		compra.AdicionarCarrinho(ruffles);
		
		System.out.println(compra.getValor());
		
		Promocional promocao = new DescontoPorValor(5,20);
		promocao = new DescontoFidelidade(promocao,1000,5);
		promocao = new DescontoQuantidade(promocao,20,10);
		
		System.out.println(promocao.getDesconto(compra));
	}
}
