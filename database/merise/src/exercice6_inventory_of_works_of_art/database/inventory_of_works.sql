DROP DATABASE IF EXISTS db_works;

CREATE DATABASE IF NOT EXISTS db_works;

USE db_works;

CREATE TABLE IF NOT EXISTS works
(
    work_id INT PRIMARY KEY,
    work_type VARCHAR(24) NOT NULL,
    work_title VARCHAR(48) NOT NULL,
    work_year DATE NOT NULL,
    work_width INT NOT NULL,
    work_height INT NOT NULL,
    work_lenght INT NOT NULL,
    work_copy_owned INT(11) NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS museums
(
    museum_id INT PRIMARY KEY,
    museum_name VARCHAR(48) NOT NULL,
    museum_city VARCHAR(48) NOT NULL,
    work_id INT NOT NULL,
    FOREIGN KEY (work_id) REFERENCES works(work_id)
);

CREATE TABLE IF NOT EXISTS artists
(
    artist_id INT PRIMARY KEY,
    artist_firstname VARCHAR(48) NOT NULL,
    artist_lastname VARCHAR(48) NOT NULL,
    artist_nationality VARCHAR(48) NOT NULL,
    artist_birthdate DATE NOT NULL,
    artist_deathdate DATE NULL
);

CREATE TABLE IF NOT EXISTS artistic_currents
(
    artistic_current_name VARCHAR(24) PRIMARY KEY,
    artistic_current_start DATE NOT NULL,
    artistic_current_end DATE NULL,
    artistic_current_description VARCHAR(255) NOT NULL,
    work_id INT NOT NULL,
    FOREIGN KEY (work_id) REFERENCES works(work_id)
);

CREATE TABLE IF NOT EXISTS design
(
    work_id INT NOT NULL,
    artist_id INT NOT NULL,
    FOREIGN KEY (work_id) REFERENCES works(work_id),
    FOREIGN KEY (artist_id) REFERENCES artists(artist_id)
);

CREATE TABLE IF NOT EXISTS associate
(
    artist_id INT NOT NULL,
    artistic_current_name VARCHAR(24) NOT NULL,
    FOREIGN KEY (artist_id) REFERENCES artists(artist_id),
    FOREIGN KEY (artistic_current_name) REFERENCES artistic_currents(artistic_current_name)
);