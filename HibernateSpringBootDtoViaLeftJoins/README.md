**[How To Use Spring Projections(DTO) And Left Joins](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaLeftJoins)**

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDtoViaLeftJoins/DTO%20via%20left%20joins.png)

**Description:** This application is a proof of concept for using Spring Projections(DTO) and left joins written via JPQL and native SQL (for MySQL).

**Key points:**
- define two entities (e.g., `Author` and `Book` in a (lazy) bidirectional `@OneToMany` association)
- populate the database with some test data (e.g., check the file `resources/data-mysql.sql`)
- write interfaces (Spring projections) that contains getters for the columns that should be fetched from the database (e.g., check `AuthorNameBookTitle.java`)
- write left joins queries using JPQL/SQL
