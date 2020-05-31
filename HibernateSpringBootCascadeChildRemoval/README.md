**[The Best Way To Remove Parent And Child Entities Via Bulk Deletions](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCascadeChildRemoval)**

**Description:** Commonly, deleting a parent and the associated children via `CascadeType.REMOVE`  and/or `orphanRemoval=true` involved several SQL statements (e.g., each child is deleted in a dedicated `DELETE` statement). When the number of entities is significant, this is far from being efficient, therefore other approaches should be employed. 

Consider `Author` and `Book` in a bidirectional-lazy `@OneToMany` association. This application exposes the best way to delete the parent(s) and the associated children in four scenarios listed below. These approaches relies on *bulk* deletions, therefore they are not useful if you want the deletions to take advantage of automatic optimistic locking mechanisms (e.g., via `@Version`): 

**Best way to delete author(s) and the associated books via *bulk* deletions when:**
- One `Author` is in Persistent Context, no `Book`
- More `Author` are in the Persistent Context, no `Book`
- One `Author` and the associated `Book` are in Persistent Context
- No `Author` or `Book` is in Persistent Context
     
**Note:** The most efficient way to delete all entities via a *bulk* deletion can be done via the built-in `deleteAllInBatch()`. 
