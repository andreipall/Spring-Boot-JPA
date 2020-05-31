**[Calling Stored Procedure That Returns A Result Set (Entity And DTO)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCallStoredProcedureReturnResultSet)**
  
**Description:** This application is an example of calling a MySQL stored procedure that returns a result set. The application fetches entities (e.g., `List<Author>`) and DTO (e.g., `List<AuthorDto>`).

**Key points:**
- rely on `EntiyManager` since Spring Data `@Procedure` will not work
