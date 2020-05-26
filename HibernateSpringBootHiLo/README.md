**[How To Generate Sequences Of Identifiers Via Hibernate `hi/lo` Algorithm](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootHiLo)**

 **Note:** If systems external to your application need to insert rows in your tables then don't rely on `hi/lo` algorithm since, in such cases, it may cause errors resulted from generating duplicated identifiers. Rely on `pooled` or `pooled-lo` algorithms (optimizations of `hi/lo`).
 
**Description:** This is a Spring Boot example of using the `hi/lo` algorithm for generating 1000 identifiers in 10 database roundtrips for batching 1000 inserts in batches of 30. 

**Key points:**
- use the `SEQUENCE` generator type (e.g., in PostgreSQL)
- configure the `hi/lo` algorithm as in `Author.java` entity
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootHiLo/Hibernate%20hilo%20algorithm.png)
