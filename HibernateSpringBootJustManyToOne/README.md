**[How Efficient Is Just `@OManyToOne`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootJustManyToOne)**

**Note:** The `@ManyToOne` association maps exactly to the one-to-many table relationship. The underlying foreign key is under child-side control in unidirectional or bidirectional relationship.

**Description:** This application shows that using only `@ManyToOne` is quite efficient. On the other hand, using only `@OneToMany` is far away from being efficient. Always, prefer bidirectional `@OneToMany` or unidirectional `@ManyToOne`. Consider two entities, `Author` and `Book` in a unidirectional `@ManyToOne` relationship.

**Key points:**
- Adding a new book is efficient
- Fetching all books of an author is efficient via a JPQL
- Pagination of books is efficient
- Remove a book is efficient
- Even if the fetched collection is not managed, *dirty checking* mechanism works as expected
