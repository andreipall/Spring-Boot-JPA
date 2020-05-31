**[Offset Pagination - Trigger `COUNT(*) OVER` And Return `List<entity>` Via Extra Column](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootListEntityOffsetPaginationExtraColumnWF)**
 
**Description:** Typically, in offset pagination, there is one query needed for fetching the data and one for counting the total number of records. But, we can fetch this information in a single database rountrip via a `SELECT COUNT` subquery nested in the main `SELECT`. Even better, for databases vendors that support *Window Functions* there is a solution relying on `COUNT(*) OVER()` as in this application that uses this window function in a native query against MySQL 8. So, prefer this one instead of `SELECT COUNT` subquery.This application fetches data as `List<entity>` via Spring Boot offset pagination, but, if the fetched data is *read-only*, then rely on `List<dto>` as [here](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootListDtoOffsetPaginationWF). 

**Key points:**
- write a repository that extends `PagingAndSortingRepository`
- in the `entity`, add an extra column for representing the total number of records and annotate it as `@Column(insertable = false, updatable = false)`
- fetch data via a native query (that includes `COUNT(*) OVER` subquery) into a `List<entity>`          
