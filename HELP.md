# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/#build-image)
* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/docs/3.2.5/reference/html/features.html#features.testing.testcontainers)
* [Testcontainers RabbitMQ Module Reference Guide](https://java.testcontainers.org/modules/rabbitmq/)
* [Testcontainers MongoDB Module Reference Guide](https://java.testcontainers.org/modules/databases/mongodb/)
* [Testcontainers Postgres Module Reference Guide](https://java.testcontainers.org/modules/databases/postgres/)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#actuator)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#messaging.amqp)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.nosql.mongodb)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.nosql.redis)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#using.devtools)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#features.docker-compose)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.flyway)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web.security)
* [Testcontainers](https://java.testcontainers.org/)
* [Validation](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#io.validation)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* mongodb: [`mongo:latest`](https://hub.docker.com/_/mongo)
* postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)
* rabbitmq: [`rabbitmq:latest`](https://hub.docker.com/_/rabbitmq)
* redis: [`redis:latest`](https://hub.docker.com/_/redis)

Please review the tags of the used images and set them to the same as you're running in production.

### Testcontainers support

This project uses [Testcontainers at development time](https://docs.spring.io/spring-boot/docs/3.2.5/reference/html/features.html#features.testing.testcontainers.at-development-time).

Testcontainers has been configured to use the following Docker images:

* [`mongo:latest`](https://hub.docker.com/_/mongo)
* [`postgres:latest`](https://hub.docker.com/_/postgres)
* [`rabbitmq:latest`](https://hub.docker.com/_/rabbitmq)
* [`redis:latest`](https://hub.docker.com/_/redis)

Please review the tags of the used images and set them to the same as you're running in production.


# Projeto Java com Spring Boot usando Clean Architecture

Este projeto exemplifica a estrutura de um aplicativo Spring Boot seguindo os princípios da Clean Architecture.

## Estrutura de Diretórios

O projeto está organizado da seguinte forma:

```
src/
├─ main/
│  ├─ java/
│  │  ├─ com/
│  │  │  ├─ seuprojeto/
│  │  │  │  ├─ application/
│  │  │  │  │  ├─ config/                 - Configurações de beans do Spring e outras configurações
│  │  │  │  │  ├─ controller/             - Controladores REST, recebem requisições e delegam ações
│  │  │  │  ├─ domain/
│  │  │  │  │  ├─ model/                  - Entidades e objetos de domínio, regras de negócio
│  │  │  │  │  ├─ service/                - Serviços de domínio, lógica de negócio central
│  │  │  │  │  ├─ exception/              - Exceções personalizadas de domínio
│  │  │  │  │  ├─ port/                   - Portas (interfaces para serviços externos e adapters)
│  │  │  │  ├─ infrastructure/
│  │  │  │  │  ├─ repository/             - Implementações de repositórios (Spring Data JPA)
│  │  │  │  │  ├─ security/               - Configurações de segurança (autenticação, autorização)
│  │  │  │  │  ├─ web/                    - Configurações web específicas (filtros, interceptadores)
│  │  │  │  │  ├─ adapter/                - Adapters para conectar com serviços externos (APIs, DBs)
│  │  │  │  ├─ common/
│  │  │  │  │  ├─ util/                   - Utilitários e helpers comuns ao projeto
│  │  │  │  │  ├─ constants/              - Constantes globais
├─ resources/
│  ├─ application.properties               - Configurações do aplicativo Spring
│  ├─ static/                              - Recursos estáticos (css, js, imagens, etc.)
│  ├─ templates/                           - Templates de email ou outras templates
│  ├─ db/
│  │  ├─ migration/                        - Scripts de migração de banco de dados (Flyway ou Liquibase)
└─ test/
   ├─ java/
   │  ├─ com/
   │  │  ├─ seuprojeto/
   │  │  │  ├─ domain/
   │  │  │  │  ├─ service/                 - Testes unitários para serviços de domínio
   │  │  │  ├─ infrastructure/
   │  │  │  │  ├─ repository/              - Testes de integração para repositórios
   │  │  │  ├─ application/
   │  │  │  │  ├─ controller/              - Testes de integração para controladores
   ├─ resources/
      ├─ application-test.properties        - Configurações para testes
```

## Sobre a Clean Architecture

A Clean Architecture foi proposta por Robert C. Martin e busca separar os aspectos fundamentais do software das flutuações tecnológicas e das interfaces de usuário. Dessa forma, a lógica do negócio e as regras de aplicação podem ser testadas de forma independente do framework ou banco de dados utilizado.

## Configuração e Uso

Para rodar este projeto, você precisará do JDK 11+ e do Maven para gerenciar as dependências. Configure os detalhes específicos, como conexões de banco de dados, no arquivo `application.properties`.

## Contribuições

Contribuições são bem-vindas. Para contribuir, por favor crie um fork do repositório, faça suas alterações e envie um pull request.