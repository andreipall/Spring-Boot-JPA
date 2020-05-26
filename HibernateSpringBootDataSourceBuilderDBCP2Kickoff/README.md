**[How To Customize DBCP2 Settings Via Properties And `DataSourceBuilder`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDataSourceBuilderDBCP2Kickoff)**

**Note:** The best way to tune the connection pool parameters consist in using [Flexy Pool](https://github.com/vladmihalcea/flexy-pool) by Vlad Mihalcea. Via [Flexy Pool](https://github.com/vladmihalcea/flexy-pool) you can find the optim settings that sustain high-performance of your connection pool.
 
**Description:** This is a kickoff application that set up DBCP2 via `DataSourceBuilder`. The `jdbcUrl` is set up for a MySQL database. For testing purposes, the application uses an `ExecutorService` for simulating concurrent users. 

**Key points:**
- in `pom.xml` add the DBCP2 dependency
- in `application.properties`, configure DBCP2 via a custom prefix, e.g., `app.datasource.*`
- write a `@Bean` that returns the `DataSource`
