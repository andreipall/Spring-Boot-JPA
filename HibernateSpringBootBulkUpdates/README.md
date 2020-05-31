**[How To *Bulk* Updates](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootBulkUpdates)**

<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/how-to-bulk-updates">If you prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>

**Description:** *Bulk* operations (updates and deletes) are faster than batching, can benefit from indexing, but they have three main shortcomings:

- *bulk* updates/deletes may leave the Persistence Context in an outdated state (it's up to you to prevent this issue by flushing the Persistence Context before update/delete and close/clear it after the update/delete to avoid issues created by potentially unflushed or outdated entities)
- *bulk* updates/deletes don't benefit of automatic optimistic locking mechanisms (e.g., `@Version` is ignored), therefore the *lost updates* are not prevented (it is advisable to signal these updates by explicitly incrementing `version` (if any is present)).
- *bulk* deletes cannot take advantage of cascading removals (`CascadeType.REMOVE`) and `orphanRemoval`

This application provides examples of *bulk* updates for `Author` and `Book` entities (between `Author` and `Book` there is a bidirectional lazy `@OneToMany` association). Both, `Author` and `Book`, has a `version` field.

**Key points:**
- this application provide an example of *bulk* updates that don't involve managed entities (data is not loaded in the Persistence Context)
- this application provide an example of *bulk* updates that involve managed entities (data is loaded in the Persistence Context before update it via *bulk* operations)
