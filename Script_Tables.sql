CREATE TABLE Projeto(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    create_time DATETIME COMMENT 'Create Time Project',
    update_time DATETIME COMMENT 'Update Time Project',
    descricao VARCHAR(500) NOT NULL,
    tecnologia VARCHAR(50) NOT NULL,
    criador VARCHAR(50) NOT NULL

) DEFAULT CHARSET UTF8 COMMENT 'Tabela para Projetos';

CREATE TABLE DevCliente(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    logon VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    qtdProjetos int DEFAULT 1
) DEFAULT CHARSET UTF8 COMMENT 'Tabela para Usuario DevCliente';

CREATE TABLE Programador(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    logon VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    especialidade VARCHAR(50) NOT NULL
) DEFAULT CHARSET UTF8 COMMENT 'Tabela para Usuario Programador';
