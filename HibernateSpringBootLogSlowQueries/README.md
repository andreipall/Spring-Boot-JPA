**[Log Slow Queries Via DataSource-Proxy](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootLogSlowQueries)**

**Description:** This application is a sample of logging only slow queries via **[DataSource-Proxy](https://github.com/ttddyy/datasource-proxy)**. A slow query is a query that has an execution time bigger than a specificed threshold in milliseconds.

**Key points:**
- for Maven, add in `pom.xml` the DataSource-Proxy dependency
- create an bean post processor to intercept the `DataSource` bean
- wrap the `DataSource` bean via `ProxyFactory` and an implementation of `MethodInterceptor`
- choose a threshold in milliseconds
- define a listener and override `afterQuery()`
   
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootLogSlowQueries/log%20slow%20queries%20via%20datasource-proxy.png)
