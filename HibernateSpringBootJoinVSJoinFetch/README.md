**[`JOIN` VS. `JOIN FETCH`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootJoinVSJoinFetch)**

**See also:**
- [How To Avoid LazyInitializationException Via JOIN FETCH](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootJoinFetch)
- [LEFT JOIN FETCH](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootLeftJoinFetch)
     
**Description:** This is an application meant to reveal the differences between `JOIN` and `JOIN FETCH`. The important thing to keep in mind is that, in case of `LAZY` fetching, `JOIN` will not be capable to initialize the associated collections along with their parent objects using a single SQL `SELECT`.  On the other hand, `JOIN FETCH` is capable to accomplish this kind of task. But, don't underestimate `JOIN`, because `JOIN` is the proper choice when we need to combine/join the columns of two (or more) tables in the same query, but we don't need to initialize the associated collections on the returned entity (e.g., very useful for fetching DTO).

**Key points:**
- define two related entities (e.g., `Author` and `Book` in a one-to-many lazy-bidirectional relationship)
- write a JPQL `JOIN` and `JOIN FETCH` to fetch an author including his books
- write a JPQL `JOIN` to fetch a book (1)
- write a JPQL `JOIN` to fetch a book including its author (2)
- write a `JOIN FETCH` to fetch a book including its author
     
**Notice that:**
- via `JOIN`, fetching `Book` of `Author` requires additional `SELECT` statements being prone to N+1 performance penalty
- via `JOIN` (1), fetching `Author` of `Book` requires additional `SELECT` statements being prone to N+1 performance penalty
- via `JOIN` (2), fetching `Author` of `Book` works exactly as `JOIN FETCH` (requires a single `SELECT`)
- via `JOIN FETCH`, fetching each `Author` of a `Book` requires a single `SELECT`
