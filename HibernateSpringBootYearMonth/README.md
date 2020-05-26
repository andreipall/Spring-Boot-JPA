**[How To Store `java.time.YearMonth` As `Integer` Or `Date` Via Hibernate Types Library](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootYearMonth)**

**Description:** [Hibernate Types](https://github.com/vladmihalcea/hibernate-types) is a set of extra types not supported by default in Hibernate Core. One of these types is `java.time.YearMonth`. This is a Spring Boot application that uses Hibernate Type to store this `YearMonth` in a MySQL database as integer or date.

**Key points:**
- for Maven, add Hibernate Types as a dependency in `pom.xml`
- in entity use `@TypeDef` to map `typeClass` to `defaultForType` 
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootYearMonth/Hibernate%20Types%20library.png)  
