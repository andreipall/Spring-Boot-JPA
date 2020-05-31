**[Calling Stored Procedure That Returns A Result Set Via `JdbcTemplate`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCallStoredProcedureJdbcTemplate)**

**Note:** Most probably you'll like to process the result set via `BeanPropertyRowMapper` as [here](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCallStoredProcedureJdbcTemplateBeanPropertyRowMapper). This is less verbose than the approach used here. Nevertheless, this approach is useful to understand how the result set looks like.
 
**Description:** This application is an example of calling a MySQL stored procedure that returns a result set via `JdbcTemplate`.
 
**Key points:**
- rely on `JdbcTemplate` and `SimpleJdbcCall`
