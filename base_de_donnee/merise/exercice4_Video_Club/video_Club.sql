DROP DATABASE IF EXISTS db_video_club;

CREATE DATABASE IF NOT EXISTS db_video_club;

use db_video_club;

CREATE TABLE IF NOT EXISTS borrowings
(
    borrow_id INT(11) PRIMARY KEY,
    borrow_late BOOLEAN NULL,
    borrow_date DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS tapes
(
    tape_id INT(11) PRIMARY KEY,
    movie_title VARCHAR(64) NOT NULL,
    movie_actorfistname VARCHAR(64) NOT NULL,
    movie_actorlastname VARCHAR(64) NOT NULL,
    movie_time TIME NOT NULL,
    movie_directorfistname VARCHAR(64) NOT NULL,
    movie_directorlastname VARCHAR(64) NOT NULL
);

CREATE TABLE IF NOT EXISTS customers
(
    customer_id INT(11) PRIMARY KEY,
    customer_firstname VARCHAR(64) NOT NULL,
    customer_lastname VARCHAR(64) NOT NULL,
    customer_address VARCHAR(255) NOT NULL,
    customer_borrow_number INT(4) NULL,
    customer_deposit INT(11) NOT NULL,
    borrow_id INT(11) NOT NULL,
    FOREIGN KEY (borrow_id) REFERENCES borrowings(borrow_id)
);

CREATE TABLE IF NOT EXISTS kind_of_movies
(
    typeofmovie_name VARCHAR(30) PRIMARY KEY,
    typeofmovie_public VARCHAR(30) NULL,
    tape_id INT(11) NOT NULL,
    FOREIGN KEY (tape_id) REFERENCES tapes(tape_id)
);

CREATE TABLE IF NOT EXISTS choose
(
    borrow_id INT(11) NOT NULL,
    tape_id INT(11) NOT NULL,
    FOREIGN KEY (tape_id) REFERENCES tapes(tape_id),
    FOREIGN KEY (borrow_id) REFERENCES borrowings(borrow_id)
);