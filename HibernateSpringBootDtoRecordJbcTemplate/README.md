**[DTO Via JDK14 Records, `JdbcTemplate` And `ResultSetExtractor`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoRecordJbcTemplate)**  
 
**Description:** Fetching more data than needed is prone to performance penalities. Using DTO allows us to extract only the needed data. In this application we rely on JDK14 Records feature, `JdbcTemplate` and `ResultSetExtractor`.

From Openjdk JEP359:

*Records provide a compact syntax for declaring classes which are transparent holders for shallowly immutable data.*
 
**Key points:**

- define the Java Records as `AuthorDto` and `BookDto`
- use `JdbcTemplate` and `ResultSetExtractor`
