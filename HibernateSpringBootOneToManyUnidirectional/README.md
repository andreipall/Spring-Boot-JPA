**[Why You Should Avoid Unidirectional `@OneToMany` And Prefer Bidirectional `@OneToMany` Relationship](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootOneToManyUnidirectional)**

**Description:** As a rule of thumb, unidirectional `@OneToMany` association is less efficient than the bidirectional `@OneToMany` or the unidirectional `@ManyToOne` associations. This application is a sample that exposes the DML statements generated for reads, writes and removal operations when the unidirectional `@OneToMany` mapping is used.

**Key points:**
- regular unidirectional `@OneToMany` is less efficient than bidirectional `@OneToMany` association
- using `@OrderColumn` come with some optimizations for removal operations but is still less efficient than bidirectional `@OneToMany` association
- using `@JoinColumn` eliminates the junction table but is still less efficient than bidirectional `@OneToMany` association
- using `Set` instead of `List` or bidirectional `@OneToMany` with `@JoinColumn` relationship (e.g., `@ManyToOne @JoinColumn(name = "author_id", updatable = false, insertable = false)`) still performs worse than bidirectional `@OneToMany` association
