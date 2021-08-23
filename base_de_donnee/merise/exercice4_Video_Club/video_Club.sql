DROP DATABASE IF EXISTS db_video_club;

CREATE DATABASE IF NOT EXISTS db_video_club;

use db_video_club;

CREATE TABLE IF NOT EXISTS customers
(
    customer_id INT(11) PRIMARY KEY,
    customer_firstname VARCHAR(64) NOT NULL,
    customer_lastname VARCHAR(64) NOT NULL,
    customer_address VARCHAR(255) NOT NULL,
    customer_borrow_number INT(4) NULL,
    customer_deposit INT(11) NOT NULL,
)