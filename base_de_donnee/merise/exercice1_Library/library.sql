DROP DATABASE IF EXISTS db_library;

CREATE DATABASE IF NOT EXISTS db_library;

USE db_library;

CREATE TABLE IF NOT EXISTS customers
(
	customer_id INT(11) PRIMARY KEY,
    customer_firstname VARCHAR(64) NOT NULL,
    customer_lastname VARCHAR(64) NOT NULL,
    customer_address VARCHAR(255) NOT NULL,
    customer_deposit INT(11) NOT NULL,
    customer_loans_date DATE NOT NULL,
    customer_loans_nb INT(4) NULL,
    customer_loans_late BOOLEAN NULL
);

CREATE TABLE IF NOT EXISTS books
(
	book_id INT(11) PRIMARY KEY,
    book_title VARCHAR(64) NOT NULL,
    book_publisher VARCHAR(32) NULL,
    book_author VARCHAR(32) NULL,
    book_purchasedate DATE NOT NULL,
    book_condition VARCHAR(16),
    customer_id INT(11) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
