**[View Binding/Extracted Params Via Log4J 2](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootViewBindingParameters)**

**Description:** View the prepared statement binding/extracted parameters via Log4J 2 logger setting.

**Key points:**
- for Maven, in `pom.xml`, exclude Spring Boot's Default Logging
- for Maven, in `pom.xml`, Add Log4j 2 Dependency
- in `log4j2.xml` add, `<Logger name="org.hibernate.type.descriptor.sql" level="trace"/>`
   
**Output example:**
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootViewBindingParameters/display%20binding%20and%20extracted%20parameters.png)
