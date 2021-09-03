DROP DATABASE IF EXISTS db_library;

CREATE DATABASE IF NOT EXISTS db_library;

USE db_library;

CREATE TABLE IF NOT EXISTS customers
(
	customer_id INT PRIMARY KEY,
    customer_firstname VARCHAR(64) NOT NULL,
    customer_lastname VARCHAR(64) NOT NULL,
    customer_street_nb INT NOT NULL,
    customer_street VARCHAR(255) NOT NULL,
    customer_postal_code INT NOT NULL,
    customer_deposit INT NOT NULL
);

CREATE TABLE IF NOT EXISTS books
(
	book_id INT PRIMARY KEY,
    book_title VARCHAR(64) NOT NULL,
    book_publisher VARCHAR(32) NULL,
    book_author VARCHAR(32) NULL,
    book_purchasedate DATE NOT NULL,
    book_condition VARCHAR(16)
);

CREATE TABLE IF NOT EXISTS borrowings
(
    borrow_id INT PRIMARY KEY,
    borrow_date DATE NOT NULL,
    borrow_nb TINYINT NOT NULL,
    borrow_late BOOLEAN NULL,
    customer_id INT NOT NULL,
    book_id INT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);