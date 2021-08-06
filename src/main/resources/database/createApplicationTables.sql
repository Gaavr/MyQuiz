CREATE TABLE IF NOT EXISTS public.user (
    "id" int8 primary key,
    "name" text,
    "phone" text
);
CREATE TABLE IF NOT EXISTS public.tables (
    "id" int8 primary key,
    "user_id" text,
    "table_number" int8
);
CREATE TABLE IF NOT EXISTS public.table_answers (
    "id" int8 primary key,
    "user_id" text,
    "table_id" int8,
    "question_id" text,
    "answer_id" text,
    "user_answer" text,
    "is_user_answer_correct" bool
);
CREATE TABLE IF NOT EXISTS public.question (
    "id" int8 primary key,
    "question" text,
    "answer" text
);
CREATE TABLE IF NOT EXISTS public.answers (
    "id" int8 primary key,
    "answer" text
);