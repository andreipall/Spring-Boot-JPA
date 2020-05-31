**[Versioned Optimistic Locking And Detached Entities Sample](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootVersionedOptimisticLockingAndDettachedEntity)**

**Description:** This is a sample application that shows how versioned (`@Version`) optimistic locking and detached entity works. Running the application will result in an optimistic locking specific exception (e.g., the Spring Boot specific, `OptimisticLockingFailureException`).

**Key points:**
- in a transaction, fetch an entity via `findById(1L)`; commit transaction and close the Persistence Context
- in a second transaction, fetch another entity via `findById(1L)` and update it; commit the transaction and close the Persistence Context
- outside transactional context, update the detached entity (fetched in the first transaction)
- in a third transaction, call `save()` and pass to it the detached entity; trying to merge (`EntityManager.merge()`) the entity will end up in an optimistic locking exception since the version of the detached and just loaded entity don't match
