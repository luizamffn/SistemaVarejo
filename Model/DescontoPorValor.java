package Model;
public class DescontoPorValor implements Promocional {

	private Promocional promocao;
	private double porcentagem;
	private double valor;
	
	public DescontoPorValor(Promocional promocao, double valor, double porcentagem){
		this.valor = valor;
		this.porcentagem = porcentagem;
		this.promocao = promocao;
	};
	
	public DescontoPorValor(double valor, double porcentagem){
		this.valor = valor;
		this.porcentagem = porcentagem;
	};
	
	@Override
	public double getDesconto(Compra compra) {
		double desconto = 0;
		if(promocao != null){
			desconto += promocao.getDesconto(compra);
		}
		if(compra.getValor()>valor){
			desconto += compra.getValor()/100*porcentagem;
			return desconto;
		}else{
			return desconto;
		}
	}
	
	
	public double GetValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public Promocional getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocional promocao) {
		this.promocao = promocao;
	}

}
