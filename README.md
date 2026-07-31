=======================================================
  PintaVida Papelaria — Sistema de Estoque Interno
=======================================================

Sistema de gerenciamento de estoque para uma papelaria desenvolvido em equipe.

## 👥 Projeto em Grupo

Este projeto foi desenvolvido em equipe durante a graduação.

### 💻 Minha contribuição

- Desenvolvimento completo da API REST utilizando Java e Spring Boot.
- Implementação da arquitetura em camadas (Controller, Service, Repository e Model).
- Criação dos endpoints CRUD.
- Integração com MySQL utilizando Spring Data JPA.
- Implementação das regras de negócio e persistência dos dados.
- Organização do backend seguindo boas práticas de desenvolvimento.

### 🤝 Demais contribuições da equipe

- Desenvolvimento do frontend.
- Documentação do projeto.
- Interface da aplicação.

## 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- MySQL
- HTML
- CSS
- JavaScript

## 📋 Funcionalidades

- Cadastro de produtos
- Listagem de produtos
- Atualização de produtos
- Exclusão de produtos
- Busca por marca
- Busca por categoria

## ▶ Como executar


ESTRUTURA DO PROJETO:
  PintaVida/
  ├── backend/          → Projeto Spring Boot (Java)
  ├── frontend/         → Site HTML/CSS/JS
  └── banco-de-dados/   → Script SQL para phpMyAdmin

=======================================================
  PASSO A PASSO PARA CONFIGURAR
=======================================================

--- 1. BANCO DE DADOS (phpMyAdmin) ---

a) Abra o XAMPP e inicie o Apache e o MySQL
b) Acesse http://localhost/phpmyadmin
c) Clique em "Importar" no menu superior
d) Clique em "Escolher arquivo" e selecione:
       banco-de-dados/loja.sql
e) Clique em "Executar" (botão no final da página)
f) O banco "loja" e a tabela "produto" serão criados
   automaticamente com 10 produtos de exemplo!

--- 2. BACKEND (Spring Boot) ---

a) Abra a pasta "backend" na sua IDE (IntelliJ ou Eclipse)
b) Verifique o arquivo:
       backend/src/main/resources/application.properties
   - Se sua senha do MySQL não for vazia, coloque aqui:
       spring.datasource.password=SUA_SENHA
c) Execute o projeto (botão Run / mvn spring-boot:run)
d) A API estará disponível em:
       http://localhost:8080/papelaria

ENDPOINTS DA API:
  GET    /papelaria              → Lista todos os produtos
  POST   /papelaria              → Cadastra novo produto
  PUT    /papelaria              → Atualiza produto
  DELETE /papelaria/{id}         → Deleta produto por ID
  GET    /papelaria/marca/{marca}→ Busca por marca
  GET    /papelaria/tipo/{tipo}  → Busca por nome

--- 3. FRONTEND (Site) ---

a) Abra o arquivo:
       frontend/index.html
   diretamente no navegador (Chrome, Firefox, Edge)
   OU use a extensão "Live Server" no VS Code

b) O site vai conectar automaticamente ao Spring Boot
   Se a API estiver rodando, aparecerá "🟢 API conectada"
   Se não estiver: "🔴 Spring Boot offline"

=======================================================
  FUNCIONALIDADES DO SISTEMA
=======================================================

✅ Ver todos os produtos do banco em tempo real
✅ Filtrar por categoria (Pintura, Cadernos, etc.)
✅ Buscar por marca
✅ Cadastrar novo produto (POST /papelaria)
✅ Editar produto existente (PUT /papelaria)
✅ Excluir produto com confirmação (DELETE /papelaria/{id})
✅ Dashboard com estatísticas (total, valor, estoque baixo)
✅ Indicador visual de status da API
✅ Imagens por categoria via Unsplash
✅ Alertas de estoque baixo (≤10 unidades)

=======================================================
  POSSÍVEL PROBLEMA: CORS
=======================================================
Se o navegador bloquear as requisições, o CorsConfig.java
já está configurado no backend para aceitar chamadas do
frontend. Certifique-se de que o backend foi reiniciado
após qualquer alteração.

=======================================================
  TECNOLOGIAS UTILIZADAS
=======================================================
  Frontend : HTML5 / CSS3 / JavaScript (Vanilla)
  Backend  : Java 17 + Spring Boot 3.3 + JPA
  Banco    : MySQL (phpMyAdmin / XAMPP)
  API      : REST em localhost:8080

