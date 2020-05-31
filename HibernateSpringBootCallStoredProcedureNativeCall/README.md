**[Calling Stored Procedure That Returns A Result Set Via Native Query](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCallStoredProcedureNativeCall)**
 
**Description:** This application is an example of calling a MySQL stored procedure that returns a result set (entity or DTO) via a native query.
 
**Key points:**
- rely on a native call as `@Query(value = "{CALL FETCH_AUTHOR_BY_GENRE (:p_genre)}", nativeQuery = true)`