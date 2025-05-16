# 👤 REST API com Spring Boot - Benny Person

Este projeto é uma API RESTful desenvolvida com **Spring Boot e Java**, como parte do aprendizado prático de desenvolvimento backend. A API realiza operações CRUD sobre uma entidade `Person`, simulando uma estrutura de projeto real com versionamento de API, boas práticas de organização e princípios RESTful.

---

## 📚 Objetivo

Criar uma API robusta com versionamento, validação, documentação e persistência de dados, usando as ferramentas modernas do ecossistema Spring.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Hibernate
- Banco de Dados H2 (memória)
- Swagger/OpenAPI (via springdoc)
- Maven

---

## 🧠 Conceitos Trabalhados

- Versionamento de API (`/api/v1/person`)
- Boas práticas de arquitetura em camadas
- Operações CRUD com JPA
- Validações básicas
- Documentação com Swagger
- Testes de endpoints no Postman

---

## 🗂️ Estrutura de Pastas

rest-with-spring-boot-and-java-benny-person/
└── src/
└── main/
├── java/
│ └── com.benny.restapi
│ ├── controller
│ ├── model
│ ├── repository
│ ├── service
│ └── config
└── resources/
├── application.properties
└── data.sql (opcional)



---

## 🔧 Como Executar

### Pré-requisitos

- Java 17+
- Maven

### Executando

1. Clone o repositório:

```bash
git clone https://github.com/BennyLopesWeb/rest-with-spring-boot-and-java-benny-person.git
cd rest-with-spring-boot-and-java-benny-person

2. Rode o projeto:
./mvnw spring-boot:run

3.Acesse:
API: http://localhost:8080/api/v1/person

Documentação Swagger: http://localhost:8080/swagger-ui.html

📦 Endpoints Básicos
Método	Endpoint	Descrição
GET	/api/v1/person	Lista todas as pessoas
GET	/api/v1/person/{id}	Busca uma pessoa por ID
POST	/api/v1/person	Cria uma nova pessoa
PUT	/api/v1/person/{id}	Atualiza os dados da pessoa
DELETE	/api/v1/person/{id}	Remove uma pessoa

🧪 Exemplos de Requisições
POST /api/v1/person

{
  "firstName": "João",
  "lastName": "Silva",
  "address": "Rua das Flores",
  "gender": "Male"
}


📈 Futuras Melhorias
Integração com banco relacional externo (MySQL/PostgreSQL)

Paginação e ordenação

Testes automatizados com JUnit e Mockito

Segurança com Spring Security + JWT

👨‍💻 Autor
Desenvolvido por Benny Lopes

📄 Licença
Projeto open-source com fins educacionais. Licenciado sob MIT License.
