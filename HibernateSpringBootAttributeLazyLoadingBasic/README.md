**[How To Use Hibernate Attribute Lazy Loading](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootAttributeLazyLoadingBasic)**

<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/how-to-use-hibernate-attribute-lazy-loading">If you prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>
  
**Description:** By default, the attributes of an entity are loaded eagerly (all at once). But, we can load them **lazy** as well. This is useful for column types that store large amounts of data: `CLOB`, `BLOB`, `VARBINARY`, etc or *details* that should be loaded on demand. In this application, we have an entity named `Author`. Its properties are: `id`, `name`, `genre`, `avatar` and `age`. And, we want to load the `avatar` lazy. So, the `avatar` should be loaded on demand.

**Key points:**
- in `pom.xml`, activate Hibernate *bytecode enhancement* (e.g. use Maven *bytecode enhancement plugin*)
- in entity, annotate the attributes that should be loaded lazy with `@Basic(fetch = FetchType.LAZY)`
- in `application.properties`, disable Open Session in View     

**Check as well:**\
     - [Default Values For Lazy Loaded Attributes](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootAttributeLazyLoadingDefaultValues)\
     - [Attribute Lazy Loading And Jackson Serialization](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootAttributeLazyLoadingJacksonSerialization)
     
