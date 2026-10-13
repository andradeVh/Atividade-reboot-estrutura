# Operação REBOOT — registro da equipe

Equipe:
Integrantes:

## Missão 1 — Inventário
Previsão ANTES de executar (vetor final, tamanho, capacidade e deslocamentos):

Resultado observado na versão inicial:

Causa da falha e correção (explique; não basta colar o código):

Custo de inserir no início e no fim com espaço; por quê?

Quem programou / quem testou / quem explicou:

## Missão 2 — Fila circular
Previsão ANTES de executar (posições físicas, início, fim, tamanho e ordem lógica):

Resultado observado: Ao remover(), eventualmente acessava um index inexistente.

Causa da falha e correção: A falta do operador módulo fazia com que antigisse um índice inexistente, com (inicio + 1) % dados.length corrigmos isso fazendo com que retorne ao inicio do vetor. A função cheia() não considerava que o tamanho é igual a dados.length.

Como distinguir cheia de vazia? Como obter O(1) nas operações?
    Deixando um posição vazia.

Quem programou / quem testou / quem explicou:
Victor Hugo Andrade

## Missão 3 — Escalonador

## NÃO VIMOS DEQUE.

Previsão ANTES de executar (turno, processo, executado, restante, fila):

Ordem de conclusão e tempo total:

Causa das falhas e correções:

Por que um processo volta ao fim? Por que preservar o array de entrada?

Quem programou / quem testou / quem explicou:

## Fechamento individual (cada integrante responde)
Nome: Victor Hugo Andrade
1. Tamanho e capacidade são a mesma coisa?
    Não, a capidade é o limite de elementos que podemos inserir e o tamanho são quantos elementos inseridos.
2. A fila pode começar fisicamente no índice 2?
    Não.
3. O primeiro processo a chegar precisa terminar primeiro?
    Não, depende da prioridade do processo.
4. Qual conteúdo você precisa praticar mais?
    Deque.

## Desafio extra, se houver tempo
Novo cenário de teste, resultado esperado e qual erro ele detecta:
