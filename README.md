Sistema de relatórios básico em Factory Method, adição de uma classe - FabricaDinamica, para deixar o código main mais limpo, agora o main valida a opção que o usuário escolher chamando a FabricaDinamica;
Fluxo do código com a Fábrica Dinâmica se torna o seguinte: 
1 - O usuário escolhe o tipo de relatório(1, 2 ou 3).
2 - A *Main* passa essa escolha para FabricaDinamica.getFactory(escolha).
3 - A *FabricaDinamica* olha no *Map* e retorna a fábrica correspondente.
4 - A fábrica retorna o objeto de relatório correto.
5 - O relatório é gerado.
