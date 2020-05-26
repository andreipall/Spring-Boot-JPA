**[How To Fetch DTO Via `javax.persistence.Tuple` And Native SQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoTupleAndSql)**

**Description:** Fetching more data than needed is prone to performance penalities. Using DTO allows us to extract only the needed data. In this application we rely on `javax.persistence.Tuple` and native SQL.

**Key points:**
- use `java.persistence.Tuple` in a Spring repository and mark the query as `nativeQuery = true`
- for using Spring Data Projections check this [item](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaProjections)  
