**[How To Execute SQL Functions In JPQL Query](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootJpqlFunctionsParams)**

**Note**: Using SQL functions in the `WHERE` part (not in the `SELECT` part) of  query in JPA 2.1 can be done via `function()` as [here](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootJpqlFunction).

**Description:** Trying to use SQL functions (standard or defined) in JPQL queries may result in exceptions if Hibernate will not recognize them and cannot parse the JPQL query. For example, the MySQL, `concat_ws` function is not recognized by Hibernate. This application is a Spring Boot application based on Hibernate 5.3, that registers the `concat_ws` function via `MetadataBuilderContributor` and inform Hibernate about it via, `metadata_builder_contributor` property. This example uses `@Query` and `EntityManager` as well, so you can see two use cases.

**Key points:**
- use Hibernate 5.3 (or, to be precisely, 5.2.18) (e.g., use Spring Boot 2.1.0.RELEASE)
- implement `MetadataBuilderContributor` and register the `concat_ws` MySQL function
- in `application.properties`, set `spring.jpa.properties.hibernate.metadata_builder_contributor` to point out Hibernate to `MetadataBuilderContributor` implementation
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootJpqlFunctionsParams/SQL%20functions%20in%20JPQL%20parameters.png)    
