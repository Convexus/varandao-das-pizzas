INSERT INTO Cliente (nome, celular, telefone) VALUES ('Rafael Fujii', 994244069, 35864827);
INSERT INTO Cliente (nome, celular, telefone) VALUES ('Gabriela Sueli Carolina Ferreira', 983896456, 25904239);

INSERT INTO Endereco (bairro, cep, complemento, logradouro, num_endereco, obs, cliente_id) VALUES ('Inhauma', 20765040, 'Rua A, cs 55, aprt 201', 'Rua Engenho da Rainha', 316, 'Interforne 55201, Proximo 44 delegacia', 1);
INSERT INTO Endereco (bairro, cep, logradouro, num_endereco, cliente_id) VALUES ('Centro', 20011010, 'Beco dos Barbeiros', 111, 2);
INSERT INTO Endereco (bairro, cep, logradouro, num_endereco, cliente_id) VALUES ('Centro', 20011010, 'Beco dos Barbeiros', 111, 1);

INSERT INTO Borda (sabor) VALUES ('Chocolate');
INSERT INTO Borda (sabor) VALUES ('Cheddar');
INSERT INTO Borda (sabor) VALUES ('Catupiry');

INSERT INTO Sabor (sabor, valor) VALUES ('Margherita', 40.50);
INSERT INTO Sabor (sabor, valor) VALUES ('Calabresa', 42.75);
INSERT INTO Sabor (sabor, valor) VALUES ('Portuguesa', 50.00);

INSERT INTO Acompanhamento (descricao, valor) VALUES ('Coca-Cola 2L', 10.00);
INSERT INTO Acompanhamento (descricao, valor) VALUES ('Pepsi 2L', 10.00);