**[How To Avoid `LazyInitializationException` Via `JOIN FETCH`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootJoinFetch)**
 
**See also:**
- [LEFT JOIN FETCH](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootLeftJoinFetch)
- [JOIN VS. JOIN FETCH](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootJoinVSJoinFetch)

**Description:** Typically, when we get a `LazyInitializationException` we tend to modify the association fetching type from `LAZY` to `EAGER`. That is very bad! This is a [code smell](https://vladmihalcea.com/eager-fetching-is-a-code-smell/). Best way to avoid this exception is to rely on `JOIN FETCH` (if you plan to modify the fetched entities) or `JOIN` + DTO (if the fetched data is only read). `JOIN FETCH` allows associations to be initialized along with their parent objects using a single `SELECT`. This is particularly useful for fetching associated collections. 

This application is a `JOIN FETCH` example for avoiding `LazyInitializationException`. 

**Key points:**
- define two related entities (e.g., `Author` and `Book` in a `@OneToMany` lazy-bidirectional association)
- write a JPQL `JOIN FETCH` to fetch an author including his books
- write a JPQL `JOIN FETCH` (or `JOIN`) to fetch a book including its author

**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootJoinFetch/hibernate%20spring%20boot%20join%20fetch.png) 
