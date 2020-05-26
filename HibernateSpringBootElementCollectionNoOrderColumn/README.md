**[How Regular `@ElementCollection` (Without `@OrderColumn`) Works](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootElementCollectionNoOrderColumn)**

**Description:** This application reveals the possible performance penalties of using `@ElementCollection`. In this case, without `@OrderColumn`. As you can see in the next item (34) adding `@OrderColumn` can mitigate some performance penalties.

**Key points:**
- an `@ElementCollection` doesn't have a primary key
- an `@ElementCollection` is mapped in a separate table
- avoid `@ElementCollection` when you have a lot of inserts/deletes on this collection; inserts/deletes will cause Hibernate to delete all the existing table rows, process the collection in-memory, and re-insert the remaining table rows to mirror the collection from memory
- the more entries we have in this collection the greater the performance penalty will be
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootElementCollectionNoOrderColumn/%40ElementCollection%20without%20%40OrderColumn.png)
