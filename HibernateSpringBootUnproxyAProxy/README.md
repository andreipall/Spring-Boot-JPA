
**[How To Unproxy A Proxy](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootUnproxyAProxy)**

**Description:** A Hibernate proxy can be useful when a child entity can be persisted with a reference to its parent (`@ManyToOne` or `@OneToOne` association). In such cases, fetching the parent entity from the database (execute the `SELECT` statement) is a performance penalty and a pointless action. Hibernate can set the underlying foreign key value for an uninitialized proxy. This topic is discussed [here](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPopulatingChildViaProxy).

A proxy can be unproxied via `Hibernate.unproxy()`. This method is available starting with Hibernate 5.2.10.

**Key points:**
- fetch a proxy via `JpaRepository#getOne()`
- unproxy the fetched proxy via `Hibernate.unproxy()`     
