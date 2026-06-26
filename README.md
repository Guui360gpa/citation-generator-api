# 🎬 Citation Generator API

API REST desenvolvida com **Java** e **Spring Boot** que fornece frases famosas de filmes e séries de forma aleatória, incluindo o personagem, a obra e o pôster da série/filme.

O projeto foi desenvolvido com foco em boas práticas de desenvolvimento Backend, consumo por aplicações Frontend e organização em camadas.

---

## 📸 Demonstração

O frontend consome esta API e exibe as frases aleatórias em uma interface inspirada no ScreenMatch.

**Frontend utilizado:**
👉 https://github.com/jacqueline-oliveira/3356-java-desafio-front

---

# 🚀 Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- REST API

---

# 📂 Estrutura do projeto

```
src
 ├── controller
 ├── dto
 ├── model
 ├── repository
 ├── service
 └── SentenceGeneratorApplication.java
```

---

# 🗄️ Banco de Dados

A aplicação utiliza PostgreSQL.

Tabela principal:

```sql
frases
```

Campos:

| Campo | Tipo |
|--------|------|
| id | bigint |
| serie | varchar |
| frase | text |
| personagem | varchar |
| poster | text |

---

# 🔥 Funcionalidades

- Buscar uma frase aleatória
- Retornar o personagem
- Retornar a série/filme
- Retornar o pôster da obra
- Integração com Frontend

---

# 📡 Endpoint

## Buscar frase aleatória

```http
GET /series/frases
```

### Exemplo de resposta

```json
{
  "titulo": "Breaking Bad",
  "frase": "Say my name.",
  "personagem": "Walter White",
  "poster": "https://image.tmdb.org/t/p/w500/ggFHVNu6YYI5L9pCfOacjizRGt.jpg"
}
```

---

# ▶️ Como executar

## Clone o projeto

```bash
git clone https://github.com/Guui360gpa/citation-generator-api.git
```

Entre na pasta

```bash
cd citation-generator-api
```

Configure o arquivo:

```
application.properties
```

com suas credenciais do PostgreSQL.

Depois execute:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:8080
```

---

# 💻 Frontend

O frontend utilizado para consumir esta API pode ser encontrado em:

https://github.com/jacqueline-oliveira/3356-java-desafio-front

---

# 🧪 Exemplo de consumo

```javascript
fetch("http://localhost:8080/series/frases")
  .then(res => res.json())
  .then(data => console.log(data));
```

---

# 📚 Conceitos aplicados

- API REST
- Arquitetura em camadas
- DTO
- Repository Pattern
- Injeção de Dependência
- Spring Data JPA
- Consumo de API com JavaScript
- Integração Backend + Frontend

---

# 👨‍💻 Autor

**Guilherme Paiva Alves**

- GitHub: https://github.com/Guui360gpa
- LinkedIn: (adicione seu LinkedIn aqui)

---
⭐ Se este projeto foi útil, deixe uma estrela no repositório!
