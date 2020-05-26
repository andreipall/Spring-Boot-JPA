**[How To Use Spring Projections(DTO) And Inclusive Full Joins (PostgreSQL)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaFullJoins)**

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDtoViaFullJoins/DTO%20via%20inclusive%20full%20joins.png)

**Description:** This application is a proof of concept for using Spring Projections(DTO) and inclusive full joins written via JPQL and native SQL (for PostgreSQL).

**Key points:**
- define two entities (e.g., `Author` and `Book` in a (lazy) bidirectional `@OneToMany` association)
- populate the database with some test data (e.g., check the file `resources/data-mysql.sql`)
- write interfaces (Spring projections) that contains getters for the columns that should be fetched from the database (e.g., check `AuthorNameBookTitle.java`)
- write inclusive full joins queries using JPQL/SQL
