package sistema.de.relatorios.model;

public class RelatorioPDF extends Relatorio {
	
	
	private String email;
	
	public RelatorioPDF(String email) {
		
		this.email = email;
	}

	@Override
	public void gerar() {
		System.out.println("Enviando o relatório em PDF para :  " + email);
		
	}

}
