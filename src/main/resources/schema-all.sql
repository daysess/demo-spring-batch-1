DROP TABLE pessoa IF EXISTS;

CREATE TABLE pessoa  (
    pessoa_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    name VARCHAR(20),
    sobrename VARCHAR(20),
    telefone VARCHAR(20)
);