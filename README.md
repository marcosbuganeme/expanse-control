
# Projeto Java com Spring Boot usando Clean Architecture

Este projeto exemplifica a estrutura de um aplicativo Spring Boot seguindo os princípios da Clean Architecture.

## Estrutura de Diretórios

O projeto está organizado da seguinte forma:

```
src/
├─ main/
│ ├─ java/
│ │ ├─ com/
│ │ │ ├─ seuprojeto/
│ │ │ │ ├─ application/
│ │ │ │ │ ├─ config/ - Configurações de beans do Spring e outras configurações
│ │ │ │ │ ├─ controller/ - Controladores REST, recebem requisições e delegam ações
│ │ │ │ ├─ domain/
│ │ │ │ │ ├─ model/ - Entidades e objetos de domínio, regras de negócio
│ │ │ │ │ ├─ service/ - Serviços de domínio, lógica de negócio central
│ │ │ │ │ ├─ exception/ - Exceções personalizadas de domínio
│ │ │ │ │ ├─ port/ - Portas (interfaces para serviços externos e adapters)
│ │ │ │ ├─ infrastructure/
│ │ │ │ │ ├─ repository/ - Implementações de repositórios (Spring Data JPA)
│ │ │ │ │ ├─ security/ - Configurações de segurança (autenticação, autorização)
│ │ │ │ │ ├─ web/ - Configurações web específicas (filtros, interceptadores)
│ │ │ │ │ ├─ adapter/ - Adapters para conectar com serviços externos (APIs, DBs)
│ │ │ │ ├─ common/
│ │ │ │ │ ├─ util/ - Utilitários e helpers comuns ao projeto
│ │ │ │ │ ├─ constants/ - Constantes globais
├─ resources/
│ ├─ application.properties - Configurações do aplicativo Spring
│ ├─ static/ - Recursos estáticos (css, js, imagens, etc.)
│ ├─ templates/ - Templates de email ou outras templates
│ ├─ db/
│ │ ├─ migration/ - Scripts de migração de banco de dados (Flyway ou Liquibase)
└─ test/
├─ java/
│ ├─ com/
│ │ ├─ seuprojeto/
│ │ │ ├─ domain/
│ │ │ │ ├─ service/ - Testes unitários para serviços de domínio
│ │ │ ├─ infrastructure/
│ │ │ │ ├─ repository/ - Testes de integração para repositórios
│ │ │ ├─ application/
│ │ │ │ ├─ controller/ - Testes de integração para controladores
├─ resources/
├─ application-test.properties - Configurações para testes
```

## Sobre a Clean Architecture

A Clean Architecture foi proposta por Robert C. Martin e busca separar os aspectos fundamentais do software das flutuações tecnológicas e das interfaces de usuário. Dessa forma, a lógica do negócio e as regras de aplicação podem ser testadas de forma independente do framework ou banco de dados utilizado.

## Configuração e Uso

Para rodar este projeto, você precisará do JDK 11+ e do Maven para gerenciar as dependências. Configure os detalhes específicos, como conexões de banco de dados, no arquivo `application.properties`.

## Contribuições

Contribuições são bem-vindas. Para contribuir, por favor crie um fork do repositório, faça suas alterações e envie um pull request.****