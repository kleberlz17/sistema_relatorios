package sistema.de.relatorios.model;

public class RelatorioCSV extends Relatorio{

	private String email;
	
	public RelatorioCSV (String email) {
		this.email = email;
	}

	@Override
	public void gerar() {
		System.out.println("Enviando o relatório em CSV para: " + email);
		
	}
}
