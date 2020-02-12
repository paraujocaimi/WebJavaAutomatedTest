# Java Framework for Web Automated Test 

## Description

Framework to develop web automated test

## Pré-requisitos

- Java 1.8+
- xampp

## Estrutura de pastas 

Project Source Three :
```
├── src
│   ├── main
│   │   └── java
│   │   └── resources
│   ├── test
│   │   ├── java
│   │   │  └── elementPage
│   │   │  └── page
│   │   │  └── step
│   │   │  └── utils
│   │   ├── resources
│   │   │  └── features
│   │   │  └── img
├── target
├── pom.xml
├── README.md


```

## Project Description

Elaborar e executar planos de testes automatizados utilizando a ferramenta Selenium. 

Um cliente possui um software web para sua livraria, porém ele deseja realizar algumas melhoras no software. Em reunião foi decidido será preciso automatizar a etapa de testes para posteriormente realizar as modificações necessária na página do cliente. Desta forma o analista de testes definiu que se precisa criar scripts para testas as seguintes funções do software:

•Cadastro de livros

•Pesquisa de livros (por autor, titulo, código e ISBN)

•Exclusão de livros

## Execute Test

 -	Colocar a pasta LivrariaWeb na pasta xampp\htdocs
 - 	Criar o banco de dados da aplicação: executar o código SQL contido no arquivo comando_sql. Executar no phpmyadmin ou no workbench.
 -	Abrir o Xampp e ligar os servidores Apache e Mysql. 
 
<b>Feature:</b> 

No arquivo Biblioteca.feature dentro da pasta src/test/resource package feature, está o nosso BDD de teste 

![Biblioteca BDD](FrameworkJavaWeb\src\test\resources\img\bibliotecaFeature.jpg)


<b>Runner:</b> 

No arquivo runTest.java na parta srt/test/java package test está o nosso executor. 

![Biblioteca BDD](FrameworkJavaWeb\src\test\resources\img\runnerBiblioteca.jpg)


## Envolve

Priscila de Araujo Caimi - paraujocaimi@gmail.com

