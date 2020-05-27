**[How To Use Hibernate Soft Deletes In A Spring Boot Application](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSoftDeletes)**

**Description:** This application is an example of using Hibernate soft deletes in a Spring Boot application. 

**Key points:**
- define an `abstract` class `BaseEntity` with a field named `deleted`
- the entities (e.g., `Author` and `Book` entities) that should take advantage of soft deletes should extend `BaseEntity`
- these entities should be marked with Hibernate, `@Where` annotation like this: `@Where(clause = "deleted = false")`
- these entities should be marked with Hibernate, `@SQLDelete` annotation to trigger `UPDATE` SQLs in place of `DELETE` SQLs, as follows: `@SQLDelete(sql = "UPDATE author SET deleted = true WHERE id = ?")`
- for fetching all entities including those marked as deleted or for fetching only the entities marked as deleted we need to rely on SQL native queries

**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootSoftDeletes/soft%20deletes.png)
