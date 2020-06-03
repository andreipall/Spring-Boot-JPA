**[How To Use JPA Named Queries Via Properties File And Spring Projection (DTO)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoSpringProjectionPropertiesNamedQuery)**
 
**Description:** This application is an example of combining JPA named queries listed in a properties file and Spring projections (DTO). For queries names we use the `{EntityName}.{RepositoryMethodName}` naming convention. This convention allows us to create in the repository interface methods with the same name as of named query.
  
**Key points:**
- define the named queries in a properties file (e.g., `jpa-named-queries.properties`) in a folder named `META-INF` the application classpath 
- define the proper Spring projection
