**[Use Read-Only Entity Whenever You Plan To Propagate Entity Changes To The Database In A Future Persistent Context](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootReadOnlyQueries)**
 
**Description:** This application highlights the difference betweeen loading entities in *read-write* vs. *read-only* mode. If you plan to modify the entities in a future Persistent Context then fetch them as *read-only* in the current Persistent Context.

**Key points:**
- in the current Persistent Context, fetch entities in *read-only* mode 
- modifiy the entities in the current Persistent Context or in detached state (the potential modifications done in the current Persistent Context will not be propagated to the database at flush time)
- in a subsequent Persistent Context, merge the detached entity and propagate changes to the database

**Note:** If you never plan to modify the fetched result set then use DTO (e.g., Spring projection), not *read-only* entities.
