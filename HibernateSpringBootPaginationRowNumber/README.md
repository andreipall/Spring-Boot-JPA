**[How To Implement Pagination Via `ROW_NUMBER()` Window Function](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPaginationRowNumber)**
 
**Description:** This application is an example of using `ROW_NUMBER()` (and `COUNT(*) OVER()` for counting all elements) window function to implement pagination.

**Key points:**
- use a native query relying on `ROW_NUMBER()`
- we don't return a page as `Page` or `Slice`, we return it as `List`, therefore `Pageable` is not used
