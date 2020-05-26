**[How To Fetch DTO Via Constructor Expression and JPQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoConstructorExpression)**

**Description:** Fetching more data than needed is prone to performance penalities. Using DTO allows us to extract only the needed data. In this application we rely on Constructor Expression and JPQL.

**Key points:**
- write a proper constructor in the DTO class
- use a query as `SELECT new com.bookstore.dto.AuthorDto(a.name, a.age) FROM Author a`
- for using Spring Data Projections check this [item](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaProjections) 

**See also:**\
[How To Fetch DTO Via Constructor And Spring Data Query Builder Mechanism](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoConstructor)
