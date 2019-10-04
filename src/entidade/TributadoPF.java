package entidade;

public class TributadoPF extends TributadoGenerico {

	//Subclasse que 'herda' as características da Superclasse TributadoGenerico
	
	//Atributos
	private Double despesasComSaude;
	
	//Construtores
	public TributadoPF() {
		super();
	}

	public TributadoPF(String nome, Double receitaAnual, Double despesasComSaude) {
		super(nome, receitaAnual);
		this.despesasComSaude = despesasComSaude;
	}

	//GETs e SETs
	public Double getDespesasComSaude() {
		return despesasComSaude;
	}

	public void setDespesasComSaude(Double despesasComSaude) {
		this.despesasComSaude = despesasComSaude;
	}

	//Método que 'sobrepõe' o método da Superclasse TributadoGenerico
	@Override
	public Double imposto() {
		if (receitaAnual < 20000.0) {
			return (receitaAnual * 0.15) - (despesasComSaude * 0.50);
		} else {
			return (receitaAnual * 0.25) - (despesasComSaude * 0.50);
		}
	}
}
