**[How To Migrate Schema Using Flyway In PostgreSQL - Use The Default Database `postgres` And Schema Created Via `spring.flyway.schemas`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootFlywayPostgreSqlSchema)**

**Note:** For production, don't rely on `hibernate.ddl-auto` (or counterparts) to export schema DDL to the database. Simply remove (disable) `hibernate.ddl-auto` or set it to `validate`. Rely on Flyway or Liquibase.

**Description:** This application is an example of migrating a schema (`bookstore`) created by Flyway via `spring.flyway.schemas` in the default `postgres` database. In this case, the entities should be annotated with `@Table(schema = "bookstore")`.

**Key points:**
- for Maven, in `pom.xml`, add the Flyway dependency
- remove (disable) `spring.jpa.hibernate.ddl-auto` or set it to `validate`
- in `application.properties`, set the JDBC URL as follows: `jdbc:postgresql://localhost:5432/postgres`
- in `application.properties`, add `spring.flyway.schemas=bookstore`, where `bookstore` is the schema that should be created by Flyway in the `postgres` database (feel free to add your own database name)
- each entity that should be stored in this database should be annotated with, `@Table(schema = "bookstore")`
- each SQL file containing the schema update add it in `classpath:db/migration`
- each SQL file name it as `V1.1__Description.sql`, `V1.2__Description.sql`, ...
