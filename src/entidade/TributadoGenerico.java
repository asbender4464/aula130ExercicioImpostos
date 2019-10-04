package entidade;

public abstract class TributadoGenerico {

	//Superclasse abstrata
	
	//Atributos
	private String nome;
	protected Double receitaAnual;
	
	//Construtores
	public TributadoGenerico() {
	}
	
	public TributadoGenerico(String nome, Double receitaAnual) {
		this.nome = nome;
		this.receitaAnual = receitaAnual;
	}

	//GETs e SETs	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getReceitaAnual() {
		return receitaAnual;
	}

	public void setReceitaAnual(Double receitaAnual) {
		this.receitaAnual = receitaAnual;
	}

	//Método 'genérico' - observe que esta Classe precisa ser 'abstrata' também.
	public abstract Double imposto();
		
}
