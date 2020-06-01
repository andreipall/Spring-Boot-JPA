**[DTO Via Spring Data Class-Based Projections](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaClassBasedProjections)** 

**Description:** Fetch only the needed data from the database via Spring Data Projections (DTO). In this case, via class-based projections.

**Key points:**
- write an class (projection) containing a constructor, getters, setters, `equals()` and `hashCode()` only for the columns that should be fetched from the database
- write the proper query returning a `List<projection>`
- if it is applicable, limit the number of returned rows (e.g., via `LIMIT`) 
- in this example, we can use query builder mechanism built into Spring Data repository infrastructure
     
**Note:** Using projections is not limited to use query builder mechanism built into Spring Data repository infrastructure. We can fetch projections via JPQL or native queries as well. For example, in this [application](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaProjectionsAndJpql) we use a JPQL.
     
**Output example (select first 2 rows; select only "name" and "age"):**
<a href="#"><img src="https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDtoViaProjections/DTOs%20via%20Spring%20projections.png" align="center" height="251" width="658" ></a>
