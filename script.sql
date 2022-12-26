CREATE TABLE users(
user_id SERIAL PRIMARY KEY,
u_name VARCHAR(30),
u_email VARCHAR(75),
u_password VARCHAR(255),
date_created TIMESTAMP DEFAULT (date_trunc('second', now()::TIMESTAMP)));

CREATE TABLE category(
category_id SERIAL PRIMARY KEY,
category_name VARCHAR(30));

CREATE TABLE ex_catalog(
ex_id SERIAL PRIMARY KEY,
ex_name VARCHAR(30),
category_id INT,
ex_duration VARCHAR(10),
date_begin date,
date_end date,
description VARCHAR(255),
FOREIGN KEY (category_id) REFERENCES category (category_id) ON UPDATE CASCADE ON DELETE RESTRICT);


INSERT INTO category(category_name)
VALUES('Indoors'), ('Outdoors');

