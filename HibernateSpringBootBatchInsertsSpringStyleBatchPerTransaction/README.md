
**[Batch Inserts In Spring Boot Style And Batch Per Transaction](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootBatchInsertsSpringStyleBatchPerTransaction)**

**Description:** Batch inserts (in MySQL) in Spring Boot style. This example commits the database transaction after each batch excecution. This way we avoid long-running transactions and, in case of a failure, we rollback only the failed batch and don't lose the previous batches.

**Key points:**
- in `application.properties` set `spring.jpa.properties.hibernate.jdbc.batch_size`
- in `application.properties` set `spring.jpa.properties.hibernate.generate_statistics` (just to check that batching is working)
- in `application.properties` set JDBC URL with `rewriteBatchedStatements=true` (optimization for MySQL)
- in `application.properties` set JDBC URL with `cachePrepStmts=true` (enable caching and is useful if you decide to set `prepStmtCacheSize`, `prepStmtCacheSqlLimit`, etc as well; without this setting the cache is disabled)
- in `application.properties` set JDBC URL with `useServerPrepStmts=true` (this way you switch to server-side prepared statements (may lead to signnificant performance boost))
- in case of using a parent-child relationship with cascade persist (e.g. one-to-many, many-to-many) then consider to set up `spring.jpa.properties.hibernate.order_inserts=true` to optimize the batching by ordering inserts
- in entity, use the [assigned generator](https://vladmihalcea.com/how-to-combine-the-hibernate-assigned-generator-with-a-sequence-or-an-identity-column/) since the Hibernate `IDENTITY` will cause insert batching to be disabled
- in your DAO layer, commit the database transaction after each batch execution
- if is not needed then ensure that Second Level Cache is disabled via `spring.jpa.properties.hibernate.cache.use_second_level_cache=false`
   
**Output example:**
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootBatchInsertsSpringStyle/batch%20inserts%20in%20spring%20boot%20style.png)
