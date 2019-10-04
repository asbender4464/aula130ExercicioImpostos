package entidade;

public class TributadoPJ extends TributadoGenerico {

	//Subclasse que 'herda' as características da Superclasse TributadoGenerico
	
	//Atributos
	private Integer numeroDeEmpregados;	
		
	//Construtores
	public TributadoPJ() {
		super();
	}
	
	public TributadoPJ(String nome, Double receitaAnual, Integer numeroDeEmpregados) {
		super(nome, receitaAnual);
		this.numeroDeEmpregados = numeroDeEmpregados;
	}

	//GETs e SETs
	public Integer getNumeroDeEmpregados() {
		return numeroDeEmpregados;
	}

	public void setNumeroDeEmpregados(Integer numeroDeEmpregados) {
		this.numeroDeEmpregados = numeroDeEmpregados;
	}
				
	//Método que 'sobrepõe' o método da Superclasse TributadoGenerico
	@Override
	public Double imposto() {
		if (numeroDeEmpregados > 10) {
			return (receitaAnual * 0.14);
		} else {
			return (receitaAnual * 0.16);
		}
	}

}
