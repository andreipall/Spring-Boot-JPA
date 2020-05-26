**[How To Delay Connection Acquisition As Needed (Hibernate 5.2.10)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDelayConnection)**

**Description:** This is a Spring Boot example that exploits Hibernate 5.2.10 capability of delaying the connection acquisition as needed. By default, in *resource-local* mode, a database connection is aquried immediately after calling a method annotated with `@Transactional`. If this method contains some time-consuming tasks before the first SQL statement then the connection is hold open for nothing. But, Hibernate 5.2.10 allows us to delay the connection acquisition as needed. This example rely on HikariCP as the default connection pool for Spring Boot.

**Key points:**
- set `spring.datasource.hikari.auto-commit=false` in application.properties
- set `spring.jpa.properties.hibernate.connection.provider_disables_autocommit=true` in `application.properties`
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDelayConnection/delay%20connection%20acquisition%201.png)
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDelayConnection/delay%20connection%20acquisition%202.png)
