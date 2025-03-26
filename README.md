# Projeto de Automação de Testes com Selenium e Maven

Este é um projeto de automação de testes utilizando o **Selenium WebDriver** com **Maven**, escrito em **Java**. O objetivo é realizar a automação do processo de compra em um site de ecommerce, verificando funcionalidades como cadastro, login, adição de produtos no carrinho e finalização da compra.

## Tecnologias Usadas

- **Java** (Versão 23)
- **Selenium WebDriver** (Versão X.X.X)
- **Maven** (Versão 3.8.4)
- **ChromeDriver** (Versão X.X.X)

## Pré-requisitos

Antes de rodar os testes, certifique-se de que você tem as seguintes dependências instaladas:

1. **Java 23** (ou versão compatível):
    - Você pode baixar o JDK (Java Development Kit) da página oficial: https://www.oracle.com/java/technologies/javase-jdk23-downloads.html

2. **Maven 3.8.4**:
    - Você pode baixar o Maven da página oficial: https://maven.apache.org/download.cgi

3. **ChromeDriver** (versão compatível com sua versão do Google Chrome):
    - Baixe o ChromeDriver aqui: https://sites.google.com/chromium.org/driver/

4. **IDE de desenvolvimento** (opcional):
    - **IntelliJ IDEA** ou **Eclipse** são as IDEs mais comuns para projetos Java.
    - Se estiver usando o **IntelliJ IDEA**, certifique-se de que o Maven está configurado corretamente.

## Instalação

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. **Navegue até o diretório do projeto**:
    ```bash
    cd seu-repositorio
    ```

3. **Compile o projeto usando Maven**:
    - Caso o Maven esteja corretamente instalado, rode o seguinte comando no terminal:
    ```bash
    mvn clean install
    ```

   Isso fará o Maven baixar todas as dependências necessárias e compilar o projeto.

## Como Rodar os Testes

Para rodar os testes, basta executar o seguinte comando no terminal, dentro do diretório do projeto:

```bash
mvn test
