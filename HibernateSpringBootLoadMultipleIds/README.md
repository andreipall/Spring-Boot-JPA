
**[How To Load Multiple Entities By Id](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootLoadMultipleIds)**

**Description:** This is a SpringBoot application that loads multiple entities by id via a `@Query` based on the `IN` operator and via the Hibernate 5 `MultiIdentifierLoadAccess` interface.

**Key points:**
- for using the `IN` operator in a `@Query` simply add the query in the proper repository
- for using Hibernate 5 `MultiIdentifierLoadAccess` in Spring Data style provide the proper implementation
- among its advantages, the `MultiIdentifierLoadAccess` implementation allows us to load entities by multiple ids in batches and by inspecting or not the current Persistent Context (by default, the Persistent Context is not inspected to see if the entities are already loaded or not)
