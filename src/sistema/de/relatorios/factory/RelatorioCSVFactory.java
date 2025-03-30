package sistema.de.relatorios.factory;

import sistema.de.relatorios.model.Relatorio;
import sistema.de.relatorios.model.RelatorioCSV;

public class RelatorioCSVFactory extends RelatorioFactory{
	
	@Override
	public Relatorio criarRelatorio(String recebedor) {
		return new RelatorioCSV(recebedor);
	}

}
