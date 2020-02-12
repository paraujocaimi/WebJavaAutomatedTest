create database livraria;
CREATE TABLE livros( 
	idlivros int NOT NULL AUTO_INCREMENT, 
	ISBN varchar(45) NOT NULL, 
	autor varchar(45) NOT NULL, 
	titulo varchar(45) NOT NULL, 
	valor decimal(15,2) NOT NULL, 
	primary KEY(idlivros) )