
**[Attributes Lazy Loading Via Subentities](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSubentities)**
 
**Description:** By default, the attributes of an entity are loaded eager (all at once). This application is an alternative to *How To Use Hibernate Attribute Lazy Loading* from [here](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootAttributeLazyLoadingBasic). This application uses a base class to isolate the attributes that should be loaded eagerly and subentities (entities that extends the base class) for isolating the attributes that should be loaded on demand.

<a href="#"><img src="https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootSubentities/attributes%20lazy%20loading%20via%20subentites.png" align="center" height="150" width="500" ></a>

**Key points:**
- create the base class (this is not an entity), `BaseAuthor`,  and annotate it with `@MappedSuperclass`
- create `AuthorShallow` subentity of `BaseAuthor` and don't add any attribute in it (this will inherit the attributes from the superclass)
- create `AuthorDeep` subentity of `BaseAuthor` and add to it the attributes that should be loaded on demand (e.g., `avatar`)
- map both subentities to the same table via `@Table(name = "author")`
- provide the typical repositories, `AuthorShallowRepository` and `AuthorDeepRepository`
     
**Run the following requests (via BookstoreController):**
- fetch all authors shallow (without avatars): `localhost:8080/authors/shallow`
- fetch all authors deep (with avatars): `localhost:8080/authors/deep`

**Check as well:**
- [Attribute Lazy Loading (basic)](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootAttributeLazyLoadingBasic)
- [Default Values For Lazy Loaded Attributes](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootAttributeLazyLoadingDefaultValues)
- [Attribute Lazy Loading And Jackson Serialization](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootAttributeLazyLoadingJacksonSerialization)
