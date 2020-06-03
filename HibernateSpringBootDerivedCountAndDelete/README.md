**[How To Write Derived Count And Delete Queries](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDerivedCountAndDelete)**

**Description:** Spring Data comes with the Query Builder mechanism for JPA that is capable to interpret a query method name (known as a derived query) and convert it into a SQL query in the proper dialect. This is possible as long as we respect the naming conventions of this mechanism. Beside the well-known query of type `find...`, Spring Data supports derived count queries and derived delete queries.

**Key points:**
- a derived count query starts with `count...` (e.g., `long countByGenre(String genre)`) - Spring Data will generate a `SELECT COUNT(...) FROM ...` query 
- a derived delete query can return the number of deleted records or the list of the deleted records
- a derived delete query that returns the number of deleted records starts with `delete...` or `remove...` and returns `long` (e.g., `long deleteByGenre(String genre)`) - Spring Data will trigger first a `SELECT` to fetch entities in the Persistence Context, and, afterwards, it triggers a `DELETE` for each entity that must be deleted 
- a derived delete query that returns the list of deleted records starts with `delete...` or `remove...` and returns `List<entity>` (e.g., `List<Author> removeByGenre(String genre)`) - Spring Data will trigger first a `SELECT` to fetch entities in the Persistence Context, and, afterwards, it triggers a `DELETE` for each entity that must be deleted 
