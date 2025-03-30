package sistema.de.relatorios.factory;

import sistema.de.relatorios.model.Relatorio;
import sistema.de.relatorios.model.RelatorioEXCEL;

public class RelatorioEXCELFactory extends RelatorioFactory {
	
	@Override
	public Relatorio criarRelatorio(String recebedor) {
		return new RelatorioEXCEL(recebedor);
	}

}
