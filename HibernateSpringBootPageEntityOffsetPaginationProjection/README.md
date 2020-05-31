**[Offset Pagination - Trigger `SELECT COUNT` Subquery And Return `Page<projection>` That Maps Entities And The Total Number Of Records Via Projection](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPageEntityOffsetPaginationProjection)**
 
**Description:** This application fetches data as `Page<projection>` via Spring Boot offset pagination. The projection maps the entity and the total number of records. This information is fetched in a single database rountrip because the `SELECT COUNT` triggered for counting the total number of records is a subquery of the main `SELECT`. 

**Key points:**
- define a Spring projection that maps the entity and the total number of records
- write a repository that extends `PagingAndSortingRepository`
- fetch data via a JPQL query into a `List<projection>`
- use the fetched `List<projection>` and `Pageable` to create a `Page<projection>`
