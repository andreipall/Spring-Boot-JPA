**[How To Use Spring Projections(DTOs) And Inclusive Full Joins (MySQL)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaFullJoinsMySQL)**

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDtoViaFullJoinsMySQL/DTO%20via%20inclusive%20full%20joins.png)

**Description:** This application is a proof of concept for using Spring Projections(DTO) and inclusive full joins written in native SQL (for MySQL).

**Key points:**
- define two entities (e.g., `Author` and `Book` in a lazy bidirectional `@OneToMany` relationship)
- populate the database with some test data (e.g., check the file `resources/data-mysql.sql`)
- write interfaces (projections) that contains getters for the columns that should be fetched from the database (e.g., check `AuthorNameBookTitle.java`)
- write inclusive full joins queries using native SQL
