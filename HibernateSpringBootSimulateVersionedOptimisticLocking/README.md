**[How To Simulate `OptimisticLockException` Shaped Via `@Version`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSimulateVersionedOptimisticLocking)**

**Note:** Optimistic locking via `@Version` works for detached entities as well.

**Description:** This is a Spring Boot application that simulates a scenario that leads to an optimistic locking exception. So, running the application should end up with a Spring specific `ObjectOptimisticLockingFailureException` exception.

**Key points:**
- set up versioned optimistic locking mechanism
- rely on two concurrent threads that call the same `@Transactional` method used for updating data
