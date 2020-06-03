**[Log Slow Queries Via Hibernate 5.4.5](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootLogSlowQueries545)**

**Description:** This application is a sample of logging only slow queries via Hibernate 5.4.5, `hibernate.session.events.log.LOG_QUERIES_SLOWER_THAN_MS` property. A slow query is a query that has an execution time bigger than a specificed threshold in milliseconds.

**Key points:**
- in `application.properties` add `hibernate.session.events.log.LOG_QUERIES_SLOWER_THAN_MS`
   
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootLogSlowQueries545/log%20slow%20queries%20Hibernate%205.4.5.png)
