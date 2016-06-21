package Model;

public class DescontoFidelidade implements Promocional {
	
	private Promocional promocao;
	private double porcentagem;
	private double valor;
	
	public DescontoFidelidade(Promocional promocao, double valor, double porcentagem){
		this.valor = valor;
		this.porcentagem = porcentagem;
		this.promocao = promocao;
	};
	
	public DescontoFidelidade(double valor, double porcentagem){
		this.valor = valor;
		this.porcentagem = porcentagem;
	};
	
	@Override
	public double getDesconto(Compra compra) {
		double desconto = 0;
		if(promocao != null){
			desconto += promocao.getDesconto(compra);
		}
		if(compra.getCliente().getPontos() > valor){
			desconto += compra.getValor()/100*porcentagem;
			return desconto;
		}else{
			return desconto;
		}
	}
	
}
