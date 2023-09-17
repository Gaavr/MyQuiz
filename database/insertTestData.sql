INSERT INTO users (name, login, password) VALUES
    ('User3', 'user3', 'password3'),
    ('User4', 'user4', 'password4'),
    ('User5', 'user5', 'password5'),
    ('User6', 'user6', 'password6'),
    ('User7', 'user7', 'password7'),
    ('User8', 'user8', 'password8');

INSERT INTO game (name, id_temporary_questions) VALUES
    ('Game3', 3),
    ('Game4', 4),
    ('Game5', 5),
    ('Game6', 6),
    ('Game7', 7),
    ('Game8', 8);

INSERT INTO result (game_id, table_id, question_id, table_answer, is_correct) VALUES
    (3, 3, 3, 'Answer3', true),
    (3, 3, 4, 'Answer4', false),
    (3, 4, 3, 'Answer3', true),
    (4, 4, 4, 'Answer4', false),
    (5, 5, 5, 'Answer5', true),
    (5, 5, 6, 'Answer6', false);

INSERT INTO temporary_questions (question, answer_id, answer) VALUES
    ('Question4', 4, 'Answer4'),
    ('Question5', 5, 'Answer5'),
    ('Question6', 6, 'Answer6'),
    ('Question7', 7, 'Answer7'),
    ('Question8', 8, 'Answer8'),
    ('Question9', 9, 'Answer9');

INSERT INTO questions (question, answer_id, answer) VALUES
    ('Question4', 4, 'Answer4'),
    ('Question5', 5, 'Answer5'),
    ('Question6', 6, 'Answer6'),
    ('Question7', 7, 'Answer7'),
    ('Question8', 8, 'Answer8'),
    ('Question9', 9, 'Answer9');