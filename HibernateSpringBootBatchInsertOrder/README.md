**[How To Optimize Batch Inserts of Parent-Child Relationships In MySQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootBatchInsertOrder)**

<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/how-to-optimize-batch-inserts-of-parent-child-relationships-in-mysql">If you prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>

**Description:** Let's suppose that we have a one-to-many relationship between `Author` and `Book` entities. When we save an author, we save his books as well thanks to cascading all/persist. We want to create a bunch of authors with books and save them in the database (e.g., a MySQL database) using the batch technique. By default, this will result in batching each author and the books per author (one batch for the author and one batch for the books, another batch for the author and another batch for the books, and so on). In order to batch authors and books, we need to **order inserts** as in this application.

**Key points:**
Beside all setting specific to batching inserts in MySQL, we need to set up in `application.properties` the following property: `spring.jpa.properties.hibernate.order_inserts=true`

**Example without ordered inserts:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootBatchInsertOrder/batch%20inserts%20including%20associations%20no%20order%20of%20inserts.png)

**Example with ordered inserts:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootBatchInsertOrder/batch%20inserts%20including%20associations%20ordered%20inserts.png)
