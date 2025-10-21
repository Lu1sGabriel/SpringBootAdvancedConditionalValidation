# Conditional Validation Example — Spring Boot

Este é um **mini projeto de estudos** criado para explorar **validações condicionais avançadas** em Spring Boot utilizando o **Jakarta Bean Validation**.

O foco principal é demonstrar como criar **anotações de validação personalizadas** que dependem de múltiplos campos em um mesmo objeto, aplicando regras de negócio de forma condicional.

---

## Objetivo do Projeto

- Estudar como implementar **validações condicionais** com `ConstraintValidator`.
- Compreender como separar **DTOs**, **modelos de domínio** e **validators** em uma estrutura de pacotes organizada.
- Entender como o Spring Boot integra **Bean Validation** automaticamente em endpoints REST.
- Aprender a retornar mensagens de erro customizadas quando regras específicas não são atendidas.

---

## Estrutura de Pacotes

O projeto está organizado de forma a facilitar a leitura e a escalabilidade:

```

controller/       -> Endpoints REST
dto/              -> Objetos de entrada/saída
model/            -> Enums e classes de domínio
validation/       -> Anotações e validadores customizados

````

Essa estrutura permite que o projeto cresça sem perder a **organização e a clareza**.

---

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Jakarta Bean Validation (javax.validation / jakarta.validation)
- Maven

---

## Como Executar

1. Clone o repositório:
   ```
   https://github.com/Lu1sGabriel/Spring_Boot_Advanced_Conditional_Validation.git
   ```
2. Acesse a pasta do projeto:
3. Execute o projeto:
   ```
   mvn spring-boot:run
   ```
4. Testar os endpoints:
   * Use o arquivo `HttpRequests.http` que acompanha o projeto:
   * Abra-o em um editor que suporte arquivos `.http` e execute as requisições diretamente para testar os endpoints.

---

## Aprendizados

* Melhor uso do `jakarta.Validation`
* Criação de **anotações de validação customizadas**.
* Aplicação de **regras condicionais entre múltiplos campos**.
* Integração de **Bean Validation** com **Spring REST Controllers**.

---

> *Este repositório faz parte dos meus estudos contínuos sobre validações usando o `spring validation` em aplicações modernas Java com Spring Boot.*
