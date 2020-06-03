**[How To Optimize The Merge Operation Using Update](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSaveAndMerge)** 
 
**Description:** Behind the built-in Spring Data `save()` there is a call of `EntityManager#persist()` or `EntityManager#merge()`. It is important to know this aspect in several cases. Among this cases, we have the entity update case (simple update or update batching). 

Consider `Author` and `Book` involved in a bidirectional-lazy `@OneToMany` association. And, we load an `Author`, detach it, update it in the *detached* state, and save it to the database via `save()` method. Calling `save()` will come with the following two issues resulting from calling `merge()` behind the scene:

- there will be two SQL statements, one `SELECT` (merge) and one `UPDATE`
- the `SELECT` will contain a `LEFT OUTER JOIN` to fetch the associated `Book` as well (we don't need the books!)

How about triggering only the `UPDATE` instead of this? The solution relies on calling `Session#update()`. Calling `Session.update()` requires to unwrap the `Session` via `entityManager.unwrap(Session.class)`.

**Key points:**
- calling `Session.update()` will trigger only the `UPDATE` (there is no `SELECT`)
- `Session.update()` works with *versioned* optimistic locking mechanism as well (so, *lost updates* are prevented)
