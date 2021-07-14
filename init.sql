CREATE DATABASE IF NOT EXISTS dbclinic;
USE dbclinic;

CREATE TABLE address (
  address_id INT NOT NULL,
  cep VARCHAR(8) NOT NULL,
  street VARCHAR(140) NOT NULL,
  district VARCHAR(140) NOT NULL,
  number VARCHAR(3) NOT NULL,
  PRIMARY KEY (address_id));

CREATE TABLE city (
  city_id INT NOT NULL,
  county VARCHAR(80) NOT NULL,
  state VARCHAR(80) NOT NULL,
  PRIMARY KEY (city_id));

CREATE TABLE tutor (
  tutor_id INT NOT NULL,
  cpf VARCHAR(11) NOT NULL,
  name VARCHAR(140) NOT NULL,
  rg VARCHAR(11) NOT NULL,
  age VARCHAR(2) NOT NULL,
  email VARCHAR(256) NOT NULL,
  nationality VARCHAR(20) NOT NULL,
  phone VARCHAR(15),
  city_id INT NOT NULL,
  address_id INT NOT NULL,
  PRIMARY KEY (tutor_id),
  FOREIGN KEY (city_id) references city(city_id),
  FOREIGN KEY (address_id) references address(address_id));

CREATE TABLE animal (
  animal_id INT NOT NULL,
  name VARCHAR(140) NOT NULL,
  age VARCHAR(4) NOT NULL,
  breed VARCHAR(40) NOT NULL,
  species VARCHAR(40) NOT NULL,
  sex VARCHAR(1) NOT NULL,
  tutor_id INT NOT NULL,
  PRIMARY KEY (animal_id),
  FOREIGN KEY (tutor_id) references tutor(tutor_id));

