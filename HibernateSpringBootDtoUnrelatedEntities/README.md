**[How To Exploit Spring Projections(DTO) And Join Unrelated Entities In Hibernate 5.1+](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoUnrelatedEntities)**

**Description:** This application is a proof of concept for using Spring Projections (DTO) and join unrelated entities. Hibernate 5.1 introduced explicit joins on unrelated entities and the syntax and behaviour are similar to SQL `JOIN` statements.

**Key points:**
- define serveral entities (e.g., `Author` and `Book` unrelated entities)
- populate the database with some test data (e.g., check the file `resources/data-mysql.sql`)
- write interfaces (Spring projections) that contains getters for the columns that should be fetched from the database (e.g., `BookstoreDto`)
- write joins queries using JPQL/SQL (e.g., queries all authors names and book titles of the given price)  
