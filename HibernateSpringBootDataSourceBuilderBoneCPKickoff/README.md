**[How To Customize BoneCP Settings Via Properties And `DataSourceBuilder`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDataSourceBuilderBoneCPKickoff)**

**Note:** The best way to tune the connection pool parameters consist in using [Flexy Pool](https://github.com/vladmihalcea/flexy-pool) by Vlad Mihalcea. Via [Flexy Pool](https://github.com/vladmihalcea/flexy-pool) you can find the optim settings that sustain high-performance of your connection pool.
 
**Description:** This is a kickoff application that set up BoneCP via `DataSourceBuilder`. The `jdbcUrl` is set up for a MySQL database. For testing purposes, the application uses an `ExecutorService` for simulating concurrent users. 

**Key points:**
- in `pom.xml` add the BoneCP dependency
- in `application.properties`, configure BoneCP via a custom prefix, e.g., `app.datasource.*`
- write a `@Bean` that returns the `DataSource`

**Output sample:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDataSourceBuilderBoneCPKickoff/BoneCP%20trace%20log.png)
