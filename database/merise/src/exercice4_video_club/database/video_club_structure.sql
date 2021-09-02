DROP DATABASE IF EXISTS db_video_club;

CREATE DATABASE IF NOT EXISTS db_video_club;

USE db_video_club;

CREATE TABLE IF NOT EXISTS customers
(
    customer_id INT PRIMARY KEY,
    customer_firstname VARCHAR(64) NOT NULL,
    customer_lastname VARCHAR(64) NOT NULL,
    customer_nb_street INT NOT NULL,
    customer_street VARCHAR(255) NOT NULL,
    customer_postal_code INT NOT NULL,
    customer_city VARCHAR(64) NOT NULL,
    customer_deposit INT NOT NULL,
    customer_borrow_number INT(4) NULL
);

CREATE TABLE IF NOT EXISTS kind_of_movies
(
    typeofmovie_name VARCHAR(30) PRIMARY KEY,
    typeofmovie_public VARCHAR(30) NULL
);

CREATE TABLE IF NOT EXISTS movies
(
    movie_id INT PRIMARY KEY,
    movie_title VARCHAR(64) NOT NULL,
    movie_actorfistname VARCHAR(64) NOT NULL,
    movie_actorlastname VARCHAR(64) NOT NULL,
    movie_time TIME NOT NULL,
    movie_directorfistname VARCHAR(64) NOT NULL,
    movie_directorlastname VARCHAR(64) NOT NULL,
    typeofmovie_name VARCHAR(30) NOT NULL,
    FOREIGN KEY (typeofmovie_name) REFERENCES kind_of_movies(typeofmovie_name)
);

CREATE TABLE IF NOT EXISTS stores
(
    store_id INT PRIMARY KEY,
    store_name VARCHAR(32) NOT NULL,
    store_nb_street INT NOT NULL,
    store_street VARCHAR(255) NOT NULL,
    store_postal_code INT NOT NULL,
    store_street_additional VARCHAR(255) NOT NULL,
    store_city VARCHAR(64) NOT NULL
);

CREATE TABLE IF NOT EXISTS tapes
(
    tape_id INT PRIMARY KEY,
    tape_condition VARCHAR(16) NOT NULL,
    tape_commissioning DATE NOT NULL,
    tape_condition_def VARCHAR(255) NULL,
    tape_location_nb INT NULL,
    store_id INT NOT NULL,
    movie_id INT NOT NULL,
    FOREIGN KEY (store_id) REFERENCES stores(store_id),
    FOREIGN KEY (movie_id) REFERENCES movies(movie_id)
);

CREATE TABLE IF NOT EXISTS borrowings
(
    borrow_id INT PRIMARY KEY,
    borrow_date DATE NOT NULL,
    borrow_late BOOLEAN NULL,
    store_id INT NOT NULL,
    tape_id INT NOT NULL,
    customer_id INT NOT NULL,
    FOREIGN KEY (store_id) REFERENCES stores(store_id),
    FOREIGN KEY (tape_id) REFERENCES tapes(tape_id),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
