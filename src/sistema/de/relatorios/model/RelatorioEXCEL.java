package sistema.de.relatorios.model;

public class RelatorioEXCEL extends Relatorio {
	
	private String email;

	public RelatorioEXCEL(String email) {
		this.email = email;
	}

	@Override
	public void gerar() {
		System.out.println("Enviando o relatório em EXCEL para: " + email);
		
	}
}
