**[How To Use Spring Projections(DTO) And Cross Joins](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaCrossJoins)**

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDtoViaCrossJoins/DTO%20via%20cross%20joins.png)

**Description:** This application is a proof of concept for using Spring Projections(DTO) and cross joins written via JPQL and native SQL (for MySQL).

**Key points:**
- define two entities (e.g., `Book` and `Format` 
- populate the database with some test data (e.g., check the file `resources/data-mysql.sql`)
- write interfaces (Spring projections) that contains getters for the columns that should be fetched from the database (e.g., check `BookTitleAndFormatType.java`)
- write cross joins queries using JPQL/SQL
