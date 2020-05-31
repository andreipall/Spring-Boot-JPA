**[How To Simulate `OptimisticLockException` In Version-less Optimistic Locking](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSimulateVersionlessOptimisticLocking)**

**Note:** Version-less optimistic locking doesn't work for detached entities (do not close the Persistence Context).

**Description:** This is a Spring Boot application that simulates a scenario that leads to an optimistic locking exception. So, running the application should end up with a Spring specific `ObjectOptimisticLockingFailureException` exception.

**Key points:**
- set up the version-less optimistic locking mechanism
- rely on two concurrent threads that call the same a `@Transactional` method used for updating data
