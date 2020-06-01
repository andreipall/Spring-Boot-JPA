**[How To Optimize Batch Inserts of Parent-Child Relationships And Batch Per Transaction (MySQL)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootBatchInsertOrderBatchPerTransaction)**
 
**Description:** Let's suppose that we have a one-to-many relationship between `Author` and `Book` entities. When we save an author, we save his books as well thanks to cascading all/persist. We want to create a bunch of authors with books and save them in the database (e.g., a MySQL database) using the batch technique. By default, this will result in batching each author and the books per author (one batch for the author and one batch for the books, another batch for the author and another batch for the books, and so on). In order to batch authors and books, we need to **order inserts** as in this application.

Moreover, this example commits the database transaction after each batch excecution. This way we avoid long-running transactions and, in case of a failure, we rollback only the failed batch and don't lose the previous batches. For each batch, the Persistent Context is flushed and cleared, therefore we maintain a thin Persistent Context. This way the code is not prone to memory errors and performance penalties caused by slow flushes.

**Key points:**
- beside all setting specific to batching inserts in MySQL, we need to set up in `application.properties` the following property: `spring.jpa.properties.hibernate.order_inserts=true`
- in your DAO layer, commit the database transaction after each batch execution

**Example without ordered inserts:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootBatchInsertOrder/batch%20inserts%20including%20associations%20no%20order%20of%20inserts.png)

**Example with ordered inserts:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootBatchInsertOrder/batch%20inserts%20including%20associations%20ordered%20inserts.png)
