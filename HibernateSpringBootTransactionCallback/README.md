**[How To Take Control Before/After Transaction Commits/Completes Via Callbacks](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootTransactionCallback)**
 
**Description:** This application is an example of using the `TransactionSynchronizationAdapter` for overriding `beforeCommit()`, `beforeCompletion()`, `afterCommit()` and `afterCompletion()` callbacks globally (application-level) and at method-level.

**Key points:**
- application-level: write an AOP component (see `TransactionProfiler`)
- method-level: use `TransactionSynchronizationManager.registerSynchronization()`
