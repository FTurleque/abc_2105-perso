DROP DATABASE IF EXISTS db_airport;

CREATE DATABASE IF NOT EXISTS db_airport;

USE db_airport;

CREATE TABLE IF NOT EXISTS pilots
(
    pilot_id INT PRIMARY KEY,
    pilot_firstname VARCHAR(48) NOT NULL,
    pilot_lastname VARCHAR(48) NOT NULL,
    pilot_nb_street INT NOT NULL,
    pilot_street VARCHAR(255) NOT NULL,
    pilot_postal_code INT NOT NULL,
    pilot_city VARCHAR(64) NOT NULL,
    pilot_phone_number INT NOT NULL
);

CREATE TABLE IF NOT EXISTS planes
(
    plane_registration_number INT PRIMARY KEY,
    plane_purchase_date DATE NOT NULL,
    plane_name VARCHAR(32) NOT NULL,
    plane_constructor_name VARCHAR(32) NOT NULL,
    plane_engine_power VARCHAR(32) NOT NULL,
    plane_place_number INT NOT NULL
);

CREATE TABLE IF NOT EXISTS licenses
(
    pilot_licence_number VARCHAR(32) PRIMARY KEY,
    pilot_number_of_flights INT NOT NULL,
    pilot_hability VARCHAR(32) NOT NULL,
    plane_registration_number INT NOT NULL,
    pilot_id INT NOT NULL,
    FOREIGN KEY (plane_registration_number) REFERENCES planes(plane_registration_number),
    FOREIGN KEY (pilot_id) REFERENCES pilots(pilot_id)
);

CREATE TABLE IF NOT EXISTS mechanics
(
    mechanic_id INT PRIMARY KEY,
    mechanic_role VARCHAR(16) NOT NULL,
    mechanic_firstname VARCHAR(48) NOT NULL,
    mechanic_lastname VARCHAR(48) NOT NULL,
    mechanic_nb_street INT NOT NULL,
    mechanic_street VARCHAR(255) NOT NULL,
    mechanic_postal_code INT NOT NULL,
    mechanic_city VARCHAR(64) NOT NULL,
    mechanic_phone_number INT NOT NULL,
    mechanic_hability VARCHAR(32) NOT NULL
);

CREATE TABLE IF NOT EXISTS interventions
(
    intervention_id INT PRIMARY KEY,
    intervention_object VARCHAR(255) NOT NULL,
    intervention_date DATE NOT NULL,
    intervention_time TIME NOT NULL,
    plane_registration_number INT NOT NULL,
    FOREIGN KEY (plane_registration_number) REFERENCES planes(plane_registration_number)

);

CREATE TABLE IF NOT EXISTS owners
(
    owner_id INT PRIMARY KEY,
    owner_type VARCHAR(16) NOT NULL,
    owner_society_name VARCHAR(20) NOT NULL,
    owner_lastname VARCHAR(48) NULL,
    owner_firdtname VARCHAR(48) NULL,
    owner_nb_street INT NOT NULL,
    owner_street VARCHAR(255) NOT NULL,
    owner_postal_code INT NOT NULL,
    owner_city VARCHAR(64) NOT NULL,
    owner_phone_number INT NOT NULL,
    plane_registration_number INT NOT NULL,
    FOREIGN KEY (plane_registration_number) REFERENCES planes(plane_registration_number)
);

CREATE TABLE IF NOT EXISTS make
(
    intervention_id INT NOT NULL,
    mechanic_id INT NOT NULL,
    FOREIGN KEY (intervention_id) REFERENCES interventions(intervention_id),
    FOREIGN KEY (mechanic_id) REFERENCES mechanics(mechanic_id)
);
