**[Offset Pagination - Trigger `SELECT COUNT` Subquery And Return `List<entity>` Via Extra Column](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootListEntityOffsetPaginationExtraColumn)**
 
**Description:** This application fetches data as `List<entity>` via Spring Boot offset pagination. The `SELECT COUNT` triggered for counting the total number of records is a subquery of the main `SELECT`. Therefore, there will be a single database roundtrip instead of two (typically, one query is needed for fetching the data and one for counting the total number of records).

**Key points:**
- write a repository that extends `PagingAndSortingRepository`
- in the `entity`, add an extra column for representing the total number of records and annotate it as `@Column(insertable = false, updatable = false)`
- fetch data via a native query (that includes `SELECT COUNT` subquery) into a `List<entity>` 
