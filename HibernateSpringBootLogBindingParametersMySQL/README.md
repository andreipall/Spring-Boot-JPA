**[How To View Binding Params Via `profileSQL=true` In MySQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootLogBindingParametersMySQL)**

**Description:** View the prepared statement binding parameters via `profileSQL=true` in MySQL.

**Key points:**
- in `application.properties` append `logger=Slf4JLogger&profileSQL=true` to the JDBC URL (e.g., `jdbc:mysql://localhost:3306/bookstoredb?createDatabaseIfNotExist=true&logger=Slf4JLogger&profileSQL=true`)
     
**Output sample:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootLogBindingParametersMySQL/display%20binding%20via%20profileSQL%3Dtrue.png)
