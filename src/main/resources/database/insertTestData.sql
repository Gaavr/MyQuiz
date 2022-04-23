--users
INSERT INTO public.user (name, phone)
VALUES ('user1', '88005553535');
INSERT INTO public.user (name, phone)
VALUES ('Vassily Petrov', '+7 (191) 322-22-33)');
INSERT INTO public.user (name, phone)
VALUES ('Petr Vasechkin', '+7 (191) 431-33-22)');
INSERT INTO public.user (name, phone)
VALUES ('Dimas Kablykov', '+7 (191) 438-11-22)');
INSERT INTO public.user (name, phone)
VALUES ('Sanya Piva', '+7 (191) 938-33-22)');
INSERT INTO public.user (name, phone)
VALUES ('Ivan Avitov', '+7 (191) 223-33-14)');

--answers
INSERT INTO public.answers (answer)
VALUES ('answer1');
INSERT INTO public.answers (answer)
VALUES ('First Answer');
INSERT INTO public.answers (answer)
VALUES ('Sesond Answer');
INSERT INTO public.answers (answer)
VALUES ('Dimas Kablykov - our answer');
INSERT INTO public.answers (answer)
VALUES ('Otvet 5');
INSERT INTO public.answers (answer)
VALUES ('Right answer');

--questions
INSERT INTO public.questions (question, answer)
VALUES ('question1', 'answer1');
INSERT INTO public.questions (question, answer)
VALUES ('What is it?', 'this is DB');
INSERT INTO public.user (name, phone)
VALUES ('Правильный вопрос?', 'Неправильный ответ');
INSERT INTO public.user (name, phone)
VALUES ('Неправильный вопрос?', 'Правильный ответ');
INSERT INTO public.user (name, phone)
VALUES ('Вилкой в глаз?', 'Нет');
INSERT INTO public.user (name, phone)
VALUES ('Когда на тренеровку?', 'Завтра!');