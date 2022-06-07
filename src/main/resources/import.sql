INSERT INTO tb_sala(nome, localizacao, disponibilidade) VALUES ('Sala Reuniao 1', 'primeiro andar', 'indisponivel');
INSERT INTO tb_sala(nome, localizacao, disponibilidade) VALUES ('Sala Reuniao 2', 'segundo andar', 'disponivel');
INSERT INTO tb_sala(nome, localizacao, disponibilidade) VALUES ('Sala Reuniao 3', 'terceiro andar', 'disponivel');

INSERT INTO tb_reuniao(data) VALUES (TIMESTAMP WITH TIME ZONE '2022-06-01T10:00:00Z');

INSERT INTO tb_sala_reuniao (sala_id, reuniao_id) VALUES (1, 1);