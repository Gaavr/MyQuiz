docker pull postgres
docker run --name pgserver -p 5432:5432 -e POSTGRES_PASSWORD=root -d postgres:13.3
run src/main/resources/database/createDB.sql
run src/main/resources/database/createApplicationTables.sql
run src/main/resources/database/insertTestData.sql
