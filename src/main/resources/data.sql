INSERT INTO Cliente (nome, celular, telefone) VALUES ('Rafael Fujii', 994244069, 35864827);

INSERT INTO Endereco (bairro, cep, complemento, logradouro, num_endereco, obs, cliente_id) VALUES ('Inhauma', 20765040, 'Rua A, cs 55, aprt 201', 'Rua Engenho da Rainha', 316, 'Interforne 55201, Proximo 44 delegacia', 1);

INSERT INTO Pizza (com_ou_sem_borda, qnt_sabores, tamanho) VALUES (true, 1, 'Grande');

INSERT INTO Borda (sabor) VALUES ('Chocolate');
INSERT INTO Borda (sabor) VALUES ('Cheddar');
INSERT INTO Borda (sabor) VALUES ('Catupiry');

INSERT INTO Sabor (sabor, valor) VALUES ('Margherita', 40.50);
INSERT INTO Sabor (sabor, valor) VALUES ('Calabresa', 42.75);
INSERT INTO Sabor (sabor, valor) VALUES ('Portuguesa', 50.00);

