<p align="center">
<img src="https://1000logos.net/wp-content/uploads/2020/09/Java-Logo.png" alt="spring and spring boot logos" height="170px" width="260px">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/java-1.8-brightgreen.svg" alt="Java">
</p>

# CLINICA-MEDICA-GUI

Este projeto é uma implementação simples de uma aplicação de clínica médica desenvolvida durante o meu curso de graduação em Sistemas de Informação na Unifacol. A proposta do projeto era criar uma interface gráfica utilizando a biblioteca Swing em Java para permitir o gerenciamento básico de uma clínica médica, como o cadastro de pacientes, médicos e agendamento de consultas.

## Requisitos

Para construir e executar o aplicativo, você precisa:

- [JDK 8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
- [Maven](https://maven.apache.org)
- [MySQL](https://www.mysql.com/downloads/)


## Configuração do Banco de Dados
Antes de executar o projeto, siga os passos abaixo para configurar o banco de dados:

1. Abra o arquivo ConnectionFactory.java, localizado na pasta src do projeto.

2. Procure pelo método que estabelece a conexão com o banco de dados.

3. Modifique as configurações de conexão, como o nome do banco de dados, nome de usuário e senha, de acordo com o seu ambiente local ou servidor de banco de dados.

4. Certifique-se de que você possui um servidor de banco de dados MySQL instalado e em execução.

5. Crie um banco de dados com o nome "clinica" em seu servidor.

6. Na pasta db, você encontrará os scripts SQL para criação das tabelas necessárias. Execute esses scripts no banco de dados "clinica" para criar a estrutura necessária.

## Executando o Projeto
Após configurar o banco de dados e executar os scripts de criação das tabelas, siga os passos abaixo para executar o projeto:

1. Localize a pasta main do projeto, onde se encontra o arquivo Main.java.

2. Abra um ambiente de desenvolvimento Java (ex: Eclipse, IntelliJ) ou um terminal.

3. Compile e execute a classe Main.java. (javac Main.java)

4. A interface gráfica da aplicação será iniciada, e você poderá começar a utilizar o sistema de gerenciamento da Clínica Médica.

5. Para obter as credenciais de acesso, você pode executar consultas de SELECT nas tabelas de "medico", "funcionario" ou "administrador", dependendo do seu papel no sistema. As informações necessárias para o login, como nome de usuário e senha, podem ser encontradas nessas tabelas.
##
![Captura de tela de 2023-07-18 14-29-55](https://github.com/c-henrique-dev/clinica-medica-GUI/assets/70810148/2ac7d8b4-4b5b-4523-9afd-5d9d4bf2e9e2)
   
![Captura de tela de 2023-07-18 14-28-00](https://github.com/c-henrique-dev/clinica-medica-GUI/assets/70810148/9c842dd1-a0cc-4aea-9d99-a769958e6cf4)

