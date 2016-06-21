package Model;
import java.util.ArrayList;
import java.util.List;

public class DescontoQuantidade implements Promocional {

	private Promocional promocao;
	private double quantidade;
	private double porcentagem;
	
	
	public DescontoQuantidade(Promocional promocao, double quantidade, double porcentagem){
		this.quantidade = quantidade;
		this.promocao = promocao;
		this.porcentagem = porcentagem;
	};
	
	public DescontoQuantidade(double quantidade, double porcentagem){
		this.quantidade = quantidade;
		this.porcentagem = porcentagem;
	};
	
	@Override
	public double getDesconto(Compra compra) {
		double desconto = 0;
		if(promocao != null){
			desconto += promocao.getDesconto(compra);
		}
		double desconto2 = 0;
		List<Item> lista = compra.getCarrinho();
		List<Item> listaContandos = new ArrayList<Item>();
		boolean encontrou = false;
		int qnt = 0;
		for(Item item : lista){
			if(!listaContandos.contains(item)){
				for(Item item2 : lista){
					if(item == item2){
						qnt++;
					}
				}
				if(qnt > quantidade){
					desconto2 += (item.getValor()*qnt)/100*porcentagem;
					encontrou = true;
				}
				qnt = 0;
				listaContandos.add(item);
			}
		}
		
		if(encontrou){
			desconto += desconto2;
			return desconto;
		}else{
			return desconto;
		}
	}


}
