
**[Improper Usage Of `@Fetch(FetchMode.JOIN)` May Causes N+1 Issues](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootFetchJoinAndQueries)**

**Advice:** Always evaluate `JOIN FETCH` and entities graphs before deciding to use `FetchMode.JOIN`. The `FetchMode.JOIN` fetch mode always triggers an `EAGER` load so the children are loaded when the parents are. Beside this drawback, `FetchMode.JOIN` may return duplicate results. You’ll have to remove the duplicates yourself (e.g. storing the result in a `Set`). But, if you decide to go with `FetchMode.JOIN` at least pay attention to avoid N+1 issues discussed below.

**Note:** Let's assume three entities, `Author`, `Book` and `Publisher`. Between `Author` and `Book` there is a bidirectional-lazy `@OneToMany` association. Between `Author` and `Publisher` there is a unidirectional-lazy `@ManyToOne`. Between `Book` and `Publisher` there is no association.

Now, we want to fetch a book by id (`BookRepository#findById()`), including its author, and the author's publisher. In such cases, using Hibernate fetch mode, `@Fetch(FetchMode.JOIN)` works as expected. Using `JOIN FETCH` or entity graph is also working as expected.

Next, we want to fetch all books (`BookRepository#findAll()`), including their authors, and the authors publishers. In such cases, using Hibernate fetch mode, `@Fetch(FetchMode.JOIN)` will cause N+1 issues. It will not trigger the expected `JOIN`. In this case, using `JOIN FETCH` or entity graph should be used.

**Key points:**
- using Hibernate fetch mode, `@Fetch(FetchMode.JOIN)` doesn't work for query-methods
- Hibernate fetch mode, `@Fetch(FetchMode.JOIN)` works in cases that fetches the entity by id (primary key) like using `EntityManager#find()`, Spring Data, `findById()`, `findOne()`.
