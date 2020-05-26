**[How To Use Spring Projections(DTO) And Right Joins](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaRightJoins)**

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDtoViaRightJoins/DTO%20via%20right%20joins.png)

**Description:** This application is a proof of concept for using Spring Projections(DTO) and right joins written via JPQL and native SQL (for MySQL).

**Key points:**
- define two entities (e.g., `Author` and `Book` in a (lazy) bidirectional `@OneToMany` association)
- populate the database with some test data (e.g., check the file `resources/data-mysql.sql`)
- write interfaces (Spring projections) that contains getters for the columns that should be fetched from the database (e.g., check `AuthorNameBookTitle.java`)
- write right joins queries using JPQL/SQL
