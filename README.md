Sistema de relatórios básico em Factory Method, adição de uma classe - FabricaDinamica, para deixar o código main mais limpo, agora o main valida a opção que o usuário escolher chamando a FabricaDinamica;

Dessa forma, caso seja preciso adicionar um novo tipo de relatório, basta mudar a *FabricaDinamica*, sem tocar na main.

Fluxo do código com a Fábrica Dinâmica se torna o seguinte: 

1 - O usuário escolhe o tipo de relatório(1, 2 ou 3).

2 - A *Main* passa essa escolha para FabricaDinamica.getFactory(escolha).

3 - A *FabricaDinamica* olha no *Map* e retorna a fábrica correspondente.

4 - A fábrica retorna o objeto de relatório correto.

5 - O relatório é gerado.


// Explicação importante do funcionamento para estudos e consultas: 


1 **A `Main` chama** `FabricaDinamica.getFactory(escolha)`.  

2 **O código sai da `Main`** e vai para `getFactory(escolha)`.  

3 **Dentro de `getFactory()`**, ele procura no `Map` **o que foi digitado** pelo usuário.  

4 **Se encontrar**, ele retorna essa fábrica pelo `return factories.get(escolha);`.  

5 **Essa fábrica "volta" para a `Main`** e é armazenada na variável `RelatorioFactory factory`.  

Ou seja:  
- **O `escolha` é o número digitado pelo usuário** (1, 2 ou 3).
- 
- **O `Map` usa esse número para pegar a fábrica correspondente**.
- 
- **O `return` devolve essa fábrica para a `Main`**, onde ela fica armazenada na variável `factory`.  

