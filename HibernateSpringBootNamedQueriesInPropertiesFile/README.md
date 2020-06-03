**[How To Use JPA Named Queries Via a Properties File](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootNamedQueriesInPropertiesFile)**
  
**Description:** JPA named (native) queries are commonly written via `@NamedQuery` and `@NamedNativeQuery` annotations in entity classes. Spring Data allows us to write our named (native) queries in a typical `*.properties` file inside the `META-INF` folder of your classpath. This way, we avoid modifying our entities. This application shows you how to do it.

**Warning:** Cannot use native queries with dynamic sorting (`Sort`). Nevertheless, using `Sort` in `Pageable` works fine. At least this is how it behave in Spring Boot 2.2.2.
 
**Key points:**
- define the named (native) queries in a file, `META-INF/jpa-named-queries.properties`
- follow the Spring `{EntityName}.{RepositoryMethodName}` naming convention for a quick and slim implementation
