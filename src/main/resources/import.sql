--roles
INSERT INTO roles(name) VALUES('RECTOR');
INSERT INTO roles(name) VALUES('DOCENTE');
INSERT INTO roles(name) VALUES('ESTUDIANTE');

--Docentes
INSERT INTO docentes(docente) VALUES('MIGUEL ANGEL CORDOBA');
INSERT INTO docentes(docente) VALUES('RAFAEL POMBO');
INSERT INTO docentes(docente) VALUES('DIEGO CARVAJAL');

--usuarios
INSERT INTO users(enable, user_id, password, username)
VALUES(true, 1, '$2a$12$srWg2Z02YygUBE69ovm3CehUW7imaITGpsLO3WNRD92gLBbabNtkK', 'miguel.angel.cordoba');
--contraseña miguel123
INSERT INTO users(enable, user_id, password, username)
VALUES(true, 2, '$2a$12$8S1ScDbb5lc21YqTtapPPOkXqltDs2jTGiQSTUeT2LfDc99b8Yppe', 'rafael.pombo');
-- contraseña rafael123
INSERT INTO users(enable, user_id, password, username)
VALUES(true, 3, '$2a$12$quSZ0RIBjbmBEjDpSmLEdeV2K0gyyBKy2sD/8HwyjMRbWcxEwxZK.', 'diego.carvajal');
-- contraseña diego123
INSERT INTO users(enable, user_id, password, username)
VALUES(true, 4, '$2a$12$ovpfXyMkk44/qCjlsz9Kw.j2Fd/qah5b.74mTKeUWuzKJF96AEWrS', 'nicolas.mosquera');
-- contraseña nicolas123
INSERT INTO users(enable, user_id, password, username)
VALUES(true, 5, '$2a$12$ljgLJSKPyHl7ZjiwmecKpeek5cHAgWv5tUo1eOUnsLK.D5vCNb55e', 'luis.fajardo');
-- contraseña luis123

INSERT INTO users_role(role_id, user_id) VALUES (1,1);
INSERT INTO users_role(role_id, user_id) VALUES (1,2);
INSERT INTO users_role(role_id, user_id) VALUES (1,3);
INSERT INTO users_role(role_id, user_id) VALUES (1,4);
INSERT INTO users_role(role_id, user_id) VALUES (1,5);


