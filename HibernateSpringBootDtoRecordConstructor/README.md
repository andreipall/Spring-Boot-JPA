**[DTO Via JDK14 Records And Spring Data Query Builder Mechanism](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoRecordConstructor)** 

**Description:** Fetching more data than needed is prone to performance penalities. Using DTO allows us to extract only the needed data. In this application we rely on JDK14 Records feature and Spring Data Query Builder Mechanism.

From Openjdk JEP359:

*Records provide a compact syntax for declaring classes which are transparent holders for shallowly immutable data.*
 
**Key points:**
Define the `AuthorDto` as:

`public record AuthorDto(String name, int age) {}`
