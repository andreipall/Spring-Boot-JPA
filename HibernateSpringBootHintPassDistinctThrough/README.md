**[Optimize `SELECT DISTINCT` Via Hibernate `HINT_PASS_DISTINCT_THROUGH` Hint](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootHintPassDistinctThrough)**

**Description:** Starting with Hibernate 5.2.2, we can optimize JPQL (HQL) query entites of type `SELECT DISTINCT` via `HINT_PASS_DISTINCT_THROUGH` hint. Keep in mind that this hint is useful only for JPQL (HQL) JOIN FETCH-ing queries. Is not useful for scalar queries (e.g., `List<Integer>`), DTO or [HHH-13280](https://hibernate.atlassian.net/browse/HHH-13280). In such cases, the `DISTINCT` JPQL keyword is needed to be passed to the underlying SQL query. This will instruct the database to remove duplicates from the result set. 

**Key points:**
- use `@QueryHints(value = @QueryHint(name = HINT_PASS_DISTINCT_THROUGH, value = "false"))`
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootHintPassDistinctThrough/HINT_PASS_DISTINCT_THROUGH.png)