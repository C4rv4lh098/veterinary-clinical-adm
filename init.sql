CREATE DATABASE IF NOT EXISTS dbclinic;
USE dbclinic;

CREATE TABLE tutor (
  tutor_id INT AUTO_INCREMENT NOT NULL,
  cpf VARCHAR(14) NOT NULL,
  name VARCHAR(140) NOT NULL,
  rg VARCHAR(11) NOT NULL,
  age VARCHAR(2) NOT NULL,
  email VARCHAR(256) NOT NULL,
  nationality VARCHAR(20) NOT NULL,
  phone VARCHAR(15) NOT NULL,

  PRIMARY KEY (tutor_id),

  cep VARCHAR(8) NOT NULL,
  street VARCHAR(140) NOT NULL,
  district VARCHAR(140) NOT NULL,
  number VARCHAR(3) NOT NULL,
  county VARCHAR(80) NOT NULL,
  state VARCHAR(80) NOT NULL);

CREATE TABLE animal (
  animal_id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(140) NOT NULL,
  age VARCHAR(2) NOT NULL,
  breed VARCHAR(40) NOT NULL,
  species VARCHAR(40) NOT NULL,
  sex VARCHAR(1) NOT NULL,
  tutor_id INT NOT NULL,
  PRIMARY KEY (animal_id),
  FOREIGN KEY (tutor_id) references tutor(tutor_id));


CREATE TABLE agendamento (
  consulta_id INT NOT NULL,
  data DATE NOT NULL,
  horain TIME NOT NULL,
  horaout TIME NOT NULL,
  animal_id INT NOT NULL,
  tutor_id INT NOT NULL,
  PRIMARY KEY (consulta_id),
  FOREIGN KEY (animal_id) references animal(animal_id),
  FOREIGN KEY (tutor_id) references tutor(tutor_id));


-- INSERT INTO dbclinic.tutor
INSERT INTO tutor(tutor_id, cpf, name, rg, age, email, nationality, phone, cep, street, district, number, county, state) 
VALUES (1,'000.000.000-00','Victoria Senedesse','0000000-0','21','email1@email.com','Brasil','(92)9999-0000','00000000','Rua Exemplo 1','Flores','123','Manaus','Amazonas');

-- VALUES ('1','000.000.000-00','Victoria','0000000-0','21','email1@email.com','Brasil','(00)00000-0000','00000-000','Rua Exemplo 1','Flores','123','Manaus','Amazonas')

-- INSERT INTO dbclinic.animal
INSERT INTO animal(animal_id, name, age, breed, species, sex, tutor_id)
VALUES (1,'Bethoven','12','srd','canis','M',1);

-- -- INSERT INTO dbclinic.tutor
INSERT INTO tutor(tutor_id, cpf, name, rg, age, email, nationality, phone, cep, street, district, number, county, state) 
VALUES (2,'000.000.000-01','Rodrigo Moura','0000000-1','23','email2@email.com','Brasil','(92)9999-0001','00000001','Rua Exemplo 2','Aleixo','124','Manaus','Amazonas');

-- -- INSERT INTO dbclinic.animal
INSERT INTO animal(animal_id, name, age, breed, species, sex, tutor_id)
VALUES (2,'Ethos','5','shinauzer','canis','M',2), (3,'Dandara','6','Hitvailer','canis','M',2), (4,'Dexter','4','Hitvailer','canis','M',2);

-- -- INSERT INTO dbclinic.tutor
INSERT INTO tutor(tutor_id, cpf, name, rg, age, email, nationality, phone, cep, street, district, number, county, state) 
VALUES (3,'000.000.000-03','Raphaela Goes','0000000-2','23','email3@email.com','Brasil','(92)9999-0002','00000002','Rua Exemplo 3','Cidade Nova','125','Manaus','Amazonas');

-- -- INSERT INTO dbclinic.animal
INSERT INTO animal(animal_id, name, age, breed, species, sex, tutor_id)
VALUES (5,'Bento','1','srd','canis','M',3);

-- -- INSERT INTO dbclinic.agendamento
INSERT INTO agendamento(consulta_id, data, horain, horaout, animal_id, tutor_id)
VALUES (1,'2021/06/18','16:30.0000000','17:00.0000000',1,1), (2,'2021/06/18','17:30.0000000','18:00.0000000',2,2), (3,'2021/06/18','14:00.0000000','14:30.0000000',5,3);