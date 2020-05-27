**[Entity Inside Spring Projection (no association)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoEntityViaProjectionNoAssociation)**

<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/how-to-add-an-entity-inside-a-spring-projection-no-associations">If you prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>

**Description:** If, for some reason, you need an entity in your Spring projection (DTO), then this application shows you how to do it via an example. In this case, there are two entities, `Author` and `Book`, that have no materialized association between them, but, they share the `genre` attribute. We use this attribute to join authors with books via JPQL. And, we want to fetch in a Spring projection the authors as entities, `Author`, and the `title` of the books.

**Key points:**
- define two unrelated entities (e.g., `Author` and `Book`)
- define the proper Spring projection having `public Author getAuthor()` and `public String getTitle()`
- write a JPQL to fetch data
