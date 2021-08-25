DROP DATABASE IF EXISTS db_horse_racing;

CREATE DATABASE IF NOT EXISTS db_horse_racing;

USE db_horse_racing;

CREATE TABLE IF NOT EXISTS horses
(
    horse_name VARCHAR(20) PRIMARY KEY,
    horse_number INT(11) NOT NULL
);

CREATE TABLE IF NOT EXISTS bets
(
    bet_id INT(11) PRIMARY KEY,
    bet_type VARCHAR(20) NOT NULL,
    sum_of_bet INT(11) NOT NULL,
    order_number_bet VARCHAR(48) NOT NULL,
    bet_winnings INT(11) NOT NULL
);

CREATE TABLE IF NOT EXISTS races
(
    race_name VARCHAR(48) PRIMARY KEY,
    race_date DATE NOT NULL,
    race_result VARCHAR(48) NOT NULL,
    horse_name VARCHAR(20) NOT NULL,
    FOREIGN KEY (horse_name) REFERENCES horses(horse_name),
    FOREIGN KEY (bet_id) REFERENCES bets(bet_id)
);

