package sistema.de.relatorios;

import java.util.Scanner;

import sistema.de.relatorios.factory.FabricaDinamica;
import sistema.de.relatorios.factory.RelatorioFactory;

import sistema.de.relatorios.model.Relatorio;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Pede o tipo de relatório que será gerado.
		System.out.println("Escolha o tipo de relatório que será gerado: (1: CSV, 2: EXCEL, 3: PDF): ");
		int escolha = scanner.nextInt();
		scanner.nextLine();

		// Valida a opção escolhida chamando a Fabrica Dinamica.
		RelatorioFactory factory = FabricaDinamica.getFactory(escolha);

		if (factory == null) {
			System.out.println("Opção inválida.");
		} else {
			// Solicitar o email 1 vez só.
			System.out.println("Digite o email do recebedor: ");
			String email = scanner.nextLine();

			// Gerar o relatório
			Relatorio relatorio = factory.criarRelatorio(email);
			relatorio.gerar();
		}

		scanner.close();

	}
}
