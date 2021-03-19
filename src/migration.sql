use codeup_test_db;

CREATE TABLE users (
                       id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                       username VARCHAR(100) NOT NULL,
                       email VARCHAR(250) NOT NULL,
                       password VARCHAR(250) NOT NULL,
                       PRIMARY KEY (id)
);
CREATE TABLE ads (
                     id  INT UNSIGNED NOT NULL AUTO_INCREMENT,
                     title  VARCHAR(50)  NOT NULL,
                     description VARCHAR(255) NOT NULL,
                     user_id     INT  UNSIGNED    NOT NULL,
                     PRIMARY KEY (id),
                     FOREIGN KEY (user_id) REFERENCES users (id)
);