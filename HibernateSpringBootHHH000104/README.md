**[How To Avoid HHH000104 And Use Pagination Of Parent-Child](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootHHH000104)**

**Description:** HHH000104 is a Hibernate warning that tell us that pagination of a result set is tacking place in memory. For example, consider the `Author` and `Book` entities in a lazy-bidirectional `@OneToMany` association and the following query: 

  `@Transactional`\
  `@Query(value = "SELECT a FROM Author a LEFT JOIN FETCH a.books WHERE a.genre = ?1",`\
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`countQuery = "SELECT COUNT(a) FROM Author a WHERE a.genre = ?1")`\
  `Page<Author> fetchWithBooksByGenre(String genre, Pageable pageable);`

Calling `fetchWithBooksByGenre()` works fine only that the following warning is signaled: `HHH000104: firstResult / maxResults specified with collection fetch; applying in memory!` Obviously, having pagination in memory cannot be good from performance perspective. This application implement a solution for moving pagination at database-level.

**Key points:**
- use three or two JPQL queries for fetching `Page` of entities in read-write or read-only mode
- use two JPQL queries for fetching `Slice` or `List` of entities in read-write or read-only mode