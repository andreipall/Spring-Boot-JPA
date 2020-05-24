**[How To Use JPA Named Queries Via The `orm.xml` File](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/HibernateSpringBootNamedQueriesInOrmXml)**
  
**Description:** JPA named (native) queries are commonly written via `@NamedQuery` and `@NamedNativeQuery` annotations in entity classes. Spring Data allows us to write our named (native) queries in a typical `orm.xml` file inside the `META-INF` folder of your classpath. This way, we avoid modifying our entities. This application shows you how to do it.

**Warning:** Pay attention that, via this approach, we cannot use named (native) queries with dynamic sorting (`Sort`). Using `Sort` in `Pageable` is ignored, therefore you need to explicitly add `ORDER BY` in the queries. At least this is how it behave in Spring Boot 2.2.2. A better approach relies on using a [properties](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/HibernateSpringBootNamedQueriesInPropertiesFile) file for listing the named (native) queries. In this case, dynamic `Sort` works for named queries, but not for named native queries. Using `Sort` in `Pageable` works as expected in named (native) queries. 
 
**Key points:**
- define the named (native) queries in a file, `META-INF/orm.xml`
- follow the Spring `{EntityName}.{RepositoryMethodName}` naming convention for a quick and slim implementation

-----------------------------------------------------------------------------------------------------------------------    
<table>
     <tr><td><b>If you need a deep dive into the performance recipes exposed in this repository then I am sure that you will love my book "Spring Boot Persistence Best Practices"</b></td><td><b>If you need a hand of tips and illustrations of 100+ Java persistence performance issues then "Java Persistence Performance Illustrated Guide" is for you.</b></td></tr>
     <tr><td>
<a href="https://www.apress.com/us/book/9781484256251"><p align="left"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Spring%20Boot%20Persistence%20Best%20Practices.jpg" height="500" width="450"/></p></a>
</td><td>
<a href="https://leanpub.com/java-persistence-performance-illustrated-guide"><p align="right"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Java%20Persistence%20Performance%20Illustrated%20Guide.jpg" height="500" width="450"/></p></a>
</td></tr></table>

-----------------------------------------------------------------------------------------------------------------------    

