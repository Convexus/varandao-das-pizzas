INSERT INTO Cliente (nome, celular, telefone) VALUES ('Rafael Fujii', 994244069, 35864827);
INSERT INTO Cliente (nome, celular, telefone) VALUES ('Gabriela Sueli Carolina Ferreira', 983896456, 25904239);

INSERT INTO Endereco (bairro, cep, complemento, logradouro, num_endereco, obs, cliente_id) VALUES ('Inhauma', 20765040, 'Rua A, cs 55, aprt 201', 'Rua Engenho da Rainha', 316, 'Interforne 55201, Proximo 44 delegacia', 1);
INSERT INTO Endereco (bairro, cep, logradouro, num_endereco, cliente_id) VALUES ('Centro', 20011010, 'Beco dos Barbeiros', 111, 2);
INSERT INTO Endereco (bairro, cep, logradouro, num_endereco, cliente_id) VALUES ('Centro', 20011010, 'Beco dos Barbeiros', 111, 1);

INSERT INTO Borda (sabor) VALUES ('Chocolate');
INSERT INTO Borda (sabor) VALUES ('Cheddar');
INSERT INTO Borda (sabor) VALUES ('Catupiry');

INSERT INTO Sabor (sabor) VALUES ('Margherita');
INSERT INTO Sabor (sabor) VALUES ('Calabresa');
INSERT INTO Sabor (sabor) VALUES ('Portuguesa');

INSERT INTO Acompanhamento (descricao, valor) VALUES ('Coca-Cola 2L', 10.00);
INSERT INTO Acompanhamento (descricao, valor) VALUES ('Pepsi 2L', 10.00);

INSERT INTO Tamanho (tamanho, valor) VALUES ('Super',65.00);
INSERT INTO Tamanho (tamanho, valor) VALUES ('Maraca',58.00);
INSERT INTO Tamanho (tamanho, valor) VALUES ('Grande',50.00);
INSERT INTO Tamanho (tamanho, valor) VALUES ('Media',40.00);
INSERT INTO Tamanho (tamanho, valor) VALUES ('Pequena',30.00);

INSERT INTO Tamanho_acompanhamentos (tamanho_id, acompanhamentos_id) VALUES (1,1);
INSERT INTO Tamanho_acompanhamentos (tamanho_id, acompanhamentos_id) VALUES (1,2);
INSERT INTO Tamanho_acompanhamentos (tamanho_id, acompanhamentos_id) VALUES (2,1);
INSERT INTO Tamanho_acompanhamentos (tamanho_id, acompanhamentos_id) VALUES (2,2);
INSERT INTO Tamanho_acompanhamentos (tamanho_id, acompanhamentos_id) VALUES (3,1);
INSERT INTO Tamanho_acompanhamentos (tamanho_id, acompanhamentos_id) VALUES (4,1);
INSERT INTO Tamanho_acompanhamentos (tamanho_id, acompanhamentos_id) VALUES (5,1);