package sistema.de.relatorios.factory;

import java.util.HashMap;
import java.util.Map;

public class FabricaDinamica {

	// Mapeia opções para as fábricas correspondentes.
	private static final Map<Integer, RelatorioFactory>factories = new HashMap<>();
	
	static {
		factories.put(1, new RelatorioCSVFactory());
		factories.put(2, new RelatorioEXCELFactory());
		factories.put(3, new RelatorioPDFFactory());
	}
	
	public static RelatorioFactory getFactory(int escolha) {
		return factories.get(escolha);
	}
}
