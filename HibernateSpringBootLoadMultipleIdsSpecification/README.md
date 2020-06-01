**[How To Load Multiple Entities By Id Via Specification](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootLoadMultipleIdsSpecification)**

**Description:** This is a SpringBoot application that loads multiple entities by id via a `@Query` based on the `IN` operator and via `Specification`. 

**Key points:**
- for using the `IN` operator in a `@Query` simply add the query in the proper repository
- for using a `Specification` rely on `javax.persistence.criteria.Root.in()`
