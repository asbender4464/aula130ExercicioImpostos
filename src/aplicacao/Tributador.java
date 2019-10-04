package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.TributadoGenerico;
import entidade.TributadoPF;
import entidade.TributadoPJ;

public class Tributador {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<TributadoGenerico> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número de tributados: ");
		int n = sc.nextInt();
		
		for (int k=1; k <=n; k++) {
			
			System.out.println("Tributado #" + k + ":");
			System.out.print("Tipo PESSOA FÍSICA (f) ou JURÍDICA (j)? ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.print("Informe a receita anual do tributado: ");
			Double receitaAnual = sc.nextDouble();
			
			if (tipo == 'f') {
				System.out.print("Qual o valor das despesas com saúde? ");
				Double despesasComSaude = sc.nextDouble();
				lista.add(new TributadoPF(nome, receitaAnual, despesasComSaude));
			} else {
				System.out.print("Qual o numero de empregados? ");
				Integer numeroDeEmpregados = sc.nextInt();
				lista.add(new TributadoPJ(nome, receitaAnual, numeroDeEmpregados));
			}
			
		}
		
		Double soma = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (TributadoGenerico tributadoGenerico: lista) {
			System.out.println(tributadoGenerico.getNome() + ": " + String.format("$ %.2f", tributadoGenerico.imposto()));
			soma += tributadoGenerico.imposto();
		}
		System.out.println("TOTAL DOS IMPOSTOS: $" + String.format("%.2f", soma));
		
		sc.close();
	}

}
