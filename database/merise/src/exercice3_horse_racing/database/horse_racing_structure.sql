DROP DATABASE IF EXISTS db_horse_racing;

CREATE DATABASE IF NOT EXISTS db_horse_racing;

USE db_horse_racing;

CREATE TABLE IF NOT EXISTS races
(
    race_name VARCHAR(48) PRIMARY KEY,
    race_date DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS horses
(
    horse_name VARCHAR(20) PRIMARY KEY,
    horse_number INT NOT NULL
);

CREATE TABLE IF NOT EXISTS bets
(
    bet_id INT PRIMARY KEY,
    bet_type VARCHAR(20) NOT NULL,
    sum_of_bet INT NOT NULL,
    order_number_bet VARCHAR(48) NOT NULL,
    bet_winnings INT NOT NULL
);

CREATE TABLE IF NOT EXISTS participate
(
    race_result VARCHAR(48) NOT NULL,
    horse_name VARCHAR(20) NOT NULL,
    race_name VARCHAR(48) NOT NULL,
    FOREIGN KEY (horse_name) REFERENCES horses(horse_name),
    FOREIGN KEY (race_name) REFERENCES races(race_name)
);

CREATE TABLE IF NOT EXISTS choose
(
    horse_name VARCHAR(20) NOT NULL,
    bet_id INT NOT NULL,
    FOREIGN KEY (horse_name) REFERENCES horses(horse_name),
    FOREIGN KEY (bet_id) REFERENCES bets(bet_id)
);

CREATE TABLE IF NOT EXISTS play
(
    race_name VARCHAR(48) NOT NULL,
    bet_id INT NOT NULL,
    FOREIGN KEY (bet_id) REFERENCES bets(bet_id),
    FOREIGN KEY (race_name) REFERENCES races(race_name)
);