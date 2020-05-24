**[Why To Avoid PostgreSQL (`BIG`)`SERIAL` In Batching Inserts Via Hibernate](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootBatchingAndSerial)**

**Description:** In PostgreSQL, using `GenerationType.IDENTITY` will disable insert batching. The `(BIG)SERIAL` is acting "almost" like MySQL, `AUTO_INCREMENT`. In this application, we use the `GenerationType.SEQUENCE` which permits insert batching, and we optimize it via the `hi/lo` optimization algorithm. 

**Key points:**
- use `GenerationType.SEQUENCE` instead of `GenerationType.IDENTITY`
- rely on the `hi/lo` algorithm to fetch a *hi* value in a database roundtrip (the *hi* value is useful for generating a certain/given number of identifiers in-memory; until you haven't exhausted all in-memory identifiers there is no need to fetch another *hi*) 
- you can go even further and use the Hibernate `pooled` and `pooled-lo` identifier generators (these are optimizations of `hi/lo` that allows external services to use the database without causing duplication keys errors)
- optimize batching via `spring.datasource.hikari.data-source-properties.reWriteBatchedInserts=true`
   
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootBatchingAndSerial/PostgreSQL%20(BIG)SERIAL%20and%20Batching%20Inserts.png)
