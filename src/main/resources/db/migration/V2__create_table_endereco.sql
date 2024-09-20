CREATE TABLE tb_endereco (
	endereco_id BIGINT PRIMARY KEY IDENTITY(2000, 1),
	rua VARCHAR(MAX) NOT NULL,
	numero VARCHAR(MAX) NOT NULL,
	bairro VARCHAR(MAX) NOT NULL,
	complemento VARCHAR(MAX),
	bloco VARCHAR(MAX),
	cidade VARCHAR(MAX) NOT NULL,
	estado VARCHAR(MAX) NOT NULL,
	cep CHAR(8) UNIQUE NOT NULL
);

ALTER TABLE tb_usuario ADD endereco_id BIGINT NOT NULL;
ALTER TABLE tb_usuario ADD CONSTRAINT FK_UsuarioEndereco_endereco_id FOREIGN KEY (endereco_id) REFERENCES tb_endereco(endereco_id);

INSERT INTO tb_endereco VALUES ('Avenida Josino Vieira de Goes', '1091', 'Jardim Tremembé', null, null, 'São Paulo', 'São Paulo', '02319000');
