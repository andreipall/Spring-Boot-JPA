**[How To Include In The `UPDATE` Statement Only The Modified Columns Via Hibernate `@DynamicUpdate`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDynamicUpdate)**

**Description:** This application is an example of using the Hibernate-specific, `@DynamicUpdate`. By default, even if we modify only a subset of columns, the triggered `UPDATE` statements will include all columns. By simply annotating the corresponding entity at class-level with `@DynamicUpdate` the generated `UPDATE` statement will include only the modified columns. 

**Key points:**
- pro: avoid updating unmodified indexes (useful for heavy indexing)
- con: cannot reuse the same `UPDATE` for different subsets of columns via JDBC statements caching (each triggered `UPDATE` string will be cached and reused accordingly)
