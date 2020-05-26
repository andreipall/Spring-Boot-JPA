**[How `@ElementCollection` With `@OrderColumn` Works](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootElementCollectionWithOrderColumn)**

**Description:** This application reveals the performance penalties of using `@ElementCollection`. In this case, with `@OrderColumn`. But, as you can see in this application (in comparison with item 33), by adding `@OrderColumn` can mitigate some performance penalties when operations takes place near the collection tail (e.g., add/remove at/from the end of the collection). Mainly, all elements situated before the adding/removing entry are left untouched, so the performance penalty can be ignored if we affect rows close to the collection tail.

**Key points:**
- an `@ElementCollection` doesn't have a primary key
- an `@ElementCollection` is mapped in a separate table
- prefer `@ElementCollection` with `@OrderColumn` when you have a lot of inserts and deletes near the collection tail
- the more elements are inserted/removed from the beginning of the collection the greater the performance penalty will be
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootElementCollectionWithOrderColumn/%40ElementCollection%20with%20%40OrderColumn.png)
