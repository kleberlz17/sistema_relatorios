package sistema.de.relatorios.factory;

import sistema.de.relatorios.model.Relatorio;
import sistema.de.relatorios.model.RelatorioPDF;

public class RelatorioPDFFactory extends RelatorioFactory{


	@Override
	public Relatorio criarRelatorio(String recebedor) {
		return new RelatorioPDF(recebedor);
		
		
	}


	
}
