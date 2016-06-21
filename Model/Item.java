package Model;

public class Item {
	
	private double valor;
	private String nome;
	private int quantidade;
	
	public Item(){
		
	}
	public Item(String nome, double valor, int quantidade){
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
