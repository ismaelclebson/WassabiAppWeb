CREATE TABLE `Cliente` (
	`cliente_id` INT(30) NOT NULL AUTO_INCREMENT,
	`cliente_nome` varchar(80) NOT NULL,
	`cliente_cpf` varchar(14) NOT NULL UNIQUE,
	`cliente_endereco` varchar(80) NOT NULL,
	`cliente_cartao` varchar(100) NOT NULL,
	`cliente_telefone` varchar(20) NOT NULL,
	PRIMARY KEY (`cliente_id`)
);

CREATE TABLE `Produto` (
	`produto_id` INT(30) NOT NULL AUTO_INCREMENT,
	`produto_nome` varchar(80) NOT NULL,
	`produto_preco` DOUBLE(30,2) NOT NULL,
	`produto_descricao` varchar(80) NOT NULL,
	`produto_categoria` INT(10) NOT NULL,
	PRIMARY KEY (`produto_id`)
);

CREATE TABLE `Venda` (
	`Venda_id` INT(30) NOT NULL AUTO_INCREMENT,
	`Venda_cliente` INT(30) NOT NULL,
	`Venda_total` DOUBLE(30,2) NOT NULL DEFAULT '0.0',
	`Venda_data` DATETIME NOT NULL,
	PRIMARY KEY (`Venda_id`)
);

CREATE TABLE `venda_has_produto` (
	`venda_id` INT(30) NOT NULL,
	`produto_id` INT(30) NOT NULL,
	`quantidade` INT(30) NOT NULL DEFAULT '1',
	PRIMARY KEY (`venda_id`,`produto_id`)
);

CREATE TABLE `Categoria` (
	`categoria_id` INT(30) NOT NULL AUTO_INCREMENT,
	`categoria_nome` varchar(30) NOT NULL,
	PRIMARY KEY (`categoria_id`)
);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk0` FOREIGN KEY (`produto_categoria`) REFERENCES `Categoria`(`categoria_id`);

ALTER TABLE `Venda` ADD CONSTRAINT `Venda_fk0` FOREIGN KEY (`Venda_cliente`) REFERENCES `Cliente`(`cliente_id`);

ALTER TABLE `venda_has_produto` ADD CONSTRAINT `venda_has_produto_fk0` FOREIGN KEY (`venda_id`) REFERENCES `Venda`(`Venda_id`);

ALTER TABLE `venda_has_produto` ADD CONSTRAINT `venda_has_produto_fk1` FOREIGN KEY (`produto_id`) REFERENCES `Produto`(`produto_id`);

