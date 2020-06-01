**[How `PESSIMISTIC_READ` And `PESSIMISTIC_WRITE` Works In MySQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPessimisticLocks)**
 
**Description:** This application is an example of using `PESSIMISTIC_READ` and `PESSIMISTIC_WRITE` in MySQL. In a nutshell, each database system defines its own syntax for acquiring shared and exclusive locks and not all databases support both types of locks. Depending on `Dialect`, the syntax can vary for the same database as well (Hibernate relies on `Dialect` for chosing the proper syntax). In MySQL, `MySQL5Dialect` doesn't support locking, while InnoDB engine (`MySQL5InnoDBDialect` and `MySQL8Dialect`) supports shared and exclusive locks as expected.

**Key points:**
- rely on `@Lock(LockModeType.PESSIMISTIC_READ)` and `@Lock(LockModeType.PESSIMISTIC_WRITE)` on query-level
- for testing, use `TransactionTemplate` to trigger two concurrent transactions that read and write the same row
