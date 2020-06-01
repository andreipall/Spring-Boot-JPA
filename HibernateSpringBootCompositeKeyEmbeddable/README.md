**[How To Define A Composite Primary Key Via `@Embeddable`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCompositeKeyEmbeddable)**

**Description:** This application is a proof of concept of how to define a composite key via `@Embeddable` and `@EmbeddedId`. This application uses two entities, `Author` and `Book` involved in a lazy bidirectional `@OneToMany` association. The identifier of `Author` is composed by `name` and `age` via `AuthorId` class. The identifier of `Book` is just a regular auto-generated numeric value.

**Key points:**
- the composite key class (e.g., `AuthorId`) is `public`
- the composite key class must implement `Serializable`
- the composite key must define `equals()` and `hashCode()`
- the composite key must define a no-arguments constructor
