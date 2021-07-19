CREATE TABLE usuario (
                idUsuario INTEGER NOT NULL auto_increment,
                nome VARCHAR(50) NOT NULL,
				senha VARCHAR(50) NOT NULL,
                email VARCHAR(50) NOT NULL,
                 cargo VARCHAR(50) NOT NULL,
                CONSTRAINT Projeto_pk PRIMARY KEY (idUsuario)
);


CREATE TABLE Projeto (
                idProjeto INTEGER NOT NULL auto_increment,
                nomeProjeto VARCHAR(50) NOT NULL,
                situacao boolean NOT NULL,
                CONSTRAINT Projeto_pk PRIMARY KEY (IdProjeto)
);


CREATE TABLE Versao (
                idVersao INTEGER auto_increment primary key,
                idProjeto INTEGER not null,
                GMUD VARCHAR(50) NOT NULL,
                descricao VARCHAR(255) NOT NULL,
                situacao BOOLEAN NOT NULL,
                dataLancamento date NOT NULL,
                ordem INTEGER NOT NULL,
				numeroVersao VARCHAR(255) NOT NULL,
                foreign key (idProjeto) references projeto(idProjeto)
);

CREATE TABLE Tela (
                idTela INTEGER auto_increment primary key,
                idVersao INTEGER not null,
				dataCadastro date NOT NULL,
                nomeTela VARCHAR(255) NOT NULL,
				imagem VARCHAR(255) NOT NULL,
                situacao BOOLEAN NOT NULL,
                telaPai INTEGER not null,
                ordem INTEGER NOT NULL,
				urlog VARCHAR(50) NOT NULL,
				versaoOrigem INTEGER not null,
                foreign key (idVersao) references Versao(idVersao)
);

CREATE TABLE Evento (
             idEvento   INTEGER auto_increment primary key,
				idTela INTEGER not null,
				situacao boolean not null,
				ordem integer not null,
				parametros varchar(255) not null,
				foreign key (idTela) references Tela(idTela)
);

CREATE TABLE requisicao (
            idRequisicao INTEGER auto_increment primary key,
				idEvento INTEGER not null,
                urlHomolog varchar(255) not null,
                uriProd varchar(255) not null,
                descricao varchar(255) not null,
                requisicaoPai INTEGER not null,
                  camada varchar(255) not null,
				situacao boolean not null,
				ordem integer not null,
				foreign key (idEvento) references Evento(idEvento)
);

CREATE TABLE propriedade (
				idPropriedade INTEGER auto_increment primary key,
				idRequisicao INTEGER not null,
                tipoPropriedade varchar(255) not null,
                  chave varchar(255) not null,
				valor integer not null,
				ordem integer not null,
				foreign key (idRequisicao) references requisicao(idRequisicao)
);
