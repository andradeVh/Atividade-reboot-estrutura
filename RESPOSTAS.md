# Operação REBOOT — registro da equipe

Equipe:
Integrantes:

## Missão 1 — Inventário
Previsão ANTES de executar (vetor final, tamanho, capacidade e deslocamentos):

Resultado observado na versão inicial:

A versão Inicial do inventario inseria de forma correta, sempre adicionando no indice.
Porem quando inseriamos em um indice ja preenchido, a copia do indice para o valor seguinte estava com erro logico.
No fim, ele copiava o valor do local inserido e substituia em todo o Array.
No metodo remover, apenas o parametro do laço estava incorreto. O que ocasionava em uma falha lógica e alterava o indice incorreto do array.




Causa da falha e correção (explique; não basta colar o código):
Para corrigir o erro de inserir, invertemos para que a copia seja feita do fim para o inicio, corrigindo a copia para liberar o indice.
Para corrigi o erro de remover do indice incorreto, alteramos o parametro "tamanho -2" para "tamanho -1 ". Um erro simples que removia o indice, porem
a copia final do array ficava incorreta e parecendo que o indice incorreto foi removido.
 

Custo de inserir no início e no fim com espaço; por quê?
O custo é O(n) pois este processo exige percorrer todo o array e realizar as copias necessarias.

Quem programou / quem testou / quem explicou:
A resolução lógica do exercicio foi realizada em dupĺa, mas a implementação foi realizada pelo Aluno Gustavo Ramos.

## Missão 2 — Fila circular
Previsão ANTES de executar (posições físicas, início, fim, tamanho e ordem lógica):

Resultado observado:

Causa da falha e correção:

Como distinguir cheia de vazia? Como obter O(1) nas operações?

Quem programou / quem testou / quem explicou:

## Missão 3 — Escalonador
Previsão ANTES de executar (turno, processo, executado, restante, fila):

Ordem de conclusão e tempo total:

Causa das falhas e correções:

Por que um processo volta ao fim? Por que preservar o array de entrada?

Quem programou / quem testou / quem explicou:

## Fechamento individual (cada integrante responde)
Nome:
1. Tamanho e capacidade são a mesma coisa?
R: Não, o tamanho indica o total de indices preenchidos. A capacidade seria a quantidade maxima que a estrutura armazena.
2. A fila pode começar fisicamente no índice 2?
R: Não, pois a primeira posição tem a prioridade na logica da Fila. firt in first out.
3. O primeiro processo a chegar precisa terminar primeiro?
R: Não foi estudado em aula.
4. Qual conteúdo você precisa praticar mais?
R: Acredito que preciso estar praticando mais os conceitos de Escalonador junto a fila circular e estudar referente as estruturas em Deque.

## Desafio extra, se houver tempo
Novo cenário de teste, resultado esperado e qual erro ele detecta:
