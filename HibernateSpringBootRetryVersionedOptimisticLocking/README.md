
**[How To Retry Transactions After `OptimisticLockException` Exception (`@Version`)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootRetryVersionedOptimisticLocking)**

**Note:** Optimistic locking mechanism via `@Version` works for detached entities as well.

**Description:** This is a Spring Boot application that simulates a scenario that leads to an optimistic locking exception. When such exception occur, the application retry the corresponding transaction via [db-util](https://github.com/vladmihalcea/db-util) library developed by Vlad Mihalcea.

**Key points:**
- for Maven, in `pom.xml`, add the `db-util` dependency
- configure the `OptimisticConcurrencyControlAspect` bean
- mark the method (not annotated with `@Transactional`) that is prone to throw (or that calls a method that is prone to throw (this method can be annotated with `@Transactional`)) an optimistic locking exception with `@Retry(times = 10, on = OptimisticLockingFailureException.class)`

**Output sample:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootRetryVersionedOptimisticLocking/Retry%20Optimistic%20Lock.png)
