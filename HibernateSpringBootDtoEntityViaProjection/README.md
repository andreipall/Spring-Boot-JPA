**[Entity Inside Spring Projection](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoEntityViaProjection)**
     
**Description:** If, for some reason, you need an entity in your Spring projection (DTO), then this application shows you how to do it via an example. In this case, there are two entities, `Author` and `Book`, involved in a lazy bidirectional one-to-many association  (it can be other association as well, or even no materialized association). And, we want to fetch in a Spring projection the authors as entities, `Author`, and the `title` of the books.

**Key points:**
- define two related entities (e.g., `Author` and `Book` in a one-to-many lazy bidirectional relationship)
- define the proper Spring projection having `public Author getAuthor()` and `public String getTitle()`
- write a JPQL to fetch data
