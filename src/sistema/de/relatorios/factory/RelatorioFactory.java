package sistema.de.relatorios.factory;

import sistema.de.relatorios.model.Relatorio;

public abstract class RelatorioFactory {
	
	public abstract Relatorio criarRelatorio(String recebedor);

}
