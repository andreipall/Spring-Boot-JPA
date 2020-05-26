**[How To View Binding Params Via TRACE](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootLogTraceViewBindingParameters)**

**Description:** View the prepared statement binding/extracted parameters via `TRACE`.

**Key points:**
- in `application.properties` add: `logging.level.org.hibernate.type.descriptor.sql=TRACE`
- or, even better (for filtering SQLs capabilities), in a Logback specific configuration file add the proper logger
     
**Output sample:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootLogTraceViewBindingParameters/display%20binding%20and%20extracted%20parameters%20via%20TRACE.png)
