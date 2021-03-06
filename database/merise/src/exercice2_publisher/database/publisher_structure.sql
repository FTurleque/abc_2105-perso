DROP DATABASE IF EXISTS db_publisher;

CREATE DATABASE IF NOT EXISTS db_publisher;


USE db_publisher;

CREATE TABLE IF NOT EXISTS authors
(
	author_id INT PRIMARY KEY,
	author_firstname VARCHAR(48) NOT NULL,
	author_lastname VARCHAR(48) NOT NULL,
	author_nickname VARCHAR(48) NULL
);

CREATE TABLE IF NOT EXISTS booksellers
(
	bookseller_id INT PRIMARY KEY,
	bookseller_firstname VARCHAR(48) NOT NULL,
	bookseller_lastname VARCHAR(48) NOT NULL,
	bookseller_nb_street INT NOT NULL,
	bookseller_street VARCHAR(255) NOT NULL,
	bookseller_postal_code INT NOT NULL,
	bookseller_city VARCHAR(64) NOT NULL
);

CREATE TABLE IF NOT EXISTS books
(
	book_isbn INT PRIMARY KEY,
	book_title VARCHAR(24) NOT NULL,
	book_price INT(4) NOT NULL,
	book_awarded VARCHAR(24) NULL
);

CREATE TABLE IF NOT EXISTS editions
(
	edition_number VARCHAR(32) PRIMARY KEY,
	edition_date DATE NOT NULL,
	edition_copy_number INT NOT NULL
);

CREATE TABLE IF NOT EXISTS redact
(
	book_isbn INT NOT NULL,
	author_id INT NOT NULL,
	FOREIGN KEY (book_isbn) REFERENCES books(book_isbn),
	FOREIGN KEY (author_id) REFERENCES authors(author_id)
);

CREATE TABLE IF NOT EXISTS ordering
(
	book_isbn INT NOT NULL,
	bookseller_id INT NOT NULL,
	FOREIGN KEY (book_isbn) REFERENCES books(book_isbn),
	FOREIGN KEY (bookseller_id) REFERENCES booksellers(bookseller_id)
);

CREATE TABLE IF NOT EXISTS integrate
(
	book_isbn INT NOT NULL,
	edition_number VARCHAR(32) NOT NULL,
	FOREIGN KEY (book_isbn) REFERENCES books(book_isbn),
	FOREIGN KEY (edition_number) REFERENCES editions(edition_number)
);