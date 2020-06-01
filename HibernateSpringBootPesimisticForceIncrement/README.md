**[How To Increment The Version Of The Locked Entity Even If This Entity Was Not Modified `PESSIMISTIC_FORCE_INCREMENT`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPesimisticForceIncrement)**

**Description:** This application is a sample of how `PESSIMISTIC_FORCE_INCREMENT` works in MySQL. This is useful when you want to increment the version of the locked entity even if this entity was not modified. Via `PESSIMISTIC_FORCE_INCREMENT` the version is updated (incremented) immediately (the entity version update is guaranteed to succeed immediately after acquiring the row-level lock). The incrementation takes place before the entity is returned to the data access layer.

**Key points:**
- use a root entity, `Chapter` (which uses `@Version`)
- several editors load a chapter and perform modifications mapped via the `Modification` entity
- between `Modification` (child-side) and `Chapter` (parent-side) there is a lazy unidirectional `@ManyToOne` association
- for each modification, Hibernate will trigger an `INSERT` statement against the `modification` table, therefore the `chapter` table will not be modified by editors
- but, `Chapter` entity `version` is needed to ensure that modifications are applied sequentially (each editor is notified if a modificaton was added since his chapter copy was loaded and he must re-load the chapter)
- the `version` is forcibly increased at each modification (this is materialized in an `UPDATE` triggered against the `chapter` table immediately after aquiring the row-level lock)
- set `PESSIMISTIC_FORCE_INCREMENT` in the corresponding repository
- rely on two concurrent transactions to shape two scenarios: one that will lead to an exception of type `OptimisticLockException` and one that will lead to `QueryTimeoutException`          
     
**Note:** Pay attention to the MySQL dialect: `MySQL5Dialect` (MyISAM) doesn't support row-level locking, `MySQL5InnoDBDialect` (InnoDB) acquires row-level lock via `FOR UPDATE` (timeout can be set), `MySQL8Dialect` (InnoDB) acquires row-level lock via `FOR UPDATE NOWAIT`.
