**[How To Retry Transaction Via `TransactionTemplate` After `OptimisticLockException` Exception (`@Version`)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootRetryVersionedOptimisticLockingTT)**

**Note:** Optimistic locking via `@Version` works for detached entities as well.

**Description:** This is a Spring Boot application that simulates a scenario that leads to an optimistic locking exception. When such exception occurs, the application retry the corresponding transaction via [db-util](https://github.com/vladmihalcea/db-util) library developed by Vlad Mihalcea.

**Key points:**
- in `pom.xml`, add the `db-util` dependency
- configure the `OptimisticConcurrencyControlAspect` bean
- rely on `TransactionTemplate`
