CREATE TABLE admin (
                    id SERIAL PRIMARY KEY,
                    login VARCHAR(255) NOT NULL,
                    password VARCHAR(255) NOT NULL
);

CREATE TABLE users (
                    id SERIAL PRIMARY KEY,
                    name VARCHAR(255) NOT NULL,
                    login VARCHAR(255) NOT NULL,
                    password VARCHAR(255) NOT NULL
);

CREATE TABLE game (
                    id SERIAL PRIMARY KEY,
                    name VARCHAR(255) NOT NULL,
                    id_temporary_questions INT
);

CREATE TABLE result (
                    id SERIAL PRIMARY KEY,
                    game_id INT NOT NULL,
                    table_id INT NOT NULL,
                    question_id INT NOT NULL,
                    table_answer VARCHAR(255) NOT NULL,
                    is_correct BOOLEAN NOT NULL
);

CREATE TABLE temporary_questions (
                    id SERIAL PRIMARY KEY,
                    question VARCHAR(255) NOT NULL,
                    answer_id INT NOT NULL,
                    answer VARCHAR(255) NOT NULL
);

CREATE TABLE questions (
                           id SERIAL PRIMARY KEY,
                           question VARCHAR(255) NOT NULL,
                           answer_id INT NOT NULL,
                           answer VARCHAR(255) NOT NULL
);