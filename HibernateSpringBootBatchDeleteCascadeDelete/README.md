**[How To Batch Deletes In MySQL Via SQL `ON DELETE CASCADE`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootBatchDeleteCascadeDelete)**

<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/how-to-batch-deletes-in-mysql-via-sql-on-delete-cascade">If you prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>

**Description:** Batch deletes in MySQL via `ON DELETE CASCADE`. Auto-generated database schema will contain the `ON DELETE CASCADE` directive.

**Note:** Spring `deleteAllInBatch()` and `deleteInBatch()` don't use delete batching and don't take advantage of cascading removal, `orphanRemoval` and automatic optimistic locking mechanism to prevent *lost updates* (e.g., `@Version` is ignored), but both of them take advantage on `ON DELETE CASCADE` and are very efficient. They trigger *bulk* operations via `Query.executeUpdate()`, therefore, the Persistence Context is not synchronized accordingly (it's up to you to flush (before delete) and close/clear (after delete) the Persistence Context accordingly to avoid issues created by unflushed (if any) or outdated (if any) entities). The first one simply triggers a `delete from entity_name` statement, while the second one triggers a `delete from entity_name where id=? or id=? or id=? ...` statement. For delete in batches rely on `deleteAll()`, `deleteAll(Iterable<? extends T> entities)` or `delete()` method. Behind the scene, the two flavors of `deleteAll()` relies on `delete()`. Mixing batching with database automatic actions (`ON DELETE CASCADE`) will result in a partially synchronized Persistent Context.

**Key points:**
- in this application, we have a `Author` entity and each author can have several `Book` (*one-to-many*)
- first, we remove `orphanRemoval` or set it to `false`
- second, we use only `CascadeType.PERSIST` and `CascadeType.MERGE`
- third, we set `@OnDelete(action = OnDeleteAction.CASCADE)` next to `@OneToMany`
- fourth, we set `spring.jpa.properties.hibernate.dialect` to `org.hibernate.dialect.MySQL5InnoDBDialect` (or, `MySQL8Dialect`)
- fifth, we run through a set of `deleteFoo()` methods that uses *bulk* and batching deletes as well
        
**Output example:**

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootBatchDeleteCascadeDelete/batch%20delete%20via%20SQL%20cascade%20delete.png)
