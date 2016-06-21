package Model;
import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Cliente cliente;
	private List<Item> carrinho;
	private double valor;
	
	public Compra(){
		carrinho = new ArrayList<Item>();
	}
	public List<Item> getCarrinho() {
		return carrinho;
	}
	public void AdicionarCarrinho(Item item) {
		carrinho.add(item);
	}
	
	public double getValor() {
		double preco = 0;
		for (int i = 0; i < carrinho.size(); i++) {
			preco += carrinho.get(i).getValor();
		}
		valor = preco;
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
