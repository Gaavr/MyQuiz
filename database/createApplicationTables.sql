CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS public.user (
    "id" uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    "name" text,
    "phone" text
);
CREATE TABLE IF NOT EXISTS public.tables (
    "id" uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    "user_id" text,
    "table_number" int8
);
CREATE TABLE IF NOT EXISTS public.table_answers (
    "id" uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    "user_id" text,
    "table_id" int8,
    "question_id" text,
    "answer_id" text,
    "user_answer" text,
    "is_user_answer_correct" bool
);
CREATE TABLE IF NOT EXISTS public.questions (
    "id" uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    "question" text,
    "answer" text
);
CREATE TABLE IF NOT EXISTS public.answers (
   "id" uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    "answer" text
);