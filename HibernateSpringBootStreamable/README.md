**[How To NOT Use Spring Data `Streamable`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootStreamable)**
  
**Description:** This application is a sample of fetching `Streamable<entity>` and `Streamable<dto>`. But, more important, this application contains three examples of how to **not** use `Streamable`. It is very tempting and comfortable to fetch a `Streamable` result set and chop it via `filter()`, `map()`, `flatMap()`, and so on until we obtain only the needed data instead of writing a query (e.g., JPQL) that fetches exactly the needed result set from the database. Mainly, we just throw away some of the fetched data to keep only the needed data. But, **is not advisable** to follow such practices because fetching more data than needed can cause significant performance penalties. 

Moreover, pay attention to combining two or more `Streamable` via the `and()` method. The returned result may be different from what you are expecting to see. Each `Streamable` produces a separate SQL statement and the final result set is a concatenation of the intermediate results sets (prone to duplicate values).

**Key points:**
- don't fetch more columns than needed just to drop a part of them (e.g., via `map()`)
- don't fetch more rows than needed just to throw away a part of it (e.g., via `filter()`)
- pay attention on combining `Streamable` via `and()`; each `Streamable` produces a separate SQL statement and the final result set is a concatenation of the intermediate results sets (prone to duplicate values)
