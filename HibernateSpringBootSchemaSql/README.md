**[How To Generate A Schema Via `schema-*.sql` In MySQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSchemaSql)**

**Note:** As a rule, in real applications avoid generating schema via `hibernate.ddl-auto`. Use `schema-*.sql` file or better `Flyway` or `Liquibase` migration tools.

**Description:** This application is an example of using `schema-*.sql` to generate a schema(database) in MySQL.

**Key points:**
- in `application.properties`, set the JDBC URL (e.g., `spring.datasource.url=jdbc:mysql://localhost:3306/bookstoredb?createDatabaseIfNotExist=true`)
- in `application.properties`, disable DDL auto (just don't add explicitly the `hibernate.ddl-auto` setting) or set it to `validate`
- in `application.properties`, instruct Spring Boot to initialize the schema from `schema-mysql.sql` file  
