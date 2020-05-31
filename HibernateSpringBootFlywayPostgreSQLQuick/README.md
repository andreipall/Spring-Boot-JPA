**[How To Migrate PostgreSQL Database Using Flyway - Use The Default Database `postgres` And Schema `public`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootFlywayPostgreSQLQuick)**

**Note:** For production, don't rely on `hibernate.ddl-auto` (or counterparts) to export schema DDL to the database. Simply remove (disable) `hibernate.ddl-auto` or set it to `validate`. Rely on Flyway or Liquibase.

**Description:** This application is an example of migrating a PostgreSQL database via Flyway for the default database `postgres` and schema `public`. 

**Key points:**
- for Maven, in `pom.xml`, add the Flyway dependency
- remove (disable) `spring.jpa.hibernate.ddl-auto` or set it to `validate`
- in `application.properties`, set the JDBC URL as follows: `jdbc:postgresql://localhost:5432/postgres`
- each SQL file containing the schema update add it in `classpath:db/migration`
- each SQL file name it as `V1.1__Description.sql`, `V1.2__Description.sql`, ...
