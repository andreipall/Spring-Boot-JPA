**[How To Define A Relationship in an `@Embeddable` Composite Primary Key](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCompositeKeyEmbeddableMapRel)**

**Description:** This application is a proof of concept of how to define a relationship in an `@Embeddable` composite key. The composite key is `AuthorId` and it belongs to the `Author` class.

**Key points:**
- the composite key class (e.g., `AuthorId`) is `public`
- the composite key class must implement `Serializable`
- the composite key must define `equals()` and `hashCode()`
- the composite key must define a no-arguments constructor
