**[How To Programmatically Setup Flyway And PostgreSQL `DataSource`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootFlywayPostgreSQLProg)**
 
**Note:** For production, don't rely on `hibernate.ddl-auto` (or counterparts) to export schema DDL to the database. Simply remove (disable) `hibernate.ddl-auto` or set it to `validate`. Rely on Flyway or Liquibase.

**Description:** This application is a kickoff for setting Flyway and PostgreSQL `DataSource` programmatically.

**Key points:**
- for Maven, in `pom.xml`, add the Flyway dependency
- remove (disable) `spring.jpa.hibernate.ddl-auto` or set it to `validate`
- configure `DataSource` and Flyway programmatically
