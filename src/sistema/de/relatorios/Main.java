package sistema.de.relatorios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import sistema.de.relatorios.factory.RelatorioCSVFactory;
import sistema.de.relatorios.factory.RelatorioEXCELFactory;
import sistema.de.relatorios.factory.RelatorioFactory;
import sistema.de.relatorios.factory.RelatorioPDFFactory;
import sistema.de.relatorios.model.Relatorio;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Mapeia opções para as fábricas correspondentes.
		Map<Integer, RelatorioFactory> factories = new HashMap<>();
		factories.put(1, new RelatorioCSVFactory());
		factories.put(2, new RelatorioEXCELFactory());
		factories.put(3, new RelatorioPDFFactory());

		// Pede o tipo de relatório que será gerado.
		System.out.println("Escolha o tipo de relatório que será gerado: (1: CSV, 2: EXCEL, 3: PDF): ");
		int escolha = scanner.nextInt();
		scanner.nextLine();

		// Valida a opção escolhida
		RelatorioFactory factory = factories.get(escolha);
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
