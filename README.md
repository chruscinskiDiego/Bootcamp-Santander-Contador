# Contador com tratamento de exceções

Exercício do Bootcamp Santander 2024 para praticar controle de fluxo e exceções em Java.

## O que faz

Recebe dois inteiros e imprime uma sequência com a quantidade correspondente à diferença entre eles. Quando o primeiro é maior que o segundo, lança e trata uma exceção personalizada.

## Executar

Com um JDK instalado:

```bash
javac -encoding UTF-8 -d out src/Contador.java src/ParametrosInvalidosException.java
java -cp out Contador
```

## Exemplo

Para os valores 2 e 5, imprime os números 1, 2 e 3. Valores iguais produzem uma sequência vazia, conforme a regra implementada.

## Conceitos praticados

Scanner, laços, métodos, exceções verificadas e validação de parâmetros. Projeto de estudo sem persistência ou serviços externos.
