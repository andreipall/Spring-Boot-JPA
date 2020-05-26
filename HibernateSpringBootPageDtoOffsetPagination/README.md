**[Offset Pagination - Trigger `SELECT COUNT` Subquery And Return `Page<dto>`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPageDtoOffsetPagination)**

**Description:** This application fetches data as `Page<dto>` via Spring Boot offset pagination. Most of the time, the data that should be paginated is *read-only* data. Fetching the data into entities should be done only if we plan to modify that data, therefore, fetching *read only* data as `Page<entity>` is not preferable since it may end up in a significant performance penalty. The `SELECT COUNT` triggered for counting the total number of records is a subquery of the main `SELECT`. Therefore, there will be a single database roundtrip instead of two (typically, there is one query needed for fetching the data and one for counting the total number of records).

**Key points:**
- create a Spring projection (DTO) to contains getters only for the columns that should be fetched
- write a repository that extends `PagingAndSortingRepository`
- fetch data via a JPQL or native query (that includes counting) into a `List<dto>`
- use the fetched `List<dto>` and the proper `Pageable` to create a `Page<dto>`
