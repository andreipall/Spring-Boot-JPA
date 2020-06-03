**[Defining Entity Listener Class Via `@EntityListeners`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootEntityListener)**

**Description:** This application is a sample of using the JPA `@MappedSuperclass` and `@EntityListeners` with JPA callbacks.

**Key points:**
- the *base class* ,`Book`, is not an entity, it can be `abstract`, and is annotated with `@MappedSuperclass` and `@EntityListeners(BookListener.class)`
- `BookListener` defines JPA callbacks (e.g., `@PrePersist`)
- subclasses of the *base class* are mapped in tables that contains columns for the inherited attributes and for their own attibutes
- when any entity that is a subclass of `Book` is persisted, loaded, updated, etc the corresponding JPA callbacks are called
