**[How To Customize HikariCP Settings Via Properties](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootHikariCPPropertiesKickoff)**

**If you use the `spring-boot-starter-jdbc` or `spring-boot-starter-data-jpa` "starters", you automatically get a dependency to HikariCP**

**Note:** The best way to tune the connection pool parameters consist in using [Flexy Pool](https://github.com/vladmihalcea/flexy-pool) by Vlad Mihalcea. Via [Flexy Pool](https://github.com/vladmihalcea/flexy-pool) you can find the optim settings that sustain high-performance of your connection pool.

**Description:** This is a kickoff application that set up HikariCP via `application.properties` only. The `jdbcUrl` is set up for a MySQL database. For testing purposes, the application uses an `ExecutorService`for simulating concurrent users. Check the HickariCP report revealing the connection pool status.

**Key points:**
- in `application.properties`, rely on `spring.datasource.hikari.*` to configure HikariCP

**Output sample:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootHikariCPPropertiesKickoff/HikariCP%20trace%20log.png)
