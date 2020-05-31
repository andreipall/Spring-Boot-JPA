**[Offset Pagination - Trigger `SELECT COUNT` Subquery And Return `Page<entity>` Via Extra Column](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPageEntityOffsetPaginationExtraColumn)**

**Description:** This application fetches data as `Page<entity>` via Spring Boot offset pagination. Use this only if the fetched data will be modified. Otherwise, fetch `Page<dto>` as [here](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPageDtoOffsetPagination). The `SELECT COUNT` triggered for counting the total number of records is a subquery of the main `SELECT`. Therefore, there will be a single database roundtrip instead of two (typically, there is one query needed for fetching the data and one for counting the total number of records).

**Key points:**
- write a repository that extends `PagingAndSortingRepository`
- in the entity, add an extra column for representing the total number of records and annotate it as `@Column(insertable = false, updatable = false)`
- fetch data via a native query (that includes counting) into a `List<entity>`
- use the fetched `List<entity>` and `Pageable` to create a `Page<entity>`
