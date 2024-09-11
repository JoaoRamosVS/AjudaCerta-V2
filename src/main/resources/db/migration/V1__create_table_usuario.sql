CREATE TABLE tb_usuario (
	usuario_id BIGINT PRIMARY KEY IDENTITY(1000,1),
	nome VARCHAR(MAX) NOT NULL,
	tipo_usuario VARCHAR(12) NOT NULL,
	tipo_pessoa VARCHAR(15) NOT NULL,
	documento VARCHAR(14) UNIQUE NOT NULL,
	data_nascimento DATE,
	genero VARCHAR(MAX),
	email VARCHAR(100) UNIQUE NOT NULL,
	senha VARCHAR(MAX) NOT NULL,
	ultimo_acesso DATETIME,
	foto VARCHAR(MAX)
);
