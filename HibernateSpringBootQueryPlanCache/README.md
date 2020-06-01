**[How To Use Hibernate Query Plan Cache](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootQueryPlanCache)**
 
**Description:** This application is an example of testing the Hibernate Query Plan Cache (QPC). Hibernate QPC is enabled by default and, for entity queries (JPQL and Criteria API), the QPC has a size of 2048, while for native queries it has a size of 128. Pay attention to alter these values to accommodate all queries
 executed by your application. If the number of exectued queries is higher than the QPC size (especially for entity queries) then you will start to experiment performance penalties caused by entity compilation time added for each query execution. 
 
 In this application, you can adjust the QPC size in `application.properties`. Mainly, there are 2 JPQL queries and a QPC of size 2. Switching from size 2 to size 1 will cause the compilation of one JPQL query at each execution. Measuring the times for 5000 executions using a QPC of size 2, respectively 1 reveals the importance of QPC in terms of time.

**Key points:**
- for JPQL and Criteria API you can set the QPC via `hibernate.query.plan_cache_max_size`
- for native queries you can set the QPC via `hibernate.query.plan_parameter_metadata_max_size`
