**[Filter Association Via Hibernate `@Where`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootFilterAssociation)**

**Note:** Rely on this approach only if you simply cannot use `JOIN FETCH WHERE` or `@NamedEntityGraph`.

**Description:** This application is a sample of using Hibernate `@Where` for filtering associations. 

**Key points:**
- use `@Where(clause = "condition to be met")` in entity (check the `Author` entity)
