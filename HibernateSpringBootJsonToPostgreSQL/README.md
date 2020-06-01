**[How To Handle JSON in PostgreSQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootJsonToPostgreSQL)**

**Description:** [Hibernate Types](https://github.com/vladmihalcea/hibernate-types) is a library of extra types not supported by Hibernate Core by default. This is a Spring Boot application that uses this library to persist JSON data (JSON Java `Object`) in a PostgreSQL `json` column and for querying JSON data from the PostgreSQL `json` column to JSON Java `Object`. Updates are supported as well.

**Key points:**
- for Maven, add Hibernate Types as a dependency in `pom.xml`
- in entity use `@TypeDef` to map `typeClass` to `JsonBinaryType`
