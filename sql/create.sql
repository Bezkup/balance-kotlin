CREATE DATABASE balance;
CREATE TABLE IF NOT EXIST transaction(
    id int NOT NULL,
    amount BIGINT NOT NULL,
    category VARCHAR(255),
    PRIMARY KEY (id)
    FOREIGN KEY (category) REFERENCES category(name)
)
CREATE TABLE IF NOT EXIST category (
    id int NOT NULL,
    name VARCHAR(255) NOT NULL UNIQUE,
    PRIMARY KEY (id)
)