**[How To Optimize Batch Updates Of Parent-Child Relationships In MySQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootBatchUpdateOrder)**

**Description:** Batch updates of entities with associations in MySQL.

**Key points:**
- in `application.properties` set `spring.jpa.properties.hibernate.jdbc.batch_size`
- in `application.properties` set JDBC URL with `rewriteBatchedStatements=true` (optimization for MySQL, statements get rewritten into a single string buffer and sent in a single request)
- in `application.properties` set JDBC URL with `cachePrepStmts=true` (enable caching and is useful if you decide to set `prepStmtCacheSize`, `prepStmtCacheSqlLimit`, etc as well; without this setting the cache is disabled)
- in `application.properties` set JDBC URL with `useServerPrepStmts=true` (this way you switch to server-side prepared statements (may lead to signnificant performance boost))
- for parent-child relationship with cascade all/persist (e.g. one-to-many, many-to-many) then consider to set up `spring.jpa.properties.hibernate.order_updates=true` to optimize the batching by ordering updates
- before Hibernate 5, we need to set in `application.properties` a setting for enabling batching for versioned entities during update
and delete operations (entities that contains `@Version` for implicit optimistic locking); this setting is: `spring.jpa.properties.hibernate.jdbc.batch_versioned_data=true`; starting with Hibernate 5, this setting should be `true` by default
   
**Output example for parent-child relationship:**
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootBatchUpdateOrder/batch%20updates.png)
