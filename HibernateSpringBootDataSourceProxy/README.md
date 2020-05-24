
**[View Query Details Via DataSource-Proxy Library](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDataSourceProxy)**

**Description:** View the query details (query type, binding parameters, batch size, execution time, etc) via **[DataSource-Proxy](https://github.com/ttddyy/datasource-proxy)**

**Key points:**
- for Maven, add in `pom.xml` the `datasource-proxy` dependency
- create an bean post processor to intercept the `DataSource` bean
- wrap the `DataSource` bean via `ProxyFactory` and an implementation of `MethodInterceptor`
   
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDataSourceProxy/query%20details%20via%20datasource-proxy.png)
