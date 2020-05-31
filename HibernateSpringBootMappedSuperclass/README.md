**[JPA Inheritance - `@MappedSuperclass`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootMappedSuperclass)**

**Description:** This application is a sample of using the JPA `@MappedSuperclass`.

**Key points:**
- the *base class* is not an entity, it can be `abstract`, and is annotated with `@MappedSuperclass`
- subclasses of the *base class* are mapped in tables that contains columns for the inherited attributes and for their own attibutes
- when the *base class* doens't need to be an entity, the `@MappedSuperclass` is the proper alternative to the JPA table-per-class inheritance strategy
