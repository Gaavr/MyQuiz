CREATE TABLE IF NOT EXISTS public.user (
    "id" int8 primary key GENERATED ALWAYS AS IDENTITY,
    "name" text,
    "phone" text
);
CREATE TABLE IF NOT EXISTS public.tables (
    "id" int8 primary key GENERATED ALWAYS AS IDENTITY,
    "user_id" text,
    "table_number" int8
);
CREATE TABLE IF NOT EXISTS public.table_answers (
    "id" int8 primary key GENERATED ALWAYS AS IDENTITY,
    "user_id" text,
    "table_id" int8,
    "question_id" text,
    "answer_id" text,
    "user_answer" text,
    "is_user_answer_correct" bool
);
CREATE TABLE IF NOT EXISTS public.questions (
    "id" integer primary key GENERATED ALWAYS AS IDENTITY,
    "question" text,
    "answer" text
);
CREATE TABLE IF NOT EXISTS public.answers (
    "id" int8 primary key GENERATED ALWAYS AS IDENTITY,
    "answer" text
);